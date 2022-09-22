package basic4;

public class MainTest {

	public static void main(String[] args) {
		
        //값지정 1 - setter
		Student s= new Student();
//		s.setName("홍길동");
//		s.setKor(100);
//		s.setEng(30);
//		s.setMath(55);
		
		//값지정 2 - 생성자
//		Student s= new Student("홍길자", 99, 88, 66);
		
		s.calTotal();
		s.calAvg();
		//s.total =0;
		s.output();
	}

}
