package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_Lists {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList();
		
		list1.add("Collections");
		list1.add("List");
		list1.add("C_Lists");
		
		Iterator itr = list1.iterator();
		
		while(itr.hasNext()) {
			String str = (String) itr.next();
			if(str.length() >= 6) {
				System.out.println(str +" --> Yes");
			}else System.out.println(str +" --> No");
		}
		
		
		//Collections --> Yes
		//Collections --> No
	}

}
