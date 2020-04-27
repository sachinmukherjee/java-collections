package com.sachinmukherjee.java_collections.hash_set;

import java.util.HashSet;
import java.util.Set;

/*
 * It implements Set Interface
 * It stores unique elements
 * Cannot contain duplicate values
 * Allow null values
 * It is an unordered collection. Doesnot preserve order at which elements are entered
 * Internally uses HashMap to store elements
 * Not Thread Safe
 */
public class Example1 {
	
	public static void main(String[] args) {
		Set<String> hash = new HashSet<String>();
		hash.add("Sachin");
		hash.add("Sumeet");
		hash.add("Mukherjee");
		hash.add("John");
		hash.add("Benjen");
		
		System.out.println(hash);
		
		//Simple operations are
		//size, isEmpty, contains
		
		//Remove an element
		hash.remove("Benjen");
		//hash.removeAll();
		
		//Iterating
		//Iterator
		
	}
}
