package basic3;

public class Ex03_CallByString {

	public static void main(String[] args) {
		//(별종)새로운 heap영역에 값을 저장하고 stack영역에 번지수를 바꾼다.
		String a = new String("안녕");
		String b = new String("하이");
		
		add(a, b);
		System.out.println("A=" + a + "B=" + b);
	}
	
	static void add(String a, String b) {
		
		a += b;
		System.out.println("A=" + a + "B=" + b);
	}
	
}