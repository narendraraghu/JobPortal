package src.com.app.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "adminmain")
public class AdminPojo {
	
	private int adminSourceId;
	
	@Column(length=30)
	private String adminEmail;
	
	@Column(length=15)
	private String adminPassword;

	public AdminPojo() {
		// TODO Auto-generated constructor stub
	}

	public AdminPojo(String adminEmail, String adminPassword) {
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}

	@Id
	@SequenceGenerator(name = "adminmain_generator", sequenceName = "adminmain_sequence")
	@GeneratedValue(generator = "adminmain_generator", strategy = GenerationType.SEQUENCE)
	public int getAdminSourceId() {
		return adminSourceId;
	}

	public void setAdminSourceId(int adminSourceId) {
		this.adminSourceId = adminSourceId;
	}
	
	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin -- adminSuorceId=" + adminSourceId + ", adminEmail="
				+ adminEmail + ", adminPassword=" + adminPassword ;
	}

}
