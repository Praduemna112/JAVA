package validationrules;

import java.util.regex.Pattern;

public class ValidationRules {

//	public static boolean isValidEmail(String email) {
	// create the EmailValidator instance
//		EmailValidator validator = EmailValidator.getInstance();
//		// check for valid email addresses using isValid method
//		return validator.isValid(email);
//	}

	public static boolean patternMatches(String emailAddress, String regexPattern) {
		return Pattern.compile(regexPattern).matcher(emailAddress).matches();
	}
}
