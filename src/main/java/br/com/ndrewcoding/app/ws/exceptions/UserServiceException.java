package br.com.ndrewcoding.app.ws.exceptions;

public class UserServiceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4115437247782005806L;

	public UserServiceException(String message) {
		super(message);
	}
}
