package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> list =  new ArrayList();

		list.add(0, "Text1");
		list.add("Text2");
		list.add("Text3");

		//		list.removeFirst();
		//		list.removeFirst();
		
		list.remove(2);
		list.removeLast();
		//		
		System.out.println(list);

		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.forEach(x -> System.out.println(x));

	}
}
