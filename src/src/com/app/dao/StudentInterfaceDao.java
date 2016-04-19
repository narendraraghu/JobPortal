package src.com.app.dao;

import com.app.POJO.AcademicsPojo;
import com.app.POJO.studentPOJO;

public interface StudentInterfaceDao {
	studentPOJO validationStudent(String email, String password);
	studentPOJO registerStudent(studentPOJO s);
	studentPOJO dummyMthd(String str);
	AcademicsPojo registerAcademic(AcademicsPojo a);
	studentPOJO updateAcademic(studentPOJO c);
	studentPOJO updateAddress(studentPOJO c);
	studentPOJO updatePersonalInfo(studentPOJO c);
	studentPOJO registerImage(studentPOJO c);
	studentPOJO uploadImage(studentPOJO c);
	
}
