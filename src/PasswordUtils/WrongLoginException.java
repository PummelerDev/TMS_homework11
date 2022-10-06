package PasswordUtils;

public class WrongLoginException extends Exception {

	private final String value;

	public String getValue() {
		return value;
	}

	public WrongLoginException() {
		this.value = "";
	}

	public WrongLoginException(String message, String value) {
		super(message);
		this.value = value;
	}
}
