package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {

	public static void main(String[] args) {

		Set<String> set = new HashSet();

		set.add("One");
		set.add("Two");
		set.add("Five");
		set.add("Three");
		set.add("Five");
		set.add("Four");
		set.add("Five");
		set.add(null);

		//set.stream().forEach(x -> System.out.println(x));

		//		Iterator<String> itr = set.iterator();
		//		while(itr.hasNext()) {
		//			System.out.println(itr.next());
		//		}

		//set.remove("Three");
		
		System.out.println(set.contains("two"));

		set.stream().forEach(x -> System.out.println(x));
	}

}
