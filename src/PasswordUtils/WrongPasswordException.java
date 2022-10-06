package PasswordUtils;

public class WrongPasswordException extends Exception {
	private final String value;

	public String getValue() {
		return value;
	}

	public WrongPasswordException() {
		this.value = "";
	}

	public WrongPasswordException(String message, String value) {
		super(message);
		this.value = value;
	}
}
