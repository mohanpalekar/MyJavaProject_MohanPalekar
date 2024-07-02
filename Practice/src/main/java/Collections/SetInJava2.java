package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInJava2 {
	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet();
		set1.add("One");
		set1.add("Two");
		set1.add("Five");
		set1.add("Seven");
		set1.add("Nine");//
		set1.add("Eleven");//
		
		Set<String> set2 = new HashSet();
		set2.add("Nine");
		set2.add("Eleven");
		set2.add("Three");
		set2.add("Four");
		set2.add("Six");
		set2.add("Eight");
		set2.add("One");
		
		set1.removeAll(set2);
		System.out.println(set1);
	}

}
