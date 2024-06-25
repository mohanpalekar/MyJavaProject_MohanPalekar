package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_ArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList();

		List<Integer> list1 = new ArrayList();

		list1.add(32);
		list1.add(42);
		list1.add(36);
		list1.add(82);

		list.add("Red");
		list.add("Blue");
		list.add("Grey");

		list.add("Orange");

		//list.remove(1);
		//list.removeAll(list);
		System.out.println(list.contains("Orange"));
		System.out.println(list.contains("orange"));

		System.out.println(list.size());
		System.out.println(list.toString());

		Iterator itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		itr = list1.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.forEach(x -> System.out.println(x));

	}
}
