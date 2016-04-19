package src.com.app.POJO;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="company_opning")
public class CompanyOpeningPojo {
	//private CompanyPojo companyId;
	private int companyOpeningId;
	private String studCriteria;
	private String jobPosition;
	private Double salaryOffered;
	private String joblocation;
	private Date lastDate;
	private int expriencerequired;
	
	public CompanyOpeningPojo() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyOpeningPojo(String studCriteria, String jobPosition,
			Double salaryOffered, String joblocation, Date lastDate,
			int expriencerequired) {
		super();
		this.studCriteria = studCriteria;
		this.jobPosition = jobPosition;
		this.salaryOffered = salaryOffered;
		this.joblocation = joblocation;
		this.lastDate = lastDate;
		this.expriencerequired = expriencerequired;
	}

	@Id
	@SequenceGenerator(name="companyopning_generator",sequenceName="companyopning_sequence")
	@GeneratedValue(generator="companyopning_generator",strategy=GenerationType.SEQUENCE)
	public int getCompanyOpeningId() {
		return companyOpeningId;
	}

	public void setCompanyOpeningId(int companyOpeningId) {
		this.companyOpeningId = companyOpeningId;
	}

	@Column(length=20)
	public String getStudCriteria() {
		return studCriteria;
	}

	public void setStudCriteria(String studCriteria) {
		this.studCriteria = studCriteria;
	}

	@Column(length=20)
	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	@Column(length=20)
	public Double getSalaryOffered() {
		return salaryOffered;
	}

	public void setSalaryOffered(Double salaryOffered) {
		this.salaryOffered = salaryOffered;
	}

	@Column(length=20)
	public String getJoblocation() {
		return joblocation;
	}

	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}

	@Temporal(TemporalType.DATE)
	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	@Column(length=20)
	public int getExpriencerequired() {
		return expriencerequired;
	}

	public void setExpriencerequired(int expriencerequired) {
		this.expriencerequired = expriencerequired;
	}

	//@Column(length=20)
	//public CompanyPojo getCompanyId() {
	//	return companyId;
	//}

	@Override
	public String toString() {
		return "CompanyOpeningPojo [companyId=" 
				+ ", companyOpeningId=" + companyOpeningId + ", studCriteria="
				+ studCriteria + ", jobPosition=" + jobPosition
				+ ", salaryOffered=" + salaryOffered + ", joblocation="
				+ joblocation + ", lastDate=" + lastDate
				+ ", expriencerequired=" + expriencerequired + "]";
	}
	
	
}
