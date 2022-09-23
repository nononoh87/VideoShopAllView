package inherit;

public class MainTest {

	public static void main(String[] args) {
		/*
		Umma u = new Umma();
		u.job();
		u.gene();
		
		System.out.println("==상속받은 딸 메소드값 출력==");
		Ddal d =new Ddal();
		d.study();
		d.job();
		d.gene();
		*/
		
		//Ddal d = new Umma();
		
		// * 부모변수에 자식객체 생성이 가능
		//Umma u = new Ddal();
		//u.gene();		//overriding된 자식 메소드 접근가능
		//u.job();		//overriding된 자식 메소드 접근가능
		//u.study(); 
		
		
		// * 형변환 : (casting)
		//	1> 기본형끼리
		//	2> 참조형에서 상속관계에 있는 경우만 가능
		
		//	String s = new String("~");
		//	StringBuffer sb = (StringBuffer)s; --> X
		
		Ddal d = new Ddal();
		Umma u = (Umma)d;	//up casting
		Ddal d2 = (Ddal)u;	//doWn casting
		}

}
