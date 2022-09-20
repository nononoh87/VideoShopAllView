package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[3];
		/*
		 * for(int i = 0; i<kor.length; i++) { System.out.println(i +
		 * "번 학생의 국어점수를 입력->"); kor[i] = input.nextInt(); }
		 * 
		 * //출력 for(int i = 0; i<kor.length; i++) { System.out.println(i +
		 * "번 학생의 국어점수 :" + kor[i]);
		 */

		
		/*
		 * 3명의 국어 점수를 입력하세요(ex. 10/20/30 )
		 */
		System.out.println(kor.length + "명의 국어점수를 입력하세요(ex. 10/20/30)");
		String inputData = input.nextLine();	// "10/20/30"
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for(int i =0; st.hasMoreTokens(); i++) {
			String str = st.nextToken();
			kor[i] =Integer.parseInt(str);
		}
		//출력
		for(int i = 0; i<kor.length; i++) {
			System.out.println(i + "번 학생의 국어점수 :" + kor[i]);
		}
		
		// 위 학생들 점수의 총점과 평균
		int sum = 0;
		double avg = 0;

		// 합과 평균
		for (int i = 0; i < kor.length; i++) {
			sum += kor[i];
			avg = sum / kor.length;
		}

		// 출력
		System.out.println("합 :" + sum);
		System.out.println("평균 : " + avg);

	}

}