package com.sachinmukherjee.java_collections.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example1 {
	
	public static void main(String args[]) {
		
		//Create an ArrayList of Strings
		List<String> animals = new ArrayList<String>();
		
		//Adding new elements
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Mouse");
		animals.add("Leopard");
		animals.add("Bear");
		animals.add("Panda");
		
		System.out.println(animals);
		
		//Adding an element in particular location
		animals.add(2, "Snake");
		
		System.out.println(animals);
		
		
		//Acessing elements of array list
		//isEmpty() -> If array list is empty
		//size() -> to check size of array list
		//accesing element at particular location get() method
		//modifing element at particular location set() method
		//removing element at particular location remove(index) method
		//removing a particular method remove(Object) method. removes first matched element
		//remove all element from an array list that exists in a given collection removeAll()
		//remove all element if they match a given predicate removeIf()
		//clear an array list clear()
		
		System.out.println(animals.isEmpty());  //Empty or not
		System.out.println(animals.size());	//size of list
		System.out.println(animals.get(1)); //get element at position 1
		System.out.println(animals.set(2, "Elephant"));
		
		System.out.println(animals);
		System.out.println();
		
		animals.remove(2); //remove element at index 2
		animals.remove("Dog"); // removes first matched element
		
		
		//Iterating
		//Iterator
		//ListIterator
		//For Loop
		
		//Iterating over a list Iterator
		//Iterate on forward direction
		//Help us to modify the data while iterating
		Iterator<String> animal = animals.iterator();
		while(animal.hasNext()) {
			System.out.println(animal.next());
		}
		
		System.out.println();
		
		//Iterating over ListIterator
		//It can iterate on both side
		//Help us to modify the data while iterating
		ListIterator<String> listiterator = animals.listIterator();
		while(listiterator.hasNext()) { //listiterator.hasPrevious()
			System.out.println(listiterator.next());  //listiterator.previous()
		}
		
		
		//Searching Element
		//check if arraylist contain a particular element contains()
		//find the index of first occurance of an element indexOf()
		//find the index of last occurance of an element lastIndexOf()
		
		
		
		
	}
}
