package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesInJava {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue();

		//queue.add(null);
		queue.add("One");
		queue.add("Four");
		queue.add("Two");
		queue.add("Three");
		queue.add("Eight");
		queue.add("Four");

		queue.remove("Four");
		queue.remove("Nine");

		System.out.println(queue);

		//queue.stream().forEach(x -> System.out.println(x));

		//		Iterator<String> itr = queue.iterator();
		//		
		//		while(itr.hasNext()) {
		//			System.out.println(itr.next());
		//		}

		System.out.println("Peek method: "+queue.peek());//fetches the top element
		System.out.println("Poll method: "+queue.poll());//fetches and deletes the top element
		System.out.println("Peek method: "+queue.peek());
		System.out.println("Poll method: "+queue.poll());
		System.out.println("Poll method: "+queue.poll());
		System.out.println("Poll method: "+queue.poll());
		System.out.println("Poll method: "+queue.poll());
		System.out.println("Poll method: "+queue.poll());
		
		
		Queue<Integer> q2 = new PriorityQueue<Integer>();
		
		q2.add(23);
		q2.add(53);
		q2.add(13);
		q2.add(73);
		q2.add(03);
		
		System.out.println(q2);
		
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		
		


	}

}
