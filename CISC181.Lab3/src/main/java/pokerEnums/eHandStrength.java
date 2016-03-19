package pokerEnums;

public enum eHandStrength {

	NaturalRoyalFlush(120, "isHandNaturalRoyalFlush") {
		public String toString() {
			return "Natural Royal Flush";
		}
	},
	RoyalFlush(110, "isHandRoyalFlush") {
		public String toString() {
			return "Royal Flush";
		}
	},
	StraightFlush(100, "isHandStraightFlush") {
		public String toString() {
			return "Straight Flush";
		}
	},
	FiveOfAKind(90, "isHandFiveOfAKind") { //Does this belong here?
		@Override
		public String toString() {
			return "Five of a Kind";
		}
	},
	FourOfAKind(80, "isHandFourOfAKind") {
		public String toString() {
			return "Four of a Kind";
		}
	},
	FullHouse(70, "isHandFullHouse") {
		public String toString() {
			return "Full House";
		}
	},
	Flush(60, "isHandFlush") {
		public String toString() {
			return "Flush";
		}
	},
	Straight(50, "isHandStraight") {
		public String toString() {
			return "Straight";
		}
	},
	ThreeOfAKind(40, "isHandThreeOfAKind") {
		public String toString() {
			return "Three of a Kind";
		}
	},
	TwoPair(30, "isHandTwoPair") {
		public String toString() {
			return "Two Pairs";
		}
	},

	Pair(20, "isHandPair") {
		public String toString() {
			return "One Pair";
		}
	},
	HighCard(10, "isHandHighCard") {
		public String toString() {
			return "High Card";
		}
	};

	private eHandStrength(final int handstrength, final String EvalMethod) {
		this.iHandStrength = handstrength;
		this.strEvalMethod = EvalMethod;
	}

	private int iHandStrength;
	private String strEvalMethod;

	public int getHandStrength() {
		return iHandStrength;
	}

	public String getEvalMethod() {
		return this.strEvalMethod;
	}

}
