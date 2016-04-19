package src.com.app.dao;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.POJO.CompanyLoginPOJO;
import com.app.POJO.CompanyRegistrationPOJO;
import com.app.POJO.JobPostPOJO;
import com.app.utilis.FresherBossterUtilis;;

public class CompanyImplDao implements CompanyInterfaceDao {

	@Override
	public CompanyLoginPOJO validationCompany(String email, String password) {
		String hql = "Select c from CompanyLoginPOJO c where c.email = :em and c.password = :pw";
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		CompanyLoginPOJO companypojoInstance = null;
		
		try 
		{
			companypojoInstance = (CompanyLoginPOJO)sessionInstance.createQuery(hql).setParameter("em", email).setParameter("pw", password).uniqueResult();
			tranctionInstance.commit();
		} 
		catch (HibernateException ex)
		{
			if(tranctionInstance != null)
				tranctionInstance.rollback();
		}
		finally
		{
			if(sessionInstance != null)
				sessionInstance.close();
		}
		
		return companypojoInstance;
	}

	@Override
	public CompanyRegistrationPOJO registerCompany(CompanyRegistrationPOJO company) {
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		try 
		{
			//Integer id = (Integer)sessionInstance.save(company);
			sessionInstance.save(company);
			//company.setCompanyId(id);
			tranctionInstance.commit();
		} 
		catch (HibernateException ex)
		{
			if(tranctionInstance != null)
				tranctionInstance.rollback();
		}
		finally
		{
			if(sessionInstance != null)
				sessionInstance.close();
		}
		return company;
	}

	public CompanyLoginPOJO loginCompany(CompanyLoginPOJO companyLogin) {
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		try 
		{
			//Integer id = (Integer)sessionInstance.save(company);
			sessionInstance.save(companyLogin);
			//company.setCompanyId(id);
			tranctionInstance.commit();
		} 
		catch (HibernateException ex)
		{
			if(tranctionInstance != null)
				tranctionInstance.rollback();
		}
		finally
		{
			if(sessionInstance != null)
				sessionInstance.close();
		}
		return companyLogin;
	}

	public JobPostPOJO postJob(JobPostPOJO post) {
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		try 
		{
			//Integer id = (Integer)sessionInstance.save(company);
			sessionInstance.save(post);
			//company.setCompanyId(id);
			tranctionInstance.commit();
		} 
		catch (HibernateException ex)
		{
			if(tranctionInstance != null)
				tranctionInstance.rollback();
		}
		finally
		{
			if(sessionInstance != null)
				sessionInstance.close();
		}
		return post;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<JobPostPOJO> getAllJobs(String email) {
		ArrayList<JobPostPOJO> jobList = null;
		String hql = "select c from JobPostPOJO c where c.email = :em";
		//String hqlCriteria = "select c from StudentPOJO c where c.academics in(select academicsstudid from AcademicsPojo where percentage >= 60)";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			jobList = (ArrayList<JobPostPOJO>)session.createQuery(hql).setParameter("em", email).list();
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return jobList;
	}

	public JobPostPOJO updateCompany(String jobid) {
		System.out.println("jobid in Dao : "+jobid);
		String hql = "Select c from JobPostPOJO c where c.jobid = :id";
		System.out.println("check");
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		JobPostPOJO job = null;
		
		try 
		{
			System.out.println("check2");
			job = (JobPostPOJO)sessionInstance.createQuery(hql).setParameter("id", jobid).uniqueResult();
			System.out.println("job in dao : "+job);
			tranctionInstance.commit();
		} 
		catch (HibernateException ex)
		{
			System.out.println("Exception occured");
			if(tranctionInstance != null)
				tranctionInstance.rollback();
		}
		finally
		{
			if(sessionInstance != null)
				sessionInstance.close();
		}
		
		return job;

	}

	public int deleteJob(String jobid) {
		int update = 0;
		String hql = "delete JobPostPOJO c where c.jobid = :id";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			update = session.createQuery(hql).setParameter("id", jobid).executeUpdate();
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return update;
	}

	public int updatedCompany(String jobid, String profile, String place, int experience, double salary, Date jobpostdate, String description, String industry) {
		int update = 0;
		String hql = "update JobPostPOJO c set c.profile = :pr, c.place = :pl, c.experience = :exp, c.salary = :sal, c.jobpostdate = :date, c.description = :des, c.industry = :ind where c.jobid = :id";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			update = session.createQuery(hql).setParameter("id", jobid).setParameter("pr", profile).setParameter("pl", place).setParameter("exp", experience).setParameter("sal", salary).setParameter("date", jobpostdate).setParameter("des", description).setParameter("ind", industry).executeUpdate();
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return update;
	}
}
