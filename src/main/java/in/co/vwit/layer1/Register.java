package in.co.vwit.layer1;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class Register {
	
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	
	
	@Column(name="mobileNo")
	private int mobileNo;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="year_of_completion")
	private String year_of_completion;
	

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(String name, String email, int mobileNo, String city, String state, LocalDate dob,
			String qualification, String year_of_completion) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.state = state;
		this.dob = dob;
		this.qualification = qualification;
		this.year_of_completion = year_of_completion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYear_of_completion() {
		return year_of_completion;
	}

	public void setYear_of_completion(String year_of_completion) {
		this.year_of_completion = year_of_completion;
	}
	
	

}
