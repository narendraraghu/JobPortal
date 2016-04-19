package src.com.app.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.app.POJO.AddressPOJO;
import com.app.POJO.studentPOJO;
import com.app.dao.StudentImplDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddressActionClass extends ActionSupport implements ModelDriven<AddressPOJO>,SessionAware {

	private AddressPOJO addressPojoInstance;
	private Map<String, Object> mapInstance;
	private studentPOJO studentPojoInstance;
	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.mapInstance = map;
	}

	@Override
	public AddressPOJO getModel() {
		// TODO Auto-generated method stub
		addressPojoInstance = new AddressPOJO();
		return addressPojoInstance;
	}

	public String updateAddress()throws Exception
	{
		studentPojoInstance = (studentPOJO)mapInstance.get("valid_Student");
		System.out.println(studentPojoInstance);
		System.out.println(addressPojoInstance);
		studentPojoInstance.setAddressPojo(addressPojoInstance);
		studentPojoInstance = new StudentImplDao().updateAddress(studentPojoInstance);
		if(studentPojoInstance != null){
			mapInstance.put("valid_Student", studentPojoInstance);
			addActionError("SuccessfullRegistration");
		return SUCCESS;
		}
		return ERROR;
	}

	public AddressPOJO getAddressPojoInstance() {
		return addressPojoInstance;
	}

	public void setAddressPojoInstance(AddressPOJO addressPojoInstance) {
		this.addressPojoInstance = addressPojoInstance;
	}

	public studentPOJO getStudentPojoInstance() {
		return studentPojoInstance;
	}

	public void setStudentPojoInstance(studentPOJO studentPojoInstance) {
		this.studentPojoInstance = studentPojoInstance;
	}

}
