package src.com.app.POJO;

import javax.persistence.*;

import antlr.collections.List;

@Entity
@Table(name="studmain")
public class studentPOJO {
	private int  studId;
	@Column(length=50)
    private String	studEmail;//                                           VARCHAR2(50)
	@Column(length=20)
    private String  firstname;//                                           VARCHAR2(50)
	@Column(length=20)
    private String  lastname;    //                                           VARCHAR2(50)
	@Column(length=20)
    private String  studPassword;
	@Column(length=20)
    private Student_personal_informationPojo presonalpojo;
	@Column(length=20)
    private AcademicsPojo academicPojo;
	@Column(length=20)
    private AddressPOJO addressPojo;
	@Column(length=20)
    private ExpriencePojo expriencePojo;
	@Column(length=20)
	@OneToMany(mappedBy="studentPojo")
	private java.util.List<SkillsPojo> skillPojo;
    
	public studentPOJO() {
		// TODO Auto-generated constructor stub
	}
    
	public studentPOJO(String studEmail, String firstname,
			String lastname, String studPassword) {
		super();
		this.studEmail = studEmail;
		this.firstname = firstname;
		this.lastname = lastname;
		this.studPassword = studPassword;
	}

	@Id
	@SequenceGenerator(name="studmain_generator",sequenceName="studmain_sequence")
	@GeneratedValue(generator="studmain_generator",strategy=GenerationType.SEQUENCE)
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	@Column(length=50)
	public String getStudEmail() {
		return studEmail;
	}
	
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	@Column(length=20)
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(length=20)
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(length=20)
	public String getStudPassword() {
		return studPassword;
	}
	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}

	@OneToOne(cascade=CascadeType.ALL) //mandatory
	@JoinColumn(name="address_id")//optional
    public AddressPOJO getAddressPojo() {
		return addressPojo;
	}

	public void setAddressPojo(AddressPOJO addressPojo) {
		this.addressPojo = addressPojo;
	}

	@OneToOne(cascade=CascadeType.ALL) //mandatory
	@JoinColumn(name="academic_id")//optional
	public AcademicsPojo getAcademicPojo() {
		return academicPojo;
	}

	public void setAcademicPojo(AcademicsPojo academicPojo) {
		this.academicPojo = academicPojo;
	}

	@OneToOne(cascade=CascadeType.ALL) //mandatory
	@JoinColumn(name="personal_id")//optional
	public Student_personal_informationPojo getPresonalpojo() {
		return presonalpojo;
	}

	public void setPresonalpojo(Student_personal_informationPojo presonalpojo) {
		this.presonalpojo = presonalpojo;
	}
	
	
	@OneToOne(cascade=CascadeType.ALL) //mandatory
	@JoinColumn(name="exprience_id")//optional
	public ExpriencePojo getExpriencePojo() {
		return expriencePojo;
	}

	public void setExpriencePojo(ExpriencePojo expriencePojo) {
		this.expriencePojo = expriencePojo;
	}


	StringBuilder sb = new StringBuilder(" Profile not yet supplied");

	@Override
	public String toString() {
		if (addressPojo != null)
			sb = new StringBuilder(addressPojo.toString());
		if (academicPojo != null)
			sb = new StringBuilder(academicPojo.toString());
		if (presonalpojo != null)
			sb = new StringBuilder(presonalpojo.toString());
		if (expriencePojo != null)
			sb = new StringBuilder(expriencePojo.toString());

/*		return "studentPOJO [studId=" + studId + ", studEmail=" + studEmail
				+ ", firstname=" + firstname + ", lastname=" + lastname
				+ ", studPassword=" + studPassword + ", presonalpojo="
				+ presonalpojo + ", academicPojo=" + academicPojo
				+ ", addressPojo=" + addressPojo + ", expriencePojo=" + expriencePojo + ", sb=" + sb + "]";
*/		
		return "First Name=" + firstname + "\n" +
				" Email=" + studEmail+ "" +
				" ";
	}

    
}