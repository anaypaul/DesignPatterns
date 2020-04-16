package com.structuralpattern.adapter;

import java.util.Arrays;
import java.util.List;

public class EverydayExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrayOfInts = new Integer[] {42, 43, 44};
		List<Integer> listOfInts = Arrays.asList(arrayOfInts); // Arrays.asList() is the adapter used here. 
		
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
		
	}

}
