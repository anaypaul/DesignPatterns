package com.creationalpattern.builder;

public class LunchOrder {
	
	public static class Builder{
		
		// data members for builder objects which will get created based on different parameters 
		// that will be used based on the request of Lunch order. 
		// this gives us flexibility of creating LunchOrder objects without worrying about different possible combinations of constructors
		// to create the LunchOrder object with flexibility. 
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder() {
			/*Basic  Builder Constructor for creating Builder Object*/
			
		}
		
		
		//method that will call LunchOrder constructor with builder object as parameter to create LunchOrder object
		// without worrying about different parameter combinations to be implements explicitly. 
		// In this way we can manager multiple constructors of LunchOrder in a simplified way. 
		public LunchOrder buildLunchOrder() {
			return new LunchOrder(this);
		}
		
		
		// member function that returns its own instance i.e. Builder object in this case by setting the value of bread data member 
		// for the builder object. 
		//These acts as the setter for our main LunchOrder Object. 
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
	}
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	
	public String getDressing() {
		return dressing;
	}
	
	public String getMeat() {
		return meat;
	}

}
