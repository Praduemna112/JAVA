package assignment2;

import enums.Colors;

public class ValidationRules {

	public static double MAX_POLLUTION;
	public static double MAX_SPEED;

	static {
		MAX_POLLUTION = 50.0;
		MAX_SPEED = 50.0;
	}

	public static void pollutionlevel(double speed) throws PollutionLevelException {
		if (speed > MAX_SPEED) {
			throw new PollutionLevelException("You create too much pollution");
		}
	}

	public static void colorMatch(String col) throws ColorNotMatchException {
		boolean flag = false;
		for (Colors ele : Colors.values()) {
			if (ele.toString().equals(col)) {
				flag = true;
				break;
			}
		}
		if(flag == false) {
			throw new RuntimeException("Color not found");
		}
	}

}
