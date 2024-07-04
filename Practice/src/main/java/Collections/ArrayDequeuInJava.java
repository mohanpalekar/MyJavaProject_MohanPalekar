package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeuInJava {

	public static void main(String[] args) {

		Deque<Integer> dq = new ArrayDeque();

		//DQ - Double Ended Queue

		dq.add(13);
		dq.add(15);
		dq.add(93);
		dq.add(63);
		dq.add(53);
		dq.add(23);

		dq.addFirst(14);
		dq.addLast(88);

		//		dq.removeFirst();
		//		dq.removeLast();
		//		
		//		dq.removeFirst();
		//		dq.removeLast();

		System.out.println(dq);

		System.err.println(dq.size());
		
		dq.stream().forEach(x -> System.out.println(x+10));


	}

}
