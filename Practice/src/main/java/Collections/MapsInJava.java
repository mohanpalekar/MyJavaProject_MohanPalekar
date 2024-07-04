package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsInJava {
	
	public static void main(String[] args) {
		
		
		//State, City
		Map<String, String> map = new HashMap();
		
		map.put("Maharashtra", "Mumbai");
		map.put("TamilNadu","Chennai");
		map.put("UP", "Lucknow");
		
		map.put("Maharashtra", "Pune");
		map.put("Maharashtra", "Nashik");
		map.put("Maharashtra", "Nagpur");
		
		map.remove("Maharashtra");
		
		//map.clear();
		
		System.out.println(map.containsValue("Lucknow"));
		
		System.out.println(map);
		
		for(Entry<String, String> set: map.entrySet()) {
			System.out.println("State: "+set.getKey()+" : City: "+set.getValue());
		}
		
		System.out.println(map.containsKey("Maharashtra"));
		
		
	}

}
