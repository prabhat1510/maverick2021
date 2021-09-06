package main.java.jpatraining.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "air_passenger_profile")
public class AirPassengerProfile implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "profile_id")
	private String profileId;	
	@NotNull(message = "Password cannot be blank")
    @Size(min=6)
	@Column(name = "password")
	private String password;
	@NotNull(message = "First name cannot be blank")
    @Size(min=2)
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "address")
	private String address; 	
	@Range(min = 10,message ="Mobile number is a 10-digit number" )
	@Column(name = "mobile_number")
	private Long mobileNumber;
	@NotNull
    //@Email
    @Pattern(regexp = "^[a-zA-Z]+[a-zA-Z.0-9]*@[a-zA-Z]+([.][a-zA-Z]{2,3}){1,2}$",
    message = "Invalid emaiId")
    @Column(name="email_id")
	private String emailId;
	
	
	public AirPassengerProfile() {
		
	}


	public AirPassengerProfile(String profileId,
			@NotNull(message = "Password cannot be blank") @Size(min = 6) String password,
			@NotNull(message = "First name cannot be blank") @Size(min = 2) String firstName, String lastName,
			String address, Long mobileNumber, @NotNull @Email String emailId) {
		super();
		this.profileId = profileId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}


	public String getProfileId() {
		return profileId;
	}


	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "AirPassengerProfile [profileId=" + profileId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + "]";
	}
	
	

	
	
}
