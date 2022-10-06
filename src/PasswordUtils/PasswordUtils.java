package PasswordUtils;

public class PasswordUtils {

	public static boolean process(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException, NullPointerException {
		boolean flag = true;
		if (login.length() > 20 || login.contains("\s")) {
			flag = false;
			String message = "incorrect login";
			throw new WrongLoginException(message, login);
		}
		if (password == null) {
			flag = false;
			throw new NullPointerException();
		}
		if (password.length() > 20 || password.contains("\s") || password.replaceAll("[a-zA-Z]", "").isEmpty()
				|| password.replaceAll("[0-9]", "").isEmpty()) {
			flag = false;
			String message = "incorrect password";
			throw new WrongPasswordException(message, password);
		}
		if (!password.equals(confirmPassword)) {
			flag = false;
			String value = confirmPassword.replace(password, "");
			String message = "confirm invalid";
			throw new WrongPasswordException(message, value);
		}
		return flag;
	}

}
