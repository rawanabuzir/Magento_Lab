package oop;
import java.security.SecureRandom;
import java.util.Random;
public class Parameters {
	static String myURL = "https://magento.softwaretestingboard.com";
	static String firstName=generateFirstName(5);
	static String lastName=generateLasttName(5);
	static String myMail = firstName+ lastName + "@gmail.com";
	static String logInEmail=myMail;
	static String passWord = generatePassword(8);
	static String confiRm = passWord;
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";
	private static final String charactersnameone = "abcdefghijklmnopqrstuvwxyz";
	public static String generatePassword(int length) {
		StringBuilder password = new StringBuilder();
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			password.append(randomChar);
		}
		return password.toString();
	}
	public static String generateFirstName(int length) {
		StringBuilder fname = new StringBuilder();
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(charactersnameone.length());
			char randomChar =charactersnameone.charAt(randomIndex);
			fname.append(randomChar);
		}
		return fname.toString();
	}
	public static String generateLasttName(int length) {
		StringBuilder lname = new StringBuilder();
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(charactersnameone.length());
			char randomChar =charactersnameone.charAt(randomIndex);
			lname.append(randomChar);
		}
		return lname.toString();
	}
}