package src.com.app.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.app.POJO.AcademicsPojo;
import com.app.POJO.studentPOJO;
import com.app.dao.StudentImplDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AcademicActionClass extends ActionSupport implements ModelDriven<AcademicsPojo>,SessionAware {

	private Map<String, Object> mapInstance;
	private AcademicsPojo validAcademics,academicsPojoInstance;
	private studentPOJO studentPojoInstance;
		
	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.mapInstance = map;
	}

	@Override
	public AcademicsPojo getModel() {
		// TODO Auto-generated method stub
		academicsPojoInstance = new AcademicsPojo();
		return academicsPojoInstance;
	}

	public studentPOJO getStudentPojoInstance() {
		return studentPojoInstance;
	}

	public void setStudentPojoInstance(studentPOJO studentPojoInstance) {
		this.studentPojoInstance = studentPojoInstance;
	}

	public AcademicsPojo getAcademicsPojoInstance() {
		return academicsPojoInstance;
	}

	public void setAcademicsPojoInstance(AcademicsPojo academicsPojoInstance) {
		this.academicsPojoInstance = academicsPojoInstance;
	}

	public AcademicsPojo getValidAcademics() {
		return validAcademics;
	}
	
	public String updateAcademic()throws Exception
	{
		studentPojoInstance = (studentPOJO)mapInstance.get("valid_Student");
		System.out.println(studentPojoInstance);
		System.out.println(academicsPojoInstance);
		studentPojoInstance.setAcademicPojo(academicsPojoInstance);
		studentPojoInstance = new StudentImplDao().updateAcademic(studentPojoInstance);
		if(studentPojoInstance != null){
			mapInstance.put("valid_Student", studentPojoInstance);
			addActionError("SuccessfullRegistration");
		return SUCCESS;
		}
		return ERROR;
	}
	
	/*public String registerAcademics( )throws Exception
	{
		validAcademics = new StudentImplDao().registerAcademic(academicsPojoInstance);
		if(validAcademics != null){
			mapInstance.put("valid_Academics", validAcademics);
			addActionError("SuccessfullRegistration");
		return SUCCESS;
		}
		return ERROR;
	}*/


}
