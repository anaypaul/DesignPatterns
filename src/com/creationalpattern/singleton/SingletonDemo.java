package com.creationalpattern.singleton;



public class SingletonDemo {
	
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		
		System.out.println(obj.toString());
		obj = Singleton.getInstance();
		
		System.out.println(obj.toString());
	}
	
}
