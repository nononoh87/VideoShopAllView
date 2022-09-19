package basic1;

/*
 * 반복문 : for / while / do~while
 * 
 * (1) for (초기치; 조건문; 증가치){
 *  	  반복구문
 *     }
 */


public class Ex03_for개념 {

	public static void main(String[] args) {
		
		//1) 1부터 10까지 숫자 출력
		for(int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		
		//[1] 위의 for 원리 이해하기
		//[2] 1부터 10까지의 합을 출력
		//[3] 1부터 10까지의 홀수의 합을 출력
		int sum = 0;
		for(int i = 1; i<=10; i++){
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		//유인님
		int even = 0;
		int odd = 0;
		for(int t = 1; t<=10; t++) {
			if(t%2==0) {
				even += t;	//짝수
			}else {
				odd += t;	//홀수
			}
		}
		System.out.print("1부터 10까지의 홀수의 합 : " + odd);
		System.out.println();
		
		//민수님
		int sum1 = 0;
		for(int i =1; i<=10; i+=2) {
			sum1 += i;
		}
		System.out.println("1부터 10까지의 홀수의 합 : " + sum1);
	
		//한철님
		int sum2=0;
		for (int i=1; i<=10; i++) {
			if(i%2==1) {
				sum2+=i;
			}
		}
		System.out.println("1부터 10까지의 홀수의 합 : " + sum2);
			
		
		
		
		//2) 'A'부터 'Z'까지 출력
		/*for (char ai = 'A';ai <= 'Z'; ai++) {
			System.out.print(ai);
		}
		System.out.println();
		
		for (char ai = 'A';ai <= 'Z'; ai+=2) {
			System.out.print(ai);
		}
		System.out.println();
		// 'Z'부터 'A'까지 출력
		for (char ai = 'Z';ai >= 'A'; ai--) {
			System.out.print(ai);
		}
		System.out.println();*/
	}

}
