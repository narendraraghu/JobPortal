package src.com.app.POJO;

import javax.persistence.*;

@Entity
@Table(name="stud_address")
public class AddressPOJO {
	//private studentPOJO studId;
	private int address_id;
	private String Street;
	private String city;
	private String state;
	private int pincode;
	private String Country;
	
	public AddressPOJO() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressPOJO(String street, String city, String state, int pincode,
			String country) {
		super();
		Street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		Country = country;
	}



	@Id
	@SequenceGenerator(name="studaddress_generator",sequenceName="studaddress_sequence")
	@GeneratedValue(generator="studaddress_generator",strategy=GenerationType.SEQUENCE)
	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	@Column(length=20)
	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@Column(length=20)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(length=20)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(length=20)
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	/*@Column(length=20)
	public studentPOJO getStudId() {
		return studId;
	}*/

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "AddressPOJO [studId=" +  ", address_id=" + address_id
				+ ", Street=" + Street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
}
