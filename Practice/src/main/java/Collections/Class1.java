package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class1 {

	public static void main(String[] args) {


		List<String> list = new ArrayList();
		list.add("Mayur");
		list.add("Bob");
		list.add("Krishna");
		list.add("Mayur");
		list.add("Mayank");
		list.add("Duggi");

		Map<String, Integer> map = new HashMap();

		Iterator itr = list.iterator();

		while(itr.hasNext()){
			String key = (String) itr.next();
			if(key.toLowerCase().startsWith("m")){
				if(map.containsKey(key)){
					map.put(key, map.get(key)+1);

				}else map.put(key, 1);
			}
		}


		for(Entry<String, Integer> set : map.entrySet()){
			System.out.println(set.getKey()+" : "+set.getValue());
		}




	}

}

