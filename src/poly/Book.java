package poly;

public class Book extends Item {

	private String aut;
	private String ph;

	public Book() {
		this ("000","제목없음","무명","출판사");
		System.out.println("Book 기본생성자");
	}

	public Book(String num, String ti, String aut, String ph) {
		//super.num = num;
		//super.ti = ti;
		super(num, ti);
		
		this.aut = aut;	
		this.ph = ph;
		System.out.println("Book 인자 생성자");
	}

	public void output() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + ti);
		System.out.println("저자 : " + aut);
		System.out.println("출판사 : " + ph);
	}
}
