package basic3;

public class Ex03_CallByValue {

	public static void main(String[] args) {
		// CallByValue는 원본 손상을 안한다.	
		int a= 10, b= 20;
		add(a,b);
		System.out.println("A=" + a + "B=" + b);	// 2번 출력, A= 10, B=20  
	}
	static void add(int a, int b) {
		a += b;
		System.out.println("A=" + a + "B=" + b);	// 1번 출력, A= 30, B=20
	}
}
/* 기본형을 함수 인자로 보내는 것을CallByValue라 한다.
 * 1. 복사해서 보내준것은 복사본이지, 원본에 영향을 안준다.
 * 2. add로 보내준 녀석은 보내지긴해도 이미 main함수에 정해진 값이 있기에 영향을 안미침
 * 3. 즉 add 에서합해진 a는 add 에서만 처리가되고 함수 add를 마추고 돌아갔을때는
 * 		영향을 안미친다. 이걸 callByValue(기본 자료형에서만)
 * 4. 복사본은 아래 내려주고 받은 복사본은 원본에 지장을 안준다.
*/







