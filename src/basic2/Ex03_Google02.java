package basic2;

public class Ex03_Google02 {

	public static void main(String[] args) {
		/*
		 * 문제 : 8의 숫자 세기(구글입사문제)
		 * 
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가? 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두
		 * 카운팅 해야 한다. (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다) 결과 : 4000
		 */

		int count = 0; // 8의 갯수
		int temp = 0; // 임시변수

		for (int i = 1; i <= 10000; i++) {
			temp = i; // temp에 i값 임시저장

			while (true) {
				if (temp % 10 == 8)
					count++; // temp를 10으로 나눈 나머지의 값이 8일 경우 갯수를 셈
				if (temp > 10) {
					temp /= 10;
				} // temp가 10보다 클 경우(2자리수 이상) 10으로 나눈 후 다시 갯수를 셈
				else {
					break;
				} // temp가 10보다 작을 경우 while문 종료
			}
		}
		System.out.println("1~10000사이의 8의 갯수 : " + count);
	}
}
