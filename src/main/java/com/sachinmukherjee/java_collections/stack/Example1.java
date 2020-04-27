package com.sachinmukherjee.java_collections.stack;

import java.util.Stack;

/*
 * LIFO DS
 * Basic operations are Push and Pop
 * Push add element at top and pops removes an element from top
 * Stack class extends Vector
 */
public class Example1 {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		//Adding Element
		stack.push("Sachin");
		stack.push("Sumeet");
		stack.push("Mukherjee");
		stack.push("Zack");
		stack.push("Jon");
		
		System.out.println(stack);
		
		//Popping element
		stack.pop();
		System.out.println(stack);
		
		//Top Most element of stack
		System.out.println(stack.peek());
		
		//Other Operations
		//Stack is Empty
		System.out.println(stack.isEmpty());
		//Size of Stack
		System.out.println(stack.size());
		//Search an element
		//returns position of element from top if found else returns -1 if not found
		System.out.println(stack.search("Mukherjee"));
		
		//Iterating
		//Iterator or List Iterator
		
	}
}
