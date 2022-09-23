package basic2;

import java.util.Scanner;

/*
 * [문제]
 * 
 * 1부터 50까지 숫자 중에서 3,6,9 숫자가 포함되면
 * 그 갯수만큼 '짝' 글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력

 */
		

public class Ex03_369a {

	public static void main(String[] args) {
		
		// [2] 회사 B

		Scanner sc = new Scanner(System.in);

		int count=0; // 369의 갯수
		int temp=0; // 임시 변수

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		for(int i=0;i<=num;i++){
		temp = i; //temp에 i값 임시 저장
		while(true){
		if (temp%10 ==3 || temp%10 == 6 || temp%10 ==9) {count++; break;} // temp를 10으로 나눈 나머지의 값이 3,6,9일 경우 갯수를 셈
		else if (temp>10) {temp /= 10; }	// temp가 10보다 클 경우(2자리수 이상) 10으로 나눈 후 다시 갯수를 셈
		else {break;}	// temp가 10보다 작을 경우 while문 종료
		}
		}

		System.out.println("박수 친 횟수 : "+count); //결과 출력
		sc.close();
		}
}	