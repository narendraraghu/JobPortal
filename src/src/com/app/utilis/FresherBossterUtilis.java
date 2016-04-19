package src.com.app.utilis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FresherBossterUtilis {

	public static SessionFactory factory;
	
	static
	{
		Configuration cfg = new Configuration().configure();
		
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		
		factory = cfg.buildSessionFactory(sr);
		
		System.out.println("sessionfactory get created");
	}
	
	public static SessionFactory getFactory()
	{
		return factory;
	}
	
	public static Session getSession()
	{
		return factory.openSession();
	}


	
}
