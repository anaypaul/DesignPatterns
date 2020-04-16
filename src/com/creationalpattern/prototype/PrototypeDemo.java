package com.creationalpattern.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie"); // here we create a clone of the Movie object with title "Basic movie"
		//Now we modify that instance as per requirement i.e. change title, runtime etc.
		
		movie.setTitle("Creational Pattern in Java : Prototype Pattern");
		
		System.out.println("Details of First object cloned from Registry : ");
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getUrl());
		System.out.println(movie.getRuntime());
		
	
		Movie anotherMovie = (Movie) registry.createItem("Movie"); // here we are creating another instance of movie by cloning the basic movie
		anotherMovie.setTitle("Gang of Four");
		anotherMovie.setRuntime("3 hours and 12 minutes");
		System.out.println("Details of Second object cloned from Registry : ");
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getPrice());
		System.out.println(anotherMovie.getUrl());
		System.out.println(anotherMovie.getRuntime());
		
		

	}

}
