package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적 {
	public static void main(String[] args) {
		/*4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
			1째 학생의 성적을 입력 -> 88/77/66
			2째 학생의 성적을 입력 -> 50/40/70
			3째 학생의 성적을 입력 -> 44/33/22
			4째 학생의 성적을 입력 -> 55/50/70
		*/
		
		Scanner sc = new Scanner(System.in);

		System.out.print("학생수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.println();

		int[][] score = new int[num][4]; // 점수 입력받을 배열
		int st_sum = 0; // 학생별 총점

		//점수 입력
		for (int i = 0; i < num; i++) {
			System.out.printf("%d째 학생의 성적을 입력 -> ", i + 1);
			String inputData = sc.next(); // 10/20/30
			StringTokenizer st = new StringTokenizer(inputData, "/");
			for (int j = 0; st.hasMoreTokens(); j++) {
				String str = st.nextToken();
				score[i][j] = Integer.parseInt(str);
			}
		}

		/*[결과]
			1째 학생의 총점 xxx 이고 평균은 ooo 입니다
			2째 학생의 총점 xxx 이고 평균은 ooo 입니다
			3째 학생의 총점 xxx 이고 평균은 ooo 입니다
			4째 학생의 총점 xxx 이고 평균은 ooo 입니다
		*/
		System.out.println();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 3; j++) {
				st_sum += score[i][j];
			}
			System.out.printf("%d째 학생의 총점 %d이고 평균은 %.2f 입니다. \n", i + 1, st_sum, st_sum / 3.0);
			st_sum = 0;
		}

		//과목별 결과 출력
		int kor = 0;
		int eng = 0;
		int math = 0;

		for (int i = 0; i < num; i++) {
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
		}
		/*[결과]
		국어과목  총점 xxx 이고 평균은 ooo 입니다
		영어과목  총점 xxx 이고 평균은 ooo 입니다
		수학과목  총점 xxx 이고 평균은 ooo 입니다
		*/
		System.out.println("---------");
		System.out.printf("국어과목 총점 %d 이고 평균은 %.2f 입니다.\n", kor, (double) kor / num);
		System.out.printf("영어과목 총점 %d 이고 평균은 %.2f 입니다.\n", eng, (double) eng / num);
		System.out.printf("수학과목 총점 %d 이고 평균은 %.2f 입니다.\n", math, (double) math / num);

		sc.close();

	}

}
