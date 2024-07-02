package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDups {
	
	public static void main(String[] args) {
		
		List<Integer> dupsList = Arrays.asList(1,1,3,5,8,4,3,5);
		
		Set<Integer> uniqueSet = new TreeSet();
		
		dupsList.stream().forEach(x -> uniqueSet.add(x));
		
		System.out.println(uniqueSet);
	}

}
