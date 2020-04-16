package com.creationalpattern.singleton;

public class Singleton {
	private static volatile Singleton instance = null;
	
	private Singleton() {
		if(instance != null) {
			throw new RuntimeException("Please use getInstance()");
		}
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
