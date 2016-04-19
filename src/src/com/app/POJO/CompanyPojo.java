package src.com.app.POJO;

import javax.persistence.*;

@Entity
@Table(name="companymain")
public class CompanyPojo {
	private int companyId;
	private String companyEmail;
	private String companyPassword;
	private CompanyOpeningPojo companyOpeningPojo;
	
	public CompanyPojo() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyPojo(String companyEmail,
			String companyPassword) {
		super();
		this.companyEmail = companyEmail;
		this.companyPassword = companyPassword;
	}

	@Id
	@SequenceGenerator(name="companymain_generator",sequenceName="companymain_sequence")
	@GeneratedValue(generator="companymain_generator",strategy=GenerationType.SEQUENCE)
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(length=20)
	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	@Column(length=20)
	public String getCompanyPassword() {
		return companyPassword;
	}

	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}

	@OneToOne(cascade=CascadeType.ALL) //mandatory
	@JoinColumn(name="company_opening_id")//optional
	public CompanyOpeningPojo getCompanyOpeningPojo() {
		return companyOpeningPojo;
	}

	public void setCompanyOpeningPojo(CompanyOpeningPojo companyOpeningPojo) {
		this.companyOpeningPojo = companyOpeningPojo;
	}

	@Override
	public String toString() {
		return "CompanyPojo [companyId=" + companyId + ", companyEmail="
				+ companyEmail + ", companyPassword=" + companyPassword + "]";
	}
	
	
}
