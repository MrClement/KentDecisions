package game;

import java.util.ArrayList;

public class ChoiceStorage {
	private int currentChoice=-1;
	private ArrayList<Choice> choices = new ArrayList<Choice>();

	/**
	 * Builds a new instance of ChoiceStorages
	 */
	public ChoiceStorage(Person p) {
	
	}
	
	/**
	 * returns a boolean that is true if the person's attributes satisfy all
	 * of the requirements for the choice c 
	 * @param p
	 * @param c
	 * @return whether or not the person p is qualified for choice c
	 */
	private boolean isQualified(Person p, Choice c){

		 if(!(p.getCharisma()>=c.getCharismaReq())){
			return false;
		}
		else if(!(p.getConfidence()>=c.getConfindenceReq())){
			return false;
		}
		else if(!(p.getIntelligence()>=c.getIntelligenceReq())){
			return false;
		}
		else if(!(p.getStrength()>=c.getStrengthReq())){
			return false;
		}
		else if(!(p.getWealth()>=c.getWealthReq())){
			return false;
		}
		return true;
	}

	/**
	 * @param p
	 *            A person object
	 * 
	 * @return A choice that the person is qualified for
	 */
	/**
	 * @param p
	 * @return
	 */
	public Choice getNextChoice(Person p) {
		Choice selectedChoice=choices.get(currentChoice+1);
		currentChoice++;
		boolean qualified=false;

		while(!qualified){
			if(this.isQualified(p, selectedChoice)){
				qualified=true;
			}
			else{
				selectedChoice=choices.get(currentChoice+1);
			}
		}
		return selectedChoice;
	}

}
