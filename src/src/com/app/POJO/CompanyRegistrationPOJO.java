package src.com.app.POJO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="CompanyRegistrationTable")
public class CompanyRegistrationPOJO implements Serializable{
	@Id
	@Column(length=25)
	private String email;
	@Column(length=20)
	private String password;
	@Column(length=20)
	private String companyName;
	@Column(length=20)
	private String state;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String contactPerson;
	@Column(length=20)
	private long contactNumber;
	@Column(length=11)
	private String industry;
	
	@OneToOne(mappedBy="companyRegistrationPOJO", cascade=CascadeType.ALL)
	private CompanyLoginPOJO companyLoginPOJO;
	
	//----------->> 4
	public CompanyRegistrationPOJO(){
		System.out.println("In company registration pojo");
	}
	//Constructor to initialize fields
	public CompanyRegistrationPOJO(String email, String password, String companyName,
			String state, String city, String contactPerson, int contactNumber,
			String industry) {
		this.email = email;
		this.password = password;
		this.companyName = companyName;
		this.state = state;
		this.city = city;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.industry = industry;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		System.out.println("setEmail() called");
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword() called");
		this.password = password;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		System.out.println("setComapnyName() called");
		this.companyName = companyName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("setState() called");
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setCity() called");
		this.city = city;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}
	
	public void setContactPerson(String contactPerson) {
		System.out.println("setContactPerson() called");
		this.contactPerson = contactPerson;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		System.out.println("setIndustry() called");
		this.industry = industry;
	}

	public CompanyLoginPOJO getCompanyLoginPOJO() {
		return companyLoginPOJO;
	}
	
	public void setCompanyLoginPOJO(CompanyLoginPOJO companyLoginPOJO) {
		System.out.println("setCOmapnyLoginPOJO called");
		this.companyLoginPOJO = companyLoginPOJO;
	}
	@Override
	public String toString() {
		return "CompanyRegistration details [email=" + email + ", password="
				+ password + ", companyName=" + companyName + ", state=" + state + ", city="
				+ city + ", contactPerson=" + contactPerson
				+ ", contactNumber=" + contactNumber + ", industry=" + industry + ", " +
				"companylogin=" + companyLoginPOJO + "]";
	}	
}
