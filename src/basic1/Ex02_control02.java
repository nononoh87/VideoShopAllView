package basic1;

import java.util.Scanner;

public class Ex02_control02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("학번을 입력해 주세요 >>>");

		String id = input.nextLine();

		String year = id.substring(0, 4);

		char college = id.charAt(4);

		String aa = null;
		if (college == '1')
			aa = "공대";
		else if (college == '2')
			aa = "사회대";

		String c;
		c = id.substring(5, 7);
		int cc = Integer.parseInt(c);

		String cal = null;

		if (college == '1') {
			switch (cc) {
			case 11: cal = "컴퓨터학과"; break;
			case 12: cal = "소프트웨어학과"; break;
			case 13: cal = "모바일학과"; break;
			case 22: cal = "자바학과"; break;
			case 33: cal = "서버학과"; break;
			default:
				System.out.println("잘못입력 하셨습니다.");
			}
		} else if (college == '2') {
			switch (cc) {
			case 11: cal = "사회학과"; break;
			case 12: cal = "경영학과"; break;
			case 13: cal = "경제학과"; break;
			default:
				System.out.println("잘못입력 하셨습니다.");
			}
		}
		System.out.println(id + " 는 " + year + "년도에 입학한 " + aa + " " + cal + " 학생입니다");
	}

}
