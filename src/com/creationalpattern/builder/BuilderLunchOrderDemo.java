package com.creationalpattern.builder;

public class BuilderLunchOrderDemo {
	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder(); //creating the builder object
		
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Chicken"); //setting the state of the builder object
		// and this builder object will be passed to the construtor of Lunch Order exposed to the client
		
		LunchOrder lunchOrder = new LunchOrder(builder); // Create the lunch order by passing builder object. 
		// As LunchOrder doesn't have setting methods exposed it is immutable.
		
		// We can view the state of LunchOrder using getters of Lunch Order exposed to client. 
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		
		
	}

}
