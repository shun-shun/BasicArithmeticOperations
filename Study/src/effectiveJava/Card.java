package effectiveJava;

public class Card {
	enum Suit {
		CLUB,
		DIAMOND,
		HEART,
		SPADE
	}
	enum Rank {
		ACE,
		DEUCE,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}
	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * @return suit
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * @return rank
	 */
	public Rank getRank() {
		return rank;
	}
}
