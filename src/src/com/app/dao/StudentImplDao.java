package src.com.app.dao;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.POJO.AcademicsPojo;
import com.app.POJO.ImageWapperPojo;
import com.app.POJO.JobPostPOJO;
import com.app.POJO.studentPOJO;
import com.app.utilis.FresherBossterUtilis;

public class StudentImplDao implements StudentInterfaceDao {

	@Override
	public studentPOJO validationStudent(String email, String password) {
		// TODO Auto-generated method stub
		String hql = "Select c from studentPOJO c where c.studEmail =:em and c.studPassword =:pw";
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		studentPOJO studentpojoInstance = null;
		
		try 
		{
			studentpojoInstance = (studentPOJO)sessionInstance.createQuery(hql).setParameter("em", email).setParameter("pw", password).uniqueResult();
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
		System.out.println(studentpojoInstance);
		return studentpojoInstance;
	}

	@Override
	public studentPOJO registerStudent(studentPOJO s) {
		// TODO Auto-generated method stub
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		try 
		{
			Integer id = (Integer)sessionInstance.save(s);
			s.setStudId(id);
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
		

		return s;
	}

	public studentPOJO dummyMthd(String str) {
		System.out.println(str);
		// TODO Auto-generated method stub
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		String hql = "Select c from studentPOJO c where c.firstname =:na";
		studentPOJO studentpojoInstance = null;
		
		try 
		{
			studentpojoInstance = (studentPOJO)sessionInstance.createQuery(hql).setParameter("na", str).uniqueResult();
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
		
System.out.println(studentpojoInstance);
		return studentpojoInstance;
	}

	@Override
	public AcademicsPojo registerAcademic(AcademicsPojo a) {
		// TODO Auto-generated method stub
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		try 
		{
			Integer id = (Integer)sessionInstance.save(a);
			a.setAdcademicsStudId(id);
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
		

		return a;
	}

	@Override
	public studentPOJO updateAddress(studentPOJO c) {
		// TODO Auto-generated method stub
		System.out.println("i/p cust "+c);
		Session sess = FresherBossterUtilis.getSession();
		Transaction tx = sess.beginTransaction();
		try {
			System.out.println("begin "+sess);
			sess.update(c);
			System.out.println("after update "+sess);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}

		return c;
	}

	public studentPOJO updateAcademic(studentPOJO c) {
		// TODO Auto-generated method stub
		System.out.println("i/p cust "+c);
		Session sess = FresherBossterUtilis.getSession();
		Transaction tx = sess.beginTransaction();
		try {
			System.out.println("begin "+sess);
			sess.update(c);
			System.out.println("after update "+sess);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}

		return c;
	}

	@Override
	public studentPOJO updatePersonalInfo(studentPOJO c) {
		// TODO Auto-generated method stub
		System.out.println("i/p cust "+c);
		Session sess = FresherBossterUtilis.getSession();
		Transaction tx = sess.beginTransaction();
		try {
			System.out.println("begin "+sess);
			sess.update(c);
			System.out.println("after update "+sess);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}

		return c;
	}

	@Override
	public studentPOJO registerImage(studentPOJO c) {
		// TODO Auto-generated method stub
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		ImageWapperPojo imgNew = (ImageWapperPojo)sessionInstance.get(ImageWapperPojo.class, 1);
		byte[] bAvatar = imgNew.getData();
		 
		try{
		    FileOutputStream fos = new FileOutputStream("C:\temp\test.png");
		    fos.write(bAvatar);
		    tranctionInstance.commit();
		    fos.close();
		}catch(Exception e){
		    e.printStackTrace();
		}
		finally
		{
			if(sessionInstance != null)
				sessionInstance.close();
		}
		

		return c;
	}

	@Override
	public studentPOJO uploadImage(studentPOJO c) {
		// TODO Auto-generated method stub
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		
		ImageWapperPojo imgNew = (ImageWapperPojo)sessionInstance.get(ImageWapperPojo.class, 1);
		byte[] bAvatar = imgNew.getData();
		 
		try{
		    FileOutputStream fos = new FileOutputStream("C:\temp\test.png");
		    fos.write(bAvatar);
		    fos.close();
		}catch(Exception e){
		    e.printStackTrace();
		}	
	return c;	
	}
	
	public studentPOJO getStudentPassword(String email) {
		// TODO Auto-generated method stub
		String hql = "Select c from studentPOJO c where c.studEmail =:em";
		Session sessionInstance = FresherBossterUtilis.getSession();
		Transaction tranctionInstance = sessionInstance.beginTransaction();
		studentPOJO studentpojoInstance = null;
		
		try 
		{
			studentpojoInstance = (studentPOJO)sessionInstance.createQuery(hql).setParameter("em", email).uniqueResult();
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
		System.out.println(studentpojoInstance);
		return studentpojoInstance;
	}

	public List<JobPostPOJO> listAllJobs() {
		String hql = "select j from JobPostPOJO j";
		ArrayList<JobPostPOJO> jobList = null; 
		Session sess = FresherBossterUtilis.getSession();
		Transaction tx = sess.beginTransaction();
		try {
			jobList = (ArrayList<JobPostPOJO>) sess.createQuery(hql).list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return jobList;
	}
	
	public ArrayList<JobPostPOJO> listJobsPlaceWise(String place) {
		String hql = "select j from JobPostPOJO j where j.place=:plc";
		ArrayList<JobPostPOJO> jobList = null; 
		Session sess = FresherBossterUtilis.getSession();
		Transaction tx = sess.beginTransaction();
		try {
			jobList = (ArrayList<JobPostPOJO>) sess.createQuery(hql).setParameter("plc", place).list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return jobList;
	}

	
}
