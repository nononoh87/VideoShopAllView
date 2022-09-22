package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CalculatorExpr c = new CalculatorExpr();
		int count = 0;
		while (true) {
			System.out.println("첫번째 숫자를 입력하세요");
			int num1 = sc.nextInt();
			c.setNum1(num1);
			System.out.println();
			System.out.println("두번째 숫자를 입력하세요");
			int num2 = sc.nextInt();
			c.setNum2(num2);
			System.out.println();
			if (count>0) {
			System.out.println("추출된 숫자: " + num1 + ", "+num2);
			}
			System.out.println("덧셈 출력 : " + c.getAddittion());
			System.out.println("뺄셈 출력 : " + c.getSubtraction());
			System.out.println("곱셈 출력 : " + c.getMultiplication());
			System.out.println("나눗셈 출력 : " + c.getDivision());
			System.out.println();
			count++;
			System.out.println("계속 진행하시겠습니까? (Y/N)");
			if (sc.next().toLowerCase().equals("n"))
				break;

		}

	}

}
