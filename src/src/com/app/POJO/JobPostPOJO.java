package src.com.app.POJO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="JobPostTable")
public class JobPostPOJO implements Serializable{
	//fields related to job post
	@Id
	@Column(length=10)
	private String jobid;
	@Column(length=30)
	private String profile;
	@Column(length=30)
	private String place;
	@Column(length=2)
	private int experience;
	@Column(length=10)
	private double salary;
	private Date jobpostdate;
	@Column(length=100)
	private String description;
	@Column(length=20)
	private String industry;
	@Column(length=25)
	private String email;
	
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		System.out.println("jobid");
		this.jobid = jobid;
	}
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Date getJobpostdate() {
		return jobpostdate;
	}
	public void setJobpostdate(Date jobpostdate) {
		this.jobpostdate = jobpostdate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return " [jobid=" + jobid + ", profile=" + profile
				+ ", place=" + place + ", experience=" + experience
				+ ", salary=" + salary + ", jobpostdate=" + jobpostdate
				+ ", description=" + description + ", industry=" + industry
				+ ", email=" + email + "]";
	}
	
	
}
