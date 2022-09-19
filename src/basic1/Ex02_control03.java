package basic1;

import java.util.Scanner;

public class Ex02_control03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=====당신의 학번을 입력하세요=====");
		String studentID = input.nextLine();
		String acn = null;
		String ann = null;
		char an = studentID.charAt(4);
		String num = studentID.substring(5, 7);
		String year = studentID.substring(0, 4);

		boolean success = true;

		if (an == '1') {
			ann = "공대";
			switch (num) {
			case "11":
				acn = "컴퓨터학과";
				break;
			case "12":
				acn = "소프트웨어학과";
				break;
			case "13":
				acn = "모바일학과";
				break;
			case "22":
				acn = "자바학과";
				break;
			case "33":
				acn = "서버학과";
				break;
			default:
				success = false;
			}

		} else if (an == '2') {
			ann = "사회대";
			switch (num) {
			case "11":
				acn = "사회학과";
				break;
			case "12":
				acn = "경영학과";
				break;
			case "13":
				acn = "경제학과";
				break;
			default:
				success = false;
			}
		}
		if (success) {
			System.out.println(studentID + "는" + year + "에 입학한 " + ann + " " + acn + "학생입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}