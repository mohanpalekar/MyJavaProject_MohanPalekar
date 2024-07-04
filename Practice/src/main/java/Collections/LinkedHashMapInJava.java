package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInJava {
	
	public static void main(String[] args) {
		Map<Character, String> lmap = new LinkedHashMap();
		
		lmap.put('A', "Apple");
		lmap.put('B', "Bananas");
		lmap.put('C', "Citrus");
		lmap.put('W', "Watermelon");
		lmap.put('G', "Guava");
		
		//lmap.clear();
		
		lmap.forEach((x,y) -> System.out.println(x+" : "+y));
		
		System.out.println(lmap.containsKey('X'));
		
		System.out.println(lmap.containsValue("Citrus"));
	
	}

}
