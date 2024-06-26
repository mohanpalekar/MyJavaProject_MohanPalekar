package Collections;

import java.util.Vector;

public class VectorsInJava {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector();
		
		for(int i=0; i<=500; i++) {
			v.add(i);
		}
		
		System.out.println(v.indexOf(400));
		
		v.remove(499);
		
		//System.out.println(v);
		
		v.forEach(x -> System.out.println(x));
	}

}
