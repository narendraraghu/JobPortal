package src.com.app.sendmail;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.SessionAware;


import com.app.POJO.studentPOJO;



@SuppressWarnings("serial")
public class SendMail extends HttpServlet implements SessionAware
{
	private studentPOJO stud;
	private Map<String, Object> mapInstance;
	public SendMail(studentPOJO stud) {
		// TODO Auto-generated constructor stub
		this.stud = stud;		
		System.out.println("hiii"+this.stud);		
		sendMail(this.stud);
	}

public int sendMail(studentPOJO stud){
    try
    {
    	Properties props = System.getProperties();
        // -- Attaching to default Session, or we could start a new one --
        props.put("mail.transport.protocol", "smtp" );
        props.put("mail.smtp.starttls.enable","true" );
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.auth", "true" );
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
		 props.put("mail.smtp.starttls.enable", "true");
		 
		 Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getInstance(props, auth);
        // -- Create a new message --
        Message msg = new MimeMessage(session);
        // -- Set the FROM and TO fields --
/*        System.out.println("recepient" + form.getTo());*/
        msg.setFrom(new InternetAddress("smita@sunbeaminfo.com"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.stud.getStudEmail(), false));
/*        msg.setSubject(form.getSubject());
        msg.setText(form.getMessage());*/
          msg.setSubject("Password information");
          msg.setText("Your Pasword is :\nYour username :"+stud.getStudEmail()+"\npassword: "+stud.getStudPassword()+" ");
          // -- Set some other header information --
          msg.setHeader("MyMail", "Mr. XYZ" );
          msg.setSentDate(new Date());
          // -- Send the message --
          Transport.send(msg);
          System.out.println("Message sent to"+ this.stud.getStudEmail()+" OK." );
          return 0;
    }
     catch (Exception ex)
    {
      ex.printStackTrace();
      System.out.println("Exception "+ex);
      return -1;
    }
}
private class SMTPAuthenticator extends javax.mail.Authenticator {
    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        String username =  "deepakrajput04091990@gmail.com";           // specify your email id here (sender's email id)
        String password = "sam.DEEPU123456";                                      // specify your password here
        return new PasswordAuthentication(username, password);
    }
}
@Override
public void setSession(Map<String, Object> map) {
	// TODO Auto-generated method stub
	this.mapInstance = map; 
}
}

