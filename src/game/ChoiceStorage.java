package game;

import java.util.ArrayList;

public class ChoiceStorage {

	private ArrayList<Choice> choices = new ArrayList<Choice>();

	/**
	 * Builds a new instance of ChoiceStorages
	 */
	public ChoiceStorage() {
		
	}
	
	private boolean isQualified(Person p, Choice c){
		if(!(p.getAge()==c.getAge())){
			return false;
		}
		else if(!(p.getCharisma()>=c.getCharisma())){
			return false;
		}
		else if(!(p.getConfidence()>=c.getConfidence())){
			return false;
		}
		else if(!(p.getIntelligence()>=c.getIntelligence())){
			return false;
		}
		else if(!(p.getStrength()>=c.getStrength())){
			return false;
		}
		else if(!(p.getWealth()>=c.getWealth())){
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
	public Choice getNextChoice(Person p) {
		return null;
	}

}
