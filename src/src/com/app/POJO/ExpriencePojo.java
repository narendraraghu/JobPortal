package src.com.app.POJO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="stud_exprience")
public class ExpriencePojo implements Serializable {
	private int exprienceId;
	@Column(length=30)
	private String currentOrganization;
	@Column(length=30)
	private String designation;
	@Column(length=30)
	private String platformUsed;
	@Column(length=30)
	private String priviousOrganization;
	@Column(length=30)
	private Date doj;
	@Column(length=30)
	private Date dol;
	@Column(length=30)
	private Double currentCtc;
	
	public ExpriencePojo() {
		// TODO Auto-generated constructor stub
	}
	
	public ExpriencePojo(String currentOrganization, String designation,
			String platformUsed, String priviousOrganization, Date doj,
			Date dol, Double currentCtc) {
		super();
		this.currentOrganization = currentOrganization;
		this.designation = designation;
		this.platformUsed = platformUsed;
		this.priviousOrganization = priviousOrganization;
		this.doj = doj;
		this.dol = dol;
		this.currentCtc = currentCtc;
	}

	@Id
	@SequenceGenerator(name="studmain_generator",sequenceName="studmain_sequence")
	@GeneratedValue(generator="studmain_generator",strategy=GenerationType.SEQUENCE)
	public int getExprienceId() {
		return exprienceId;
	}

	public void setExprienceId(int exprienceId) {
		this.exprienceId = exprienceId;
	}

	public String getCurrentOrganization() {
		return currentOrganization;
	}

	public void setCurrentOrganization(String currentOrganization) {
		this.currentOrganization = currentOrganization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPlatformUsed() {
		return platformUsed;
	}

	public void setPlatformUsed(String platformUsed) {
		this.platformUsed = platformUsed;
	}

	public String getPriviousOrganization() {
		return priviousOrganization;
	}

	public void setPriviousOrganization(String priviousOrganization) {
		this.priviousOrganization = priviousOrganization;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDol() {
		return dol;
	}

	public void setDol(Date dol) {
		this.dol = dol;
	}

	public Double getCurrentCtc() {
		return currentCtc;
	}

	public void setCurrentCtc(Double currentCtc) {
		this.currentCtc = currentCtc;
	}

	@Override
	public String toString() {
		return "ExpriencePojo [exprienceId=" + exprienceId
				+ ", currentOrganization=" + currentOrganization
				+ ", designation=" + designation + ", platformUsed="
				+ platformUsed + ", priviousOrganization="
				+ priviousOrganization + ", doj=" + doj + ", dol=" + dol
				+ ", currentCtc=" + currentCtc + "]";
	}
	
	
}
