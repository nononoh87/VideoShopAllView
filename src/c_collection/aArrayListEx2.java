package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(4); // 내가 넣고자하는 자료형을 지정하는 것이 generics이다.
		list.add("rabbit");
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노란표시 없애려면 generics 지정

		list.set(3, "rabbit"); // 인텍스로 구분되어 있어도 동일한 이름을 사용가능
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		Collections.sort(list); // 오름차순
		System.out.println(list);

		// System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			String data = (String) list.get(i); // 형변환을 해서 맞춰서 사용해야함
			System.out.println(data);
		}

		// 향상된 for문
		for (String data : list) { // list 에서 값을 하나하나 뽑아서 String data 에 대입
			System.out.println(data);
		}

	}
}
