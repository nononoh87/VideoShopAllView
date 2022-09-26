package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// 1. 스택

		Stack s = new Stack(); // 스택은 나중에 들어간 것은 먼저 뽑아준다.
		s.push("A");
		s.push("b");
		s.push("c");

		System.out.println(s.pop());

		// 2. 큐
		Queue q = new LinkedList(); // 인터페이스 안에 들어있다. 100% 추상 (사용법: 큐의 자식을 사용해야함)
		q.offer("A");
		q.offer("B");
		q.offer("C");

		System.out.println(q.poll());

	}

}
