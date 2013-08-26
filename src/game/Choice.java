package game;


public class Choice {
	private int Final;
	private String printText; //This is the where the first era printext is
	private String [] story; //this stores all the choices and storyline so the execute class can print the choice
	private String [] outcomes; //array of outcomes to be called on later
	private boolean genderReq;
	private int ageReq;
	private int charismaReq;
	private int intelligenceReq;
	private int strengthReq;
	private int wealthReq;
	private int confindenceReq;
	
	
	public boolean isGenderReq() {
		return genderReq;
	}

	public void setGenderReq(boolean genderReq) {
		this.genderReq = genderReq;
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
	
	public Choice(String printText1, String [] storylines, String [] outcomelines)
	{
		printText = printText1;
		story = storylines;
		outcomes = outcomelines;
	}
	
	public void print()
	{
		//prints choices to player
		System.out.println(printText);
	}
	
	public String execute(int i)
	{
		//Player inputs which choice-Modifies Final output
		System.out.println(story[i]);
		return outcomes[i];
	}
	

}
