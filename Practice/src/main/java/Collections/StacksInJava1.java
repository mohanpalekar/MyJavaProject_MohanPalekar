package Collections;

import java.util.Stack;

public class StacksInJava1 {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(23);
		stack.push(57);
		stack.push(96);
		stack.push(89);
		stack.push(45);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
