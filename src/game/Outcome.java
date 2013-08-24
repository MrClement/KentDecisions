package game;
/**
 * 
 * @author wdencker
 *
 */

public class Outcome {
	private int choiceList;
	private int choiceNumber;
	private boolean canDo;
	/**
	 * 
	 * @param choiceList is the number associated with the group of choices the player is
	 * presented with - determined in the Choices class.
	 * @param choiceNumber is the number of the choice in the choice list
	 * that is selected by the user and determined in the Choices class
	 * @param canDo is a boolean that indicates whether the character can do the selected
	 * decision successfully (determined in Choices class based off stats in the Person class
	 */
	
	//canDo is a boolean - also determined in choices class - that indicates whether the 
	//character can do the 
	public Outcome(int choiceList, int choiceNumber, boolean canDo) {
		this.choiceList = choiceList;
		this.choiceNumber = choiceNumber;
		this.canDo = canDo;
	}

}
