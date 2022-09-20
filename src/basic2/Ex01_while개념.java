package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {
		/*
		//0. for문
		int sum = 0;					//초기화 하는것을 습관화 해라.
		for(int i = 1; i <=10; i++) {	
		sum += i;						//sum = sum + i
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		*/
		//초기치를 반복블록 위로
		//증가치를 반복문 끝으로
		//조건문만 남아서 for-> while
		/*
		int sum =0;
		int i = 1;		//초기치
		while(i<=10) {	//for문에서 while문으로 바뀌는 개념 (조건문 빼고 나머지는 밖으로)
			sum += i;	//sum = sum + i
			i++;		//증가치
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		*/
		
		//2. do~while
		int sum =0;
		int i = 1;		//초기치
		do {
			sum += i;	//sum = sum + i
			i++;		//증가치
		}while(i<=10);	//for문에서 do~while문으로 바뀌는 개념 (do~while문에서는 다른 값을 조건문 위로)
		System.out.println("1부터 10까지의 합 : " + sum);
		
		
	}

}
