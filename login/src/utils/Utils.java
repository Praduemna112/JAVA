package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Exceptions.InvalidEmailException;
import models.Customer;
import models.ServicePlans;
import validationrules.ValidationRules;

public class Utils {

	public static Customer inputCustomer() throws ParseException, InvalidEmailException {

		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		String firstname = sc.next();
		String lastmname = sc.next();
		String email = sc.next();
		String password = sc.next();
		double registrationAmount = sc.nextDouble();

		SimpleDateFormat sf = new SimpleDateFormat("DD/MM/YYYY");
		Date dob = sf.parse(sc.next());

		ServicePlans servicePlan = ServicePlans.valueOf(sc.next());

		if (ValidationRules.patternMatches(email, Constants.EMAIL_REGEX)) {
			Customer c = new Customer(id, firstname, lastmname, email, password, registrationAmount, dob, servicePlan);
			return c;
		} else {
			throw new InvalidEmailException("Invalid Email");
		}
		
		
		
	}
}
