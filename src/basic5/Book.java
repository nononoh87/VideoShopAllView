package basic5;

public class Book {
	
	private static int count;	//객체끼리 뭔가를 공유하고 싶을때 static
	
	public Book() {
		count++;
	}
	
	public static int getCount() { 
		return count;
	}
}

/*
 *  static
 * 
 * 	-객체의 공유
 * 	-객체의 생성보다 먼저 실행하기 때문에 클래스명 접근
 * 
 */


