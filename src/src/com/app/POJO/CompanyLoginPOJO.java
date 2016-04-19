package src.com.app.POJO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="CompanyLoginTable")
public class CompanyLoginPOJO implements Serializable{
	
		@Id
		@Column(length=25)
		private String email;
		
		@Column(length=20)
		private String password;
		
		@OneToOne
	    @PrimaryKeyJoinColumn
	    private CompanyRegistrationPOJO companyRegistrationPOJO;
		
		public CompanyLoginPOJO(){
			System.out.println("In company login pojo");
		}
		//constructor
		public CompanyLoginPOJO(String email, String password) {
			this.email = email;
			this.password = password;
			System.out.println("LoginPojo created");
		}
		
		public String getEmail() {
			return email;
		}

		//setter of email
		public void setEmail(String email) {
			System.out.println("setEmail()");
			this.email = email;
		}

		//getter of password
		public String getPassword() {
			return password;
		}
		
		//setter of password
		public void setPassword(String password) {
			System.out.println("setPassword()");
			this.password = password;
		}

		@Override
		public String toString() {
			return email;
		}
}
