package src.com.app.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.app.POJO.Student_personal_informationPojo;
import com.app.POJO.studentPOJO;
import com.app.dao.StudentImplDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PresonalActionClass extends ActionSupport implements ModelDriven<Student_personal_informationPojo>,SessionAware {

	private Student_personal_informationPojo peronalPojoInstance;
	private Map<String, Object> map;
	private studentPOJO studentPojoInstance;
	
	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.map = map;
	}

	@Override
	public Student_personal_informationPojo getModel() {
		// TODO Auto-generated method stub
		peronalPojoInstance = new Student_personal_informationPojo();
		return peronalPojoInstance;
	}

	public Student_personal_informationPojo getPeronalPojoInstance() {
		return peronalPojoInstance;
	}

	public void setPeronalPojoInstance(
			Student_personal_informationPojo peronalPojoInstance) {
		this.peronalPojoInstance = peronalPojoInstance;
	}

	public studentPOJO getStudentPojoInstance() {
		return studentPojoInstance;
	}

	public void setStudentPojoInstance(studentPOJO studentPojoInstance) {
		this.studentPojoInstance = studentPojoInstance;
	}
	
	public String updatePersonalInfo()throws Exception
	{
		studentPojoInstance = (studentPOJO)map.get("valid_Student");
		System.out.println(studentPojoInstance);
		System.out.println(peronalPojoInstance);
		studentPojoInstance.setPresonalpojo(peronalPojoInstance);
		studentPojoInstance = new StudentImplDao().updateAddress(studentPojoInstance);
		if(studentPojoInstance != null){
			map.put("valid_Student", studentPojoInstance);
			addActionError("SuccessfullRegistration");
		return SUCCESS;
		}
		return ERROR;
	}


}
