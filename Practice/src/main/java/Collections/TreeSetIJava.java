package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetIJava {
	
	public static void main(String[] args) {
		Set<String> set2 = new TreeSet();
		
		set2.add("Nine");
		set2.add("Eleven");
		set2.add("Three");
		set2.add("Four");
		set2.add("Six");
		set2.add("Eight");
		set2.add("One");
		
		set2.stream().forEach(x -> System.out.println(x));
		
		Set<Integer> set3 = new TreeSet();
		
		set3.add(23);
		set3.add(53);
		set3.add(43);
		set3.add(93);
		set3.add(83);
		set3.add(03);
		
		set3.stream().forEach(x -> System.out.println(x));
	}

}
