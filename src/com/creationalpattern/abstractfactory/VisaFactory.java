package com.creationalpattern.abstractfactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch(cardType) {
		case GOLD:
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaPlatinumCreditCard();
		default:
			break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		switch(cardType) {
		case GOLD:
			return new VisaGoldValidator();
		case PLATINUM:
			return new VisaPlatinumValidator();
		default:
			break;
		}
		return null;
	}

}
