package br.com.ndrewcoding.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {
	@NotNull(message = "First name is missing! It cannot be null!")
	@Size(min=2, message = "First name must have at least 2 characters!")
	private String firstName;
	@NotNull(message = "Last name is missing! It cannot be null!")
	@Size(min=2, message = "Last name must have at least 2 characters!")
	private String lastName;

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
}
