package basic1;

import java.util.Scanner;

public class Ex02_control04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학번을 입력해주세요 ==>");

		String id = input.nextLine();


		String year = id.substring(0,4);

		String student = id.substring(4,7);

		String department =null;

		if(student.equals("111")) {
		department = "공과대 컴퓨터학과";
		}else if(student.equals("112")) {
		department = "공과대 소프트웨어학과";
		}else if(student.equals("113")) {
		department = "공과대 모바일학과";
		}else if(student.equals("122")) {
		department = "공과대 자바학과";
		}else if(student.equals("133")) {
		department = "공과대 모바일학과";
		}else if(student.equals("211")) {
		department = "사회대사회학과";
		}else if(student.equals("212")) {
		department = "사회대경영학과";
		}else if(student.equals("213")) {
		department = "사회대 경제학과";
		}


		System.out.println(id + "는" + year +"년도에 입학한" +
		department +"학생입니다" );

	}

}
