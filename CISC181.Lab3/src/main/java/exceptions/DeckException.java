/**
 * 
 */
package exceptions;

import pokerBase.Deck;

/**
 * @author Bert.Gibbons
 *
 */
public class DeckException extends Exception {

	private Deck d;

	public DeckException(Deck d) {
		super();
		this.d = d;
	}

	public Deck getD() {
		return d;
	}
	
}
