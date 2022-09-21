package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		add(a, b);	//인수
	}
	
	static void add(int a, int b) {	//인자
		// 여기에서 a, b의 값을 합해서 출력
		int sum = a + b;
		System.out.println("합 : " + sum);
	}
	
}
/*메소드 (Method) - 함수

- 역할별로 작업분산

- 반복되는 작업
*/