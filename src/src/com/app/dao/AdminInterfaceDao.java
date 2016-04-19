package src.com.app.dao;

import java.util.ArrayList;

import com.app.POJO.*;

public interface AdminInterfaceDao {
	AdminPojo validateAdmin(String email, String password);
	ArrayList<studentPOJO> getAllStudents();
	String deleteStudent(int id);
	ArrayList<CompanyRegistrationPOJO> listAllCompanies();
	String deleteCompany(String email);
	ArrayList<EventsPOJO> listAllEvents();
	String deleteEvent(int id);
	ArrayList<FeedbackPOJO> listAllFeedback();
}
