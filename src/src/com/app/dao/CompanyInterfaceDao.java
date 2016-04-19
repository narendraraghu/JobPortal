package src.com.app.dao;

import java.util.ArrayList;

import com.app.POJO.CompanyLoginPOJO;
import com.app.POJO.CompanyRegistrationPOJO;
import com.app.POJO.JobPostPOJO;

public interface CompanyInterfaceDao {
	CompanyLoginPOJO loginCompany(CompanyLoginPOJO companyLogin);
	CompanyLoginPOJO validationCompany(String email, String password);
	CompanyRegistrationPOJO registerCompany(CompanyRegistrationPOJO company);
	JobPostPOJO postJob(JobPostPOJO post);
	ArrayList<JobPostPOJO> getAllJobs(String email);
}
