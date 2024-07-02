package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println("Before reversing : "+list);
		
		Collections.reverse(list);
		
		System.out.println("After reversing : "+list);
		
	}
}
