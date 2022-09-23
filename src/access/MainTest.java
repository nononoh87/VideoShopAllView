package access;

import accother.Access;

public class MainTest extends Access {

	public static void main(String[] args) {
		MainTest acc = new MainTest();
		//acc.a = "프라이빗 변경";
		acc.b = "퍼블릭 변경";		//다른패키지에 있으면 퍼블릭만 접근가능
		acc.c = "프로텍티드 변경";	//부모 자식간의 관계(extends)를 맺어주면 접근가능
		//acc.d = "디폴트 변경";
		acc.output();

	}

}
