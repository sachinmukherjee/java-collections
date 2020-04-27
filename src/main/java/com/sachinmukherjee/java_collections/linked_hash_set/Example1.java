package com.sachinmukherjee.java_collections.linked_hash_set;

import java.util.LinkedHashSet;

/*
 * It is an ordered version of HashSet
 * It maintains a doubly linked list
 * When iteration order is need to be maintain LinkedHashSet is Used
 * It Maintains order of insertion
 * It extends HashSet Class
 */
public class Example1 {
	
	public static void main(String[] args) {
		LinkedHashSet<String> hash = new LinkedHashSet<String>();
		hash.add("Sachin");
		hash.add("Sumeet");
		hash.add("Mukherjee");
		hash.add("John");
		hash.add("Benjen");
		
		System.out.println(hash);
		
		//Basic Methods are
		//size, contains, remove
		
		//Iteration
		//Iterator
	}
}
