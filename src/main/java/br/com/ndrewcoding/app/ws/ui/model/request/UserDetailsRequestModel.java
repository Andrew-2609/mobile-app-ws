package br.com.ndrewcoding.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	@NotNull(message = "First name is missing! It cannot be null!")
	@Size(min=2, message = "First name must have at least 2 characters!")
	private String firstName;
	@NotNull(message = "Last name is missing! It cannot be null!")
	@Size(min=2, message = "Last name must have at least 2 characters!")
	private String lastName;
	@NotNull(message = "E-mail is missing! It cannot be null!")
	@Email
	private String email;
	@NotNull(message = "Password is missing! It cannot be null!")
	@Size(min = 8, max = 16, message = "The password must have between 8 and 16 characters")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
