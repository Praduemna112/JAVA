package tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import enums.Colors;
import assignment2.ColorNotMatchException;
import assignment2.PollutionLevelException;
import static assignment2.ValidationRules.colorMatch;
import static assignment2.ValidationRules.pollutionlevel;;

public class MyVehicle {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		String chasiNo = sc.next();
		String uniqueId = sc.next();

		int price = sc.nextInt();
		String mDateString = sc.next();
		Date mDate = new SimpleDateFormat("dd/MM/yyyy").parse(mDateString);
		Date manufacturingDate = mDate;

		String iDateString = sc.next();
		Date iDate = new SimpleDateFormat("dd/MM/yyyy").parse(iDateString);
		Date insuranceExpDate = iDate;

		double pollutionLevel = sc.nextDouble();
		String color = sc.next();
		int km = sc.nextInt();

		int ch = 0;

		try {
			colorMatch(color);
		} catch (ColorNotMatchException e) {
			e.getMessage();
		}

		try {
			pollutionlevel(km);
		} catch (PollutionLevelException e) {
			e.getMessage();
		}

		System.out.println("Addeed");

	}

}
