package src.com.app.POJO;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="stud_academic")
public class AcademicsPojo implements Serializable {
//private studentPOJO studId;
private int adcademicsStudId;
@Column(length=20)
private String degree;
@Column(length=20)
private String Stream;
@Column(length=20)
private String noofbaclogs;
@Column(length=20)
private String schoolCollegeName;
@Column(length=20)
private String qualification;
@Column(length=20)
private int yearOfPassing;
@Column(length=20)
private String univercityName;
@Column(length=20)
private Double percentage;

public AcademicsPojo() {
	// TODO Auto-generated constructor stub
}


public AcademicsPojo(String degree, String stream, String noofbaclogs,
		String schoolCollegeName, String qualification, int yearOfPassing,
		String univercityName, Double percentage) {
	super();
	this.degree = degree;
	Stream = stream;
	this.noofbaclogs = noofbaclogs;
	this.schoolCollegeName = schoolCollegeName;
	this.qualification = qualification;
	this.yearOfPassing = yearOfPassing;
	this.univercityName = univercityName;
	this.percentage = percentage;
}


@Id
@SequenceGenerator(name="studacademic_generator",sequenceName="studacademic_sequence")
@GeneratedValue(generator="studacademic_generator",strategy=GenerationType.SEQUENCE)
public int getAdcademicsStudId() {
	return adcademicsStudId;
}

public void setAdcademicsStudId(int adcademicsStudId) {
	this.adcademicsStudId = adcademicsStudId;
}

@Column(length=20)
public String getSchoolCollegeName() {
	return schoolCollegeName;
}

public void setSchoolCollegeName(String schoolCollegeName) {
	this.schoolCollegeName = schoolCollegeName;
}

@Column(length=20)
public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

@Column(length=20)
public int getYearOfPassing() {
	return yearOfPassing;
}

public void setYearOfPassing(int yearOfPassing) {
	this.yearOfPassing = yearOfPassing;
}

@Column(length=20)
public String getUnivercityName() {
	return univercityName;
}

public void setUnivercityName(String univercityName) {
	this.univercityName = univercityName;
}

@Column(length=20)
public Double getPercentage() {
	return percentage;
}

public void setPercentage(Double percentage) {
	this.percentage = percentage;
}


//@Column(length=20)
//public studentPOJO getStudId() {
//	return studId;
//}

@Column(length=20)
public String getDegree() {
	return degree;
}


public void setDegree(String degree) {
	this.degree = degree;
}


@Column(length=20)
public String getStream() {
	return Stream;
}


public void setStream(String stream) {
	Stream = stream;
}


@Column(length=20)
public String getNoofbaclogs() {
	return noofbaclogs;
}


public void setNoofbaclogs(String noofbaclogs) {
	this.noofbaclogs = noofbaclogs;
}


@Override
public String toString() {
	return "AcademicsPojo [adcademicsStudId=" + adcademicsStudId + ", degree="
			+ degree + ", Stream=" + Stream + ", noofbaclogs=" + noofbaclogs
			+ ", schoolCollegeName=" + schoolCollegeName + ", qualification="
			+ qualification + ", yearOfPassing=" + yearOfPassing
			+ ", univercityName=" + univercityName + ", percentage="
			+ percentage + "]";
}





}
