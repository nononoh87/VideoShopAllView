package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {
		
		int[] result = add();
		// a와 b의 값을 받아서 합산한 결과를 여기서 출력
		int sum = result[0] + result[1];
		System.out.println("합 : " + sum);
		
	}
	
	static int[] add() {
		int a = 10, b =20;
		int[] arr = {a, b};
		
		return arr;
	}
	
}
