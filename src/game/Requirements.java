package game;

/**
 * Requirements is a class just used to facilitate making in-choice requirements.
 * It is just a bunch of ints corresponding to various attribute requirements
 * @author cwilson14
 *
 */
public class Requirements {
	private int charismaReq;
	private int intelligenceReq;
	private int strengthReq;
	private int wealthReq;
	private int confidenceReq;
	
	public int getCharismaReq() {
		return charismaReq;
	}

	public void setCharismaReq(int charismaReq) {
		this.charismaReq = charismaReq;
	}

	public int getIntelligenceReq() {
		return intelligenceReq;
	}

	public void setIntelligenceReq(int intelligenceReq) {
		this.intelligenceReq = intelligenceReq;
	}

	public int getStrengthReq() {
		return strengthReq;
	}

	public void setStrengthReq(int strengthReq) {
		this.strengthReq = strengthReq;
	}

	public int getWealthReq() {
		return wealthReq;
	}

	public void setWealthReq(int wealthReq) {
		this.wealthReq = wealthReq;
	}

	public int getConfidenceReq() {
		return confidenceReq;
	}

	public void setConfidenceReq(int confidenceReq) {
		this.confidenceReq = confidenceReq;
	}

	/**
	 * constructor for Requirements. pretty self-explanatory
	 * 
	 * @param charisma
	 * @param intelligence
	 * @param strength
	 * @param wealth
	 * @param confidence
	 */
	public Requirements(int charisma, int intelligence, int strength, int wealth, int confidence){
		charismaReq=charisma;
		intelligenceReq=intelligence;
		strengthReq=strength;
		wealthReq=wealth;
		confidenceReq=confidence;
	}
}