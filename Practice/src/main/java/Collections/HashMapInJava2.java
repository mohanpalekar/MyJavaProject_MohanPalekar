package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava2 {

	public static void main(String[] args) {
		
		Map<String, String> hmp = new HashMap();
		
		hmp.put("1","One");
		hmp.put("2","Two");
		hmp.put("3","Three");
		hmp.put("4","Four");
		hmp.put("5","Five");
		
		
		
		//hmp.clear();
		
		hmp.forEach((x,y) -> System.out.println(x+" : "+y));
		
		System.out.println(hmp);
		
		for(Entry<String, String> set : hmp.entrySet()) {
			System.out.println("Key: "+set.getKey()+" Value: "+set.getValue());
		}
	}
}
