package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsInJava2 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Hi");
		
		
		//list.stream().map(x -> x.concat("!!")).forEach(x->System.out.println(x));;
		
		//list.stream().filter(x -> x.endsWith("e")).forEach(x -> System.out.println(x));;
		
		//list.stream().sorted().forEach(x -> System.out.println(x));
		
		 Optional<String>
		 longestString = list.stream().reduce((a,b)-> a.length()<b.length() ? "3":"4");
		
		 longestString.ifPresent(t -> System.out.println(t));
		 
		 //ternary operator
		 String a = 5>21 ? "One":"two";
		 
		 System.out.println(a);
		 
		 String num = "3";
		 
		 //System.out.println(num*2);
		
	}

}
