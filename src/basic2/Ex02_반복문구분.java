package basic2;

import java.util.Scanner;

/*
 * for		: 반복 횟수가 정해진 경우
 * while	: 횟수를 모르는 경우 
 * do~while	: 횟수를 모르는 경우 (조건을 나중에 비교)	
 */

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력받아서 해당 구구단을 출력

		Scanner sc = new Scanner(System.in);
		
		/*
		// 1. for문
		System.out.println("몇번 반복을 할까요?");
		int su = sc.nextInt();
		for (int n = 0; n < su; n++) {
			System.out.println("==구구단의 단수를 입력하세요==");
			int i = sc.nextInt();
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d *%d=%d\n", i, j, i * j);
			}
		}
		*/
		
		//2. while
		while(true) {
			
			System.out.println("==구구단의 단수를 입력하세요==");
			int i = sc.nextInt();
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println("반복을 종료(Y)");
			sc.nextLine();
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y")) break;
		}
		
		//3. do~while
		while(true) {
			
			System.out.println("==구구단의 단수를 입력하세요==");
			int i = sc.nextInt();
			int j = 1;
			do {
				j++;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}while(j <= 9);
			
			System.out.println("반복을 종료(Y)");
			sc.nextLine();
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y")) break;
		}
		
		
	}

}
