package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetInJava {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		set.forEach(x -> System.out.println(x));
	}

}
