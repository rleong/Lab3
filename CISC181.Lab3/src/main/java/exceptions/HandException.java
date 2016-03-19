package exceptions;

import pokerBase.Hand;

public class HandException extends Exception {

	private Hand h;

	public HandException(Hand h) {
		super();
		this.h = h;
	}
	
}
