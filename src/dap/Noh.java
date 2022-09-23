package dap;

import java.util.Calendar;

public class Noh {

	public static void main(String[] args) {

		String id ="870128-1234567";
				String nai = id.substring(0, 2); 
				int nnai = Integer.parseInt(nai);	
				int age = 0;
				int year =(1900 + nnai);
				
				Calendar c = Calendar.getInstance();	
				int year1 =  c.get(Calendar.YEAR);
				age = year1 -(1900 + nnai) + 1;
				
				Calendar now = Calendar.getInstance();
				 Integer currentYear = now.get(Calendar.YEAR);
				
				System.out.println("age : " + age);
				System.out.println("year : " + year);
				}
	}