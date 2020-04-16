package com.creationalpattern.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(888);
		
		
		CreditCard card1 = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card1.getClass());
		
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(649);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card2.getClass());
		
		
		
		
		
	}

}
