package src.com.app.actions;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.*;

import org.apache.struts2.interceptor.*;

import com.app.POJO.*;
import com.app.dao.AdminImplDao;
import com.opensymphony.xwork2.*;

public class AdminActionClass extends ActionSupport implements
		ModelDriven<AdminPojo>, SessionAware, ServletRequestAware,
		ServletResponseAware {
	private Map<String, Object> adminMap;
	private AdminPojo adminInstance, validAdmin;
	private ArrayList<studentPOJO> studList = null;
	private ArrayList<CompanyRegistrationPOJO> companyList = null;
	private ArrayList<EventsPOJO> eventList = null;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private HttpSession session;
	private String percentage;	

	@Override
	public void setSession(Map<String, Object> map) {
		this.adminMap = map;
	}

	@Override
	public void setServletRequest(HttpServletRequest rqst) {
		this.request = rqst;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public AdminPojo getModel() {
		adminInstance = new AdminPojo();
		return adminInstance;
	}

	@Override
	public void validate() {
	if(percentage !=null)
	{
		Double percent = 0.0;
		String actionName = ActionContext.getContext().getName();		
		if (actionName.equals("admin_process_login") || actionName.equals("admin_process_login"))
			return;
		
		if(percentage.length() == 0){
			addFieldError("percentage","Percentage Empty");
		}
		
		if(percentage.length() != 0){
			percent = Double.parseDouble(percentage);
		}
		
		else if(percent <= 0.0 || percent > 100){
			addFieldError("percentage", "Range in 1 - 100");			
		}
	}
	}

	public String validateAdmin() throws Exception {
		System.out.println("Inside validate admin of action class");
		System.out.println("state of the admin : " + adminInstance);
		validAdmin = new AdminImplDao()
				.validateAdmin(adminInstance.getAdminEmail(),
						adminInstance.getAdminPassword());
		System.out.println(validAdmin);
		if (validAdmin != null) {
			System.out.println(validAdmin);
			adminMap.put("valid_Admin", validAdmin);
			return SUCCESS;
		}
		return ERROR;
	}

	public String studentList() {
		response.setHeader("Cache-Control", "no-store");
		session = request.getSession();
		if (session.isNew()) {
			response.setHeader("Refresh","URL='/admin/login.jsp'");
		}
		double percent = Double.parseDouble(request.getParameter("percentage"));
		System.out.println("Percent by admin is : " + percent);
		studList = null;
		studList = new AdminImplDao().getAllStudents();
		ArrayList<studentPOJO> studListCriteria = new ArrayList<>();
		System.out.println("After returning to the action from dao");
		if (studList != null) {
			for (studentPOJO student : studList) {
				if(student.getAcademicPojo() != null){
					System.out.println(student+""+student.getAcademicPojo().getPercentage());
					if (student.getAcademicPojo().getPercentage() >= percent) {
						studListCriteria.add(student);
					}
				}
			}
			if(studListCriteria != null)
				studList = studListCriteria;
			adminMap.put("stud_list", studList);
			return SUCCESS;
		}
		System.out.println("studList is null");
		return ERROR;
	}

	public String logoutAdmin() {
		session = request.getSession();
		session.invalidate();
		return SUCCESS;
	}
	
	public String listAllStudents(){
		studList = null;
		studList = new AdminImplDao().getAllStudents();
		if(studList != null){
			System.out.println("stud list  :  "+studList);
			adminMap.put("stud_list", studList);
			return SUCCESS;
		}
		return ERROR;
	}

	public String deleteStudent(){
		int id = Integer.parseInt(request.getParameter("id"));
		String message = new AdminImplDao().deleteStudent(id);
		return SUCCESS;
	}
	
	public String listAllCompanies(){
		companyList = null;
		companyList = new AdminImplDao().listAllCompanies();
		if(companyList != null){
			System.out.println("company list  :  "+companyList);
			adminMap.put("company_list", companyList);
			return SUCCESS;
		}
		return ERROR;
	}

	public String deleteCompany(){
		String email = request.getParameter("id");
		String message = new AdminImplDao().deleteCompany(email);
		return SUCCESS;
	}
	
	
	public String listAllEvents(){
		return ERROR;
	}

	public String deleteEvent(){
		return SUCCESS;
	}
	
	public String listAllFeedback(){
		return ERROR;
	}

	public String deleteFeedback(){
		return SUCCESS;
	}
	
	public ArrayList<studentPOJO> getStudList() {
		return studList;
	}

	public void setStudList(ArrayList<studentPOJO> studList) {
		this.studList = studList;
	}	
	
	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

}