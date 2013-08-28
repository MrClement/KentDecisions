package choices;

import game.Choice;
import game.Outcome;

public class CurtisAdult {
	private String[] A1Story = {
			"You become a McDoodles worker",
			"You become a mechanic",
			"You become a sports star",
			"You become an engineer",
			"You become a CEO",
			"You become a politician",
			"You fail to become a McDoodles worker. You may wish to reevaluate your life.",
			"You fail to become a mechanic. Perhaps a lower-skill job would be better for you.",
			"You fail to become a sports star. Try to get stronger.",
			"You fail to become an engineer. You should work at McDoodles instead.",
			"You fail to become a CEO.",
			"You fail to become a politician. You're not good enough at wooing voters."
	};
	
	private Outcome[] A1Outcomes = {
		new Outcome(true, 0, 0, 0, 5, 1, 0),
		new Outcome(true, 0, 1, 1, 10, 3, 0),
		new Outcome(true, 5, 0, 10, 20, 10, 0),
		new Outcome(true, 0, 15, 0, 15, 10, 0),
		new Outcome(true, 5, 10, 0, 25, 7, 0),
		new Outcome(true, 10, 7, 0, 15, 10, 0),
		null,
		null,
		null,
		null,
		null,
		new Outcome(true, 0, 0, 0, 0, -20, 0),
		new Outcome(true, 0, 0, 0, 0, -10, 0),
		new Outcome(true, 0, 0, 0, 0, -10, 0),
		new Outcome(true, 0, 0, 0, 0, -10, 0),
		new Outcome(true, 0, 0, 0, 0, -10, 0),
		
	};
	
	
	Choice choiceA1=new Choice("You decide to get a job. The choices are 'McDoodles worker', 'Mechanic', 'Sports Star', 'Pop Star', 'Engineer', 'CEO', or 'Politician'", 
							A1Story, A1Outcomes, 2, 0, 0, 0, 0, 0);
	
	
	
	private String[] A2Story = {
			
	};
	
}
