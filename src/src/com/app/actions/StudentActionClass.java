package src.com.app.actions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.app.sendmail.MailForm;
import com.app.sendmail.SendMail;

import com.app.POJO.JobPostPOJO;
import com.app.POJO.studentPOJO;
import com.app.dao.StudentImplDao;
import com.app.file.WriteFileClass;
import com.app.pdfcreator.PdfCreator;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class StudentActionClass extends ActionSupport implements ModelDriven<studentPOJO>,SessionAware,ServletRequestAware {

	private Map<String, Object> mapInstance;
	private studentPOJO studentPojoInstance,validStudent;
	private HttpServletRequest request;
	private File pic;
	private String picFileName,picContentType,uploadDest;
	private String eclipseDeployementFolder;
	
    private	WriteFileClass writeFileInstance;
    private PdfCreator pdfFileInstance;
    public StudentActionClass() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.mapInstance = map;
	}

	@Override
	public studentPOJO getModel() {
		studentPojoInstance = new studentPOJO();
		return studentPojoInstance;
	}

	public studentPOJO getStudentPojoInstance() {
		return studentPojoInstance;
	}

	public void setStudentPojoInstance(studentPOJO studentPojoInstance) {
		this.studentPojoInstance = studentPojoInstance;
	}

	public studentPOJO getValidStudent() {
		return validStudent;
	}

	public File getPic() {
		return pic;
	}

	public void setPic(File pic) {
		this.pic = pic;
	}

	public String getPicFileName() {
		return picFileName;
	}

	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}

	public String getPicContentType() {
		return picContentType;
	}

	public void setPicContentType(String picContentType) {
		this.picContentType = picContentType;
	}

	public String getUploadDest() {
		return uploadDest;
	}

	public void setUploadDest(String uploadDest) {
		this.uploadDest = uploadDest;
	}

	public String getEclipseDeployementFolder() {
		return eclipseDeployementFolder;
	}

	public void setEclipseDeployementFolder(String eclipseDeployementFolder) {
		this.eclipseDeployementFolder = eclipseDeployementFolder;
	}

	public String validateStudent()throws Exception
	{
		String email = studentPojoInstance.getStudEmail();
		String password = studentPojoInstance.getStudPassword();
		
		validStudent = new StudentImplDao().validationStudent(email, password);
		if(validStudent != null)
		{
			mapInstance.put("valid_Student", validStudent);
			return SUCCESS;
		}
		return ERROR;
	}

	public String logOut() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.invalidate();
		return SUCCESS;
	}

	
	public String registerStudent( )throws Exception
	{
		validStudent = new StudentImplDao().registerStudent(studentPojoInstance);
		if(validStudent != null){
			mapInstance.put("valid_Student", validStudent);
			addActionError("SuccessfullRegistration");
		return SUCCESS;
		}
		return ERROR;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}
	
	public HttpServletRequest getServletRequest()
	{
		return this.request;
	}
	
	public String dummy(){
		System.out.println("in dummy method.....");
		//String param  = (String)sessmap.get("provider");
		//HttpServletRequest req = null ;
		//String param =  req.getParameter("provider");
		String param = getServletRequest().getParameter("provider");
		System.out.println(param);
		validStudent = new StudentImplDao().dummyMthd(param);
		mapInstance.put("dummy",validStudent );
		//out.println(rtn);
		//out.flush();
		return SUCCESS;
	}

	public String uploadImage() throws FileNotFoundException
	{
		File dest=new File(uploadDest + ((studentPOJO)mapInstance.get("valid_Student")).getStudId() + ".png");
		File eclipseDeployedFile=new File(eclipseDeployementFolder + ((studentPOJO)mapInstance.get("valid_Student")).getStudId() + ".png");
		if(dest.exists())
			dest.delete();
		if(eclipseDeployedFile.exists())
			eclipseDeployedFile.delete();
		boolean sts=pic.renameTo(dest);
		System.out.println("eclipseDeployedFile = " + eclipseDeployedFile);
		if (sts){
			try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(dest));
					BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(eclipseDeployedFile));)
			{
				int b;
				while((b = in.read()) != -1)
				{
					//System.out.println("h");
					out.write(b);
				}
			}catch(Exception ex){
				System.out.println("exception in files." + ex);
				ex.printStackTrace();
			}
			return SUCCESS;
		}
		return ERROR;
	}

	public String filewritemethod()
	{
    	writeFileInstance = new WriteFileClass("E:/file");
    	try {
    		studentPojoInstance = (studentPOJO)mapInstance.get("valid_Student");
        	writeFileInstance.writeToFile(studentPojoInstance);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SUCCESS;
	}

	public String filePdfMethod()
	{
    	try {
    		studentPojoInstance = (studentPOJO)mapInstance.get("valid_Student");
        	pdfFileInstance = new PdfCreator();
        	pdfFileInstance.create(studentPojoInstance);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SUCCESS;
	}
	MailForm form;
	public String sendingMail()
	{
		System.out.println("In sendingMail method ....");
		//if(id != 0)
		System.out.println(studentPojoInstance);
		studentPojoInstance = new StudentImplDao().getStudentPassword(studentPojoInstance.getStudEmail());
		System.out.println(studentPojoInstance);
		/*form =new MailForm();
		form.setFrom(request.getParameter("from"));
		form.setMessage(request.getParameter("message"));
		System.out.println("aaya"+request.getParameter("studEmail"));
		form.setTo(request.getParameter("studEmail"));
		form.setSubject(request.getParameter("subject"));
		form.setSmtpServ("smtp.gmail.com");*/

			new SendMail(studentPojoInstance);
			return SUCCESS;
		//return ERROR;
	}
	
	public String listAllJobs()
	{
		ArrayList<JobPostPOJO> jobList = (ArrayList<JobPostPOJO>) new StudentImplDao().listAllJobs();
		if(jobList != null){
			mapInstance.put("job_list", jobList);
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String listJobsPlaceWise()
	{
		String place = request.getParameter("place");
		ArrayList<JobPostPOJO> jobList = (ArrayList<JobPostPOJO>) new StudentImplDao().listJobsPlaceWise(place);
		if(jobList != null){
			mapInstance.put("job_list", jobList);
			return SUCCESS;
		}
		return ERROR;
	}


}
