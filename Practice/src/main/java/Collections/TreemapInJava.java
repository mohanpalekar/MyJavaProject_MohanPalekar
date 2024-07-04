package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreemapInJava {

	public static void main(String[] args) {

		Map<Character, String> lmap = new TreeMap();

		lmap.put('A', "Apple");
		lmap.put('B', "Bananas");
		lmap.put('C', "Citrus");
		lmap.put('W', "Watermelon");
		lmap.put('G', "Guava");
		
		lmap.forEach((x,y) -> System.out.println(x+" : "+y));

	}

}
