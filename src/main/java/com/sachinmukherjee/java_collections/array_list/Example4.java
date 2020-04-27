package com.sachinmukherjee.java_collections.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Thread Safe ArrayList
 */
public class Example4 implements Runnable {
	
	private List<Integer> numList;
	
	public Example4(List<Integer> numList) {
		this.numList = numList;
	}
	
	public void run() {
		System.out.println("In Run Method");
		for(int i=0; i<10;i++) {
			System.out.println("Entering "+i);
			numList.add(i);
		}
		try {
			System.out.println("Sleeping");
			Thread.sleep(500);
			System.out.println("Waked");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numList = Collections.synchronizedList(new ArrayList<Integer>());
		Thread t1 = new Thread(new Example4(numList));
		Thread t2 = new Thread(new Example4(numList));
		Thread t3 = new Thread(new Example4(numList));
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Size "+numList.size());
		for(Integer i:numList) {
			System.out.println("Number "+i);
		}
	}
	
}
