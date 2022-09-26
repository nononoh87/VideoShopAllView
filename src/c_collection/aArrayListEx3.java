package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {

		ArrayList<Student> result = method(); // ArrayList 동적인 배열(많이 사용함.)
		// 학생 정보를 여기서 출력

		// 향상된 for문
		for (Student s : result) { // 제너리스를 빼면 for문으로 바꿔줘야하고 형변환도 해줘야함.
			System.out.println(s);
		}
		// [참고] 전체 요소를 순서대로 검색
		// Enumeration -> Iterator
		System.out.println("=============================");
		Iterator<Student> it = result.iterator(); // 요소를 검색하기 위해서 iterator를 사용함
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길자", 25));
		list.add(new Student("홍숙자", 33));
		list.add(new Student("홍미자", 44));
		return list;
	}

}

//----------------------------------------------------------
class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "학생은 " + age + "세 입니다.";
	}
}
