package zfinal;

/* final class Parent{	//클래스 앞에 파이널이 붙으면 부모클래스가 될수 없다.
	final String filed ="부모님꺼";	// 필드 앞에 final이 붙으면 그 값을 절대로 변경할 수 없다.	
	final public void jib() {	//파이널은 오버라이딩을 무조건 못하게 한다.
		System.out.println("부모님이 만드신거");
	}
}

//class Child extends Parent{
//	Child(){
		//filed = "내꺼";
//	}
//	public void jib() {
//		System.out.println("내가 탕진함");
//	}
	
//}

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.filed);
		p.jib();
	}

}
*/