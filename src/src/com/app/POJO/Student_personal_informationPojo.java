package src.com.app.POJO;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="stud_personal_info")
public class Student_personal_informationPojo {
//	private studentPOJO studId;
	private int personalStudId;
	@Column(length=20)
	private String fatherName;
	@Column(length=20)
	private Date dob;
	@Column(length=20)
	private String languageKnown;
	@Column(length=20)
	private String maritalStatus;
	@Column(length=20)
	private String sex;
	@Column(length=20)
	private String strength;
	
	public Student_personal_informationPojo() {
		// TODO Auto-generated constructor stub
	}
	
	public Student_personal_informationPojo(String fatherName, Date dob,
			String languageKnown, String maritalStatus, String sex,
			String strength) {
		super();
		this.fatherName = fatherName;
		this.dob = dob;
		this.languageKnown = languageKnown;
		this.maritalStatus = maritalStatus;
		this.sex = sex;
		this.strength = strength;
	}

	@Id
	@SequenceGenerator(name="studpersonal_generator",sequenceName="studpersonal_sequence")
	@GeneratedValue(generator="studpersonal_generator",strategy=GenerationType.SEQUENCE)
	public int getPersonalStudId() {
		return personalStudId;
	}

	public void setPersonalStudId(int personalStudId) {
		this.personalStudId = personalStudId;
	}

	@Column(length=20)
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Temporal(TemporalType.DATE)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(length=20)
	public String getLanguageKnown() {
		return languageKnown;
	}

	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}

	@Column(length=20)
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(length=20)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(length=20)
	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	//@Column(length=20)
	//public studentPOJO getStudId() {
	//	return studId;
	//}

	@Override
	public String toString() {
		return "Student_personal_informationPojo [studId=" 
				+ ", personalStudId=" + personalStudId + ", fatherName="
				+ fatherName + ", dob=" + dob + ", languageKnown="
				+ languageKnown + ", maritalStatus=" + maritalStatus + ", sex="
				+ sex + ", strength=" + strength + "]";
	}
	
	
}     
