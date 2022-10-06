package PasswordUtils;

public class Main {
	public static void main(String[] args) throws WrongPasswordException, WrongLoginException{
		String login = "IvanPro";
		String password="asdfghj1";
		String confirmPassword="asdfghj1";
		try {
		System.out.println(PasswordUtils.process(login, password, confirmPassword));
		} catch (WrongLoginException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
