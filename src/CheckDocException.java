
public class CheckDocException extends Exception {

	/**
	* 
	*/
	private final String value;

	public String getValue() {
		return value;
	}

	public CheckDocException(String message, String value) {
		super(message);
		this.value = value;
	}
}
