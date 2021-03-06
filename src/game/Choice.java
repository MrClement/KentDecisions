package game;

public class Choice {
	private String printText; // This is the where the first era printext is
	private String[] story; // this stores all the choices and storyline so the
	private Requirements[] requirements; // execute class can print the choice
	private Outcome[] outcomes; // array of outcomes to be called on later
	private Person p;
	private int ageReq;
	private int charismaReq;
	private int intelligenceReq;
	private int strengthReq;
	private int wealthReq;
	private int confindenceReq;

	private boolean success;

	public Choice(String printText1, String[] storylines, Requirements[] reqs, Outcome[] outcomelines, Person d,
			int age, int charisma, int intelligence, int strength, int wealth, int confidence) {
		printText = printText1;
		story = storylines;
		outcomes = outcomelines;
		requirements = reqs;
		ageReq = age;
		charismaReq = charisma;
		intelligenceReq = intelligence;
		strengthReq = strength;
		wealthReq = wealth;
		p = d;
		confindenceReq = confidence;
		success = true;
	}

	public void print() {
		// prints choices to player
		System.out.println(printText);
	}

	public Outcome execute(int i) {
		// Player inputs which choice-Modifies Final output
		if (p.getCharisma() >= requirements[i - 1].getCharismaReq()
				&& p.getIntelligence() >= requirements[i - 1].getIntelligenceReq()
				&& p.getStrength() >= requirements[i - 1].getStrengthReq()
				&& p.getConfidence() >= requirements[i - 1].getConfidenceReq()
				&& p.getWealth() >= requirements[i - 1].getWealthReq()) {
			System.out.println(story[i - 1]);
			return outcomes[i - 1];
		} else {
			System.out.println(story[i + 10 - 1]);
			return outcomes[i + 10 - 1];
		}
	}

	public int getAgeReq() {
		return ageReq;
	}

	public void setAgeReq(int ageReq) {
		this.ageReq = ageReq;
	}

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

	public int getConfindenceReq() {
		return confindenceReq;
	}

	public void setConfindenceReq(int confindenceReq) {
		this.confindenceReq = confindenceReq;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
