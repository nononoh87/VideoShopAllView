package dap;

import java.util.Calendar;

public class Noh {

	public static void main(String[] args) {
		
		System.out.println("자신의 나이와 태어난 년도.");
		int year = 0;
		int age = 0;
		
		Calendar c = Calendar.getInstance();
		int Year = c.get(Calendar.YEAR);
		age = Year - 1987 + 1;

		Calendar n = Calendar.getInstance();
		Integer currentYear = n.get(Calendar.YEAR);
		year = currentYear - age + 1;

		System.out.println("age : " + age + ", " + "year : " + year);
	}
}