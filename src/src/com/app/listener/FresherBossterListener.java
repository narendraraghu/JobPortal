package src.com.app.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.app.utilis.FresherBossterUtilis;

/**
 * Application Lifecycle Listener implementation class FresherBossterListener
 *
 */
@WebListener
public class FresherBossterListener implements ServletContextListener {

 	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	FresherBossterUtilis.getFactory();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    	FresherBossterUtilis.getFactory().close();
    }
	
}
