package com.sachinmukherjee.java_collections.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Linked list maintains the insertion order of elements
 * It can have duplicate as well as null values
 * It implements Queue and Dequeue interface so it can be used as Queue, DeQueue, Stack
 * Not thread Safe
 * Double Linked List as we can access next element and previous element as well
 * Difference between ArrayList and Linked List
 */
public class Example1 {
	
	public static void main(String[] args) {
		
		LinkedList<String> friends = new LinkedList<String>();
		//Adding Elements to List
		friends.add("Sachin");
		friends.add("Sumeet");
		friends.add("Mukherjee");
		
		//Iterating List
		Iterator<String> list = friends.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		
		//Adding an element at specified position
		friends.add(2, "ZACK");
		//adding an element to first position
		friends.addFirst("Jon");
		//adding an element to last position. It is equivalent to add method
		friends.addLast("Benjen");
		System.out.println(friends);
		
		//Accessing elements from Linked List
		//Get First Element
		System.out.println(friends.getFirst());
		//Get Last Element
		System.out.println(friends.getLast());
		//Get Element at particular Index
		System.out.println(friends.get(2));
		
		//Removing Element
		//Remove First Element
		friends.removeFirst();
		//Remove Last Element
		friends.removeLast();
		//Remove at a particular index
		friends.remove(1);
		//Remove a particular element
		friends.remove("Mukherjee");
		System.out.println(friends);
		
		//Searching an Element
		friends.contains("ZACK");
		//Last index of an element
		friends.indexOf("ZACK");
		//First index of an element
		friends.lastIndexOf("ZACK");
		
		//Iterating over a LinkedList
		//Use Iterator or ListIterator
		
	}
}
