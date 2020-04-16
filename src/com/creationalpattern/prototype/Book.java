package com.creationalpattern.prototype;

public class Book extends Item {
	/*
	 * Book class extends Item and inherits all data members and methods of an Item.
	 * Book has number of pages attribute different from item. */
	
	private int numberOfPages;

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
}
