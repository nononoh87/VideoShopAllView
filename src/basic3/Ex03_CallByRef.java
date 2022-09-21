package basic3;

public class Ex03_CallByRef {

	public static void main(String[] args) {
		//콜바이레퍼런스 StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("A=" + a + "B=" + b);
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);	//append (덧붙이다, 첨부하다)
		System.out.println("A=" + a + "B=" + b);
	}
	
}

/*
 	문자열 처리클래스
 	
 	-String
 	-
 */