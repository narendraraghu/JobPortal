package src.com.app.POJO;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="stud_skill")
public class SkillsPojo implements Serializable {
	
	@ManyToOne
	@JoinColumn(name="studId")
	private studentPOJO studentPojo;
	
	@Id
	@SequenceGenerator(name="studmain_generator",sequenceName="studmain_sequence")
	@GeneratedValue(generator="studmain_generator",strategy=GenerationType.SEQUENCE)
	private int skills_id;
	@Column(length=20)
	private String skills;
	
	public SkillsPojo() {
		// TODO Auto-generated constructor stub
	}

	public SkillsPojo(String skills) {
		super();
		this.skills = skills;
	}

	public int getSkills_id() {
		return skills_id;
	}

	public void setSkills_id(int skills_id) {
		this.skills_id = skills_id;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "SkillsPojo [skills_id=" + skills_id + ", skills=" + skills
				+ "]";
	}
	
	
}
