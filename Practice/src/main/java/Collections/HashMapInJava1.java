package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hmp = new HashMap<Integer, String>();
		
		hmp.put(1, "One");
		hmp.put(4, "Four");
		hmp.put(2, "Two");
		hmp.put(3, "Three");
		
		
		//System.out.println(hmp);
		
		for(Entry<Integer, String> set : hmp.entrySet()) {
			System.out.print("Key is -> "+set.getKey() );
			System.out.println(" Value is -> "+set.getValue());
		}
	}

}
