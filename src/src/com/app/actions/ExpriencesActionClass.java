package src.com.app.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.app.POJO.ExpriencePojo;
import com.app.POJO.studentPOJO;
import com.app.dao.StudentImplDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ExpriencesActionClass extends ActionSupport implements ModelDriven<ExpriencePojo>,SessionAware {
	
	private Map<String, Object> mapInstance;
	private studentPOJO studentPojoInstance;
	private ExpriencePojo expriencePojoInstance;
	
	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.mapInstance = map;
	}

	@Override
	public ExpriencePojo getModel() {
		// TODO Auto-generated method stub
		expriencePojoInstance = new ExpriencePojo();
		return expriencePojoInstance;
	}

	public studentPOJO getStudentPojoInstance() {
		return studentPojoInstance;
	}

	public void setStudentPojoInstance(studentPOJO studentPojoInstance) {
		this.studentPojoInstance = studentPojoInstance;
	}

	public ExpriencePojo getExpriencePojoInstance() {
		return expriencePojoInstance;
	}

	public void setExpriencePojoInstance(ExpriencePojo expriencePojoInstance) {
		this.expriencePojoInstance = expriencePojoInstance;
	}
	
	public String updateExprience()throws Exception
	{
		studentPojoInstance = (studentPOJO)mapInstance.get("valid_Student");
		System.out.println(studentPojoInstance);
		System.out.println(expriencePojoInstance);
		studentPojoInstance.setExpriencePojo(expriencePojoInstance);
		studentPojoInstance = new StudentImplDao().updateAcademic(studentPojoInstance);
		if(studentPojoInstance != null){
			mapInstance.put("valid_Student", studentPojoInstance);
			addActionError("SuccessfullRegistration");
		return SUCCESS;
		}
		return ERROR;
	}


}
