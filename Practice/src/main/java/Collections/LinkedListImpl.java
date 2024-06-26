package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {

	public static void main(String[] args) {

		
		long startTime = System.currentTimeMillis();

		List<Integer> myList = new LinkedList();
		
		for(int i=0; i<=100000; i++) {
			myList.add(i);
		}

		System.out.println(myList);

		for(int j=0; j<=100000; j++) {
			myList.removeFirst();
		}

		System.out.println(myList);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time Required: "+ (endTime-startTime));
	}

}
