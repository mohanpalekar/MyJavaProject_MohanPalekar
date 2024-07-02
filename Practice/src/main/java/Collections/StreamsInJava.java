package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,65,89,60);
		
		//list.stream().map(x -> x-4).forEach(x -> System.out.println(x));
		
		List<Integer> list2= list.stream().map(x -> x*x).collect(Collectors.toList());
		//System.out.println(list2);
		
		List<String> list3 = Arrays.asList("Red", "Orange", "Yellow", "Blue", "Black");
		
		//list3.stream().map(x -> x.length()).forEach(x -> System.out.println(x));;
		
		//list3.stream().filter(x -> x.endsWith("e")).forEach(x -> System.out.println(x));
		

		//list3.stream().filter( x -> x.contains("w")).forEach(x -> System.out.println(x));
		
		list3.stream().sorted().forEach(x -> System.out.println(x));
		
		list3 = list3.stream().sorted().collect(Collectors.toList());
		
		List<String> list4 = list3.reversed();
		
		System.out.println(list4);
		
		
	}

}
