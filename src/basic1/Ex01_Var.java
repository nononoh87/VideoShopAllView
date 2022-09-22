package basic1;
/*
 * 자료형(data type)
 * 1. 기본형
 * 		boolean
 * 		char
 * 		byte/short
 * 		int /long
 * 		float/double
 * 
 * 2. 참조형
 * 		'클래스
 * 		'배열
 * 		-> new 
 * 
 * 
 */

//import java.lang.*;
public class Ex01_Var {	// extends Object
	//* 멤버 변수
	String a = null;
	int b = 0;

	public static void main(String[] args) {
		
		
		//*지역 변수
		
		//문자열 변수 a 선언
		String a = null;
		//정수 변수 b 선언
		int b = 0;
		//변수 b에 200 대입
		b = 200;
		//변수  A에 "Hello"을 지정
		a = "Hello";
		// *****
		// a = new String("Hello");
		
		//변수 a와 b 콘솔에 출력
		System.out.println(a+b);

	}

}
