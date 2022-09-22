package basic4;

import java.util.Scanner;

public class CalculatorExpr {
	
	private int num1;
	private int num2;
	
	
	int getAddittion() {
		return num1 + num2;
	}
	int getSubtraction() {
		return num1 - num2;
	}
	int getMultiplication() {
		return num1 * num2;
	}
	double getDivision() {
		return num1 / num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

}
