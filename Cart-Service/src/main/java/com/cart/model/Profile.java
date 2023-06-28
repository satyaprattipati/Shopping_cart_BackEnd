package com.cart.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*
 *   Bean Validation
 */
@Document(collection = "profile")
public class Profile {
	@Id
	private String profileId;
	@NotNull(message = "First name should not be empty")
	@Size(min = 2, message = "First name should not be less than 2 characters")
	private String firstName;
	@NotNull(message = "Last name should not be empty")
	@Size(min = 2, message = "Last name should not be less than 2 characters")
	private String lastName;
	@NotNull(message = "Username should not be empty")
	@Size(min = 2, message = "Username should not be less than 2 characters")
	private String username;

	@NotNull(message = "Password should not be empty")

	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Password Should contain:\n1)a digit must occur at least once\n 2)a lower case letter must occur at least once\n\r\n 3)an upper case letter must occur at least once\n4)a special character must occur at least once\n\r\n5)no whitespace allowed in the entire string\n6)at least 8 characters")
	private String password;
	@Pattern(regexp = "\\d{10}", message = "Invalid contact details")
	private String contactNumber;
	private LocalDate date;
	@NotNull(message = "Email should not be empty")
	@Email(message = "Invalid E-mail Id")
	private String email;
	private String gender;
	private String role;

	public Profile() {

	}

	public Profile(String profileId,
			@NotNull(message = "First name should not be empty") @Size(min = 2, message = "First name should not be less than 2 characters") String firstName,
			@NotNull(message = "Last name should not be empty") @Size(min = 2, message = "Last name should not be less than 2 characters") String lastName,
			@NotNull(message = "Username should not be empty") @Size(min = 2, message = "Username should not be less than 2 characters") String username,
			@NotNull(message = "Password should not be empty") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Password Should contain:\n1)a digit must occur at least once\n 2)a lower case letter must occur at least once\n\r\n 3)an upper case letter must occur at least once\n4)a special character must occur at least once\n\r\n5)no whitespace allowed in the entire string\n6)at least 8 characters") String password,
			@Pattern(regexp = "\\d{10}", message = "Invalid contact details") String contactNumber, LocalDate date,
			@NotNull(message = "Email should not be empty") @Email(message = "Invalid E-mail Id") String email,
			String gender, String role) {
		super();
		this.profileId = profileId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.contactNumber = contactNumber;
		this.date = date;
		this.email = email;
		this.gender = gender;
		this.role = role;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", contactNumber=" + contactNumber + ", date=" + date
				+ ", email=" + email + ", gender=" + gender + ", role=" + role + "]";
	}

}

