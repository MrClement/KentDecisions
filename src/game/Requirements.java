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
	
	/**
	 * constructor for Requirements. pretty self-explanitory
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