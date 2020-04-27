package com.sachinmukherjee.java_collections.array_list;

import java.util.ArrayList;
import java.util.List;

//ArrayList are not thread safe 
//Here is an example to show that
/*
 * @Author Sachin Mukherjee
 */
public class Example3 implements Runnable {
	
	private List<Integer> numList;
	
	//Constructor
	public Example3(List<Integer> numList) {
		this.numList = numList;
	}
	
	public void run() {
		System.out.println("In Run Method");
		for(int i=0;i<10;i++) {
			System.out.println("Adding "+i);
			numList.add(i);
		}
		try {
			System.out.println("Sleeping");
			Thread.sleep(500); //Sleep for a particular time
			System.out.println("Waked");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<Integer>();
		//Creating three threads
		Thread t1 = new Thread(new Example3(numList));
		Thread t2 = new Thread(new Example3(numList));
		Thread t3 = new Thread(new Example3(numList));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); //allow the t1 thread to complete first
			t2.join(); //allow the t2 thread to complete first
			t3.join(); //allow the t3 thread to complete first
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(numList.size());
		for(Integer i: numList) {
			System.out.println("Number "+i);
		}
		
		//Here Expected Result was
		//Size of the array would be 30
		//and print statement should print 0 to 9 three times
	}
	
	
}
