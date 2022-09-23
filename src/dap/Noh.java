package dap;

import java.util.Calendar;

public class Noh {

	public static void main(String[] args) {

		int age = 0;
		int year = 0;

		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		age = currentYear - 1987 + 1;

		Calendar n = Calendar.getInstance();
		Integer currentYear1 = n.get(Calendar.YEAR);
		year = currentYear1 - age + 1;

		System.out.println("age : " + age + ", " + "year : " + year);
	}
}