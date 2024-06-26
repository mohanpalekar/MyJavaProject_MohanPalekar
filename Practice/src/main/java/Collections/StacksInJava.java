package Collections;

import java.util.List;
import java.util.Stack;

public class StacksInJava {

	public static void main(String[] args) {
		
		List<String> stack = new Stack();
		
		stack.add("One");
		stack.add("Two");
		stack.add("Three");
		stack.add("Four");
		stack.add("Five");
		
		
		
		//System.out.println(stack.removeFirst());
		
		System.out.println(stack);
		
		System.out.println(stack.getFirst());
		System.out.println(stack.getLast());
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.subList(0, 3));
		stack.clear();
		System.out.println(stack);
	}

}
