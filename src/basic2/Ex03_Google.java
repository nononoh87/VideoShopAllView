package basic2;

public class Ex03_Google {

	public static void main(String[] args) {
		/* 문제  : 8의 숫자 세기(구글입사문제)

		1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
		결과 : 4000
		*/
		
		int count = 0;  //8이라는 숫자 카운팅
		int sum = 0;	//8의 갯수 합

		for (int i = 1; i <= 10000; i++) {
		     if (i % 10 == 8)
		         count++;
		     if ((i / 10) % 10 == 8)
		         count++;
		     if ((i / 100) % 10 == 8)
		         count++;
		     if (i / 1000 == 8)
		         count++;
		         sum = count;
		    }
		    System.out.println("sum : " + sum);

	}

}
