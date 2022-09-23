package inherit;

public class Ddal extends Umma {

	public Ddal() { // 상속시 엄마클래스에 메모리가 먼저 생긴후 딸 클래스에 메모리가 생성 : 값 출력시 엄마클래스의 값이 우선적으로 출력.
					// 동일한 메소드명을 불러올경우 수정된 딸 메소드의 값을 출력하게 됨.
		System.out.println("딸 생성");
	}

	public void study() {
		System.out.println("딸은 공부중");
	}

	public void job() {
		System.out.println("직업 없음"); // Umma 메소드에서 상속받은 메소드 수정 : 동일한 메소드명,인자, 타입으로지정해야 수정가능 : overriding
	}

	public void gene() {
		System.out.println("딸은 딸");
	}
}
