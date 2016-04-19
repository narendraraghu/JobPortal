package src.com.app.dao;

import java.util.ArrayList;
import org.hibernate.*;
import com.app.POJO.*;
import com.app.utilis.FresherBossterUtilis;

@SuppressWarnings("unchecked")
public class AdminImplDao implements AdminInterfaceDao {

	@Override
	public AdminPojo validateAdmin(String email, String password) {
		AdminPojo adminInstance = null;
		String hql = "select c from AdminPojo c where c.adminEmail = :em and c.adminPassword = :pw";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			adminInstance = (AdminPojo) session.createQuery(hql)
					.setParameter("em", email).setParameter("pw", password)
					.uniqueResult();
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return adminInstance;
	}

	@Override
	public ArrayList<studentPOJO> getAllStudents() {
		ArrayList<studentPOJO> studentList = null;
		String hql = "select c from studentPOJO c";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			studentList = (ArrayList<studentPOJO>) session.createQuery(hql)
					.list();
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return studentList;
	}

	@Override
	public String deleteStudent(int id) {
		int row = 0;
		String hql = "delete studentPOJO s where s.studId =:id";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			row = session.createQuery(hql).setParameter("id", id).executeUpdate();
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		System.out.println(row + " row deleted");
		return "deleted";
	}


	
	@Override
	public ArrayList<CompanyRegistrationPOJO> listAllCompanies() {
		ArrayList<CompanyRegistrationPOJO> companyList = null;
		String hql = "select c from CompanyRegistrationPOJO c";
		Session session = FresherBossterUtilis.getSession();
		Transaction tx = session.beginTransaction();
		try {
			companyList = (ArrayList<CompanyRegistrationPOJO>) session.createQuery(hql).list();
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return companyList;

	}

	@Override
	public String deleteCompany(String email) {
			int row = 0;
			String hql = "delete CompanyRegistrationPOJO s where s.email =:em";
			Session session = FresherBossterUtilis.getSession();
			Transaction tx = session.beginTransaction();
			try {
				row = session.createQuery(hql).setParameter("em", email).executeUpdate();
				tx.commit();
			} catch (HibernateException ex) {
				ex.printStackTrace();
				if (tx != null)
					tx.rollback();
			} finally {
				if (session != null)
					session.close();
			}
			System.out.println(row + " row deleted");
			return "deleted";
		}


	@Override
	public ArrayList<EventsPOJO> listAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEvent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FeedbackPOJO> listAllFeedback() {
		// TODO Auto-generated method stub
		return null;
	}

	
}