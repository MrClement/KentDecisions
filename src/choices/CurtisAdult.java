package choices;

import game.Choice;
import game.Outcome;
import game.Person;
import game.Requirements;

public class CurtisAdult {
	private Person p;
	public CurtisAdult(Person p){
		this.p=p;
	}
	
	private String[] A1Story = {
			"You become a McDoodles worker",
			"You become a mechanic",
			"You become a sports star",
			"You become an engineer",
			"You become a CEO",
			"You become a politician",
			"DO NOT READ! in three days you will be kissed by the love of your life, but if you do not repost this to 5 other videos, you will be murdered in two days by a pack of wild puffins!",
			null,
			null,
			null,
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
		new Outcome(true, 0, 0, 0, 0, -10, 0)
		
	};
	
	Requirements[] A1reqs = {
			new Requirements(1,1,1,1,1),
			new Requirements(3,20,15,5,5),
			new Requirements(20,5,30,20,10),
			new Requirements(10,30,5,15,10),
			new Requirements(30,20,5,10,10),
			new Requirements(20,30,5,20,15),
			new Requirements(0,0,0,0,0)
	};
	
	
	
	Choice choiceA1=new Choice("You decide to get a job. The choices are 'McDoodles worker', 'Mechanic', 'Sports Star', 'Engineer', 'CEO', or 'Politician'", 
							A1Story, A1reqs, A1Outcomes, p, 2, 0, 0, 0, 0, 0);
	
	
	private String A2printText = "You are bored at home. You decide to do something. You can read a book, work out, or go to a party";
	
	private String[] A2Story = {
			"You decide to read a book. You are now more intelligent",
			"You decide to work out. You are now stronger",
			"You decide to go to a party. Charisma goes up",
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			"You managed to fail at reading. Are you even literate?",
			"You failed to work out. frynotsureifweakorstupid.jpg",
			"You failed to go to a party. I've given up hope."
	};
	
	private Requirements[] A2Reqs = {
			new Requirements(0, 0, 0, 0, 0),
			new Requirements(0, 0, 0, 0, 0),
			new Requirements(0, 0, 0, 0, 0)
	};
	
	
	private Outcome[] A2Outcomes = {
			new Outcome(true, 0, 10, 0, 0, 0, 0),
			new Outcome(true, 0, 0, 10, 0, 0, 0),
			new Outcome(true, 10, 0, 0, 0, 0, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(true, -5, -5, -5, -5, -5, 0),
			new Outcome(true, -5, -5, -5, -5, -5, 0),
			new Outcome(true, -5, -5, -5, -5, -5, 0)
	};
	
	Choice choiceA2=new Choice(A2printText, A2Story, A2Reqs, A2Outcomes, p, 2, 0, 0, 0, 0, 0);
	
	private String A3printText="You are very lonely. Would you like to try to get married?";
	
	private String[] A3Story= {
			"Congratulations! You managed to convince someone to spend their entire life with you! You are now married.",
			"You decided that married life is not for you.",
			"If this text is displayed, something is horribly wrong",
			"Seriously, if you can see this, they're coming",
			"I'm not kidding. You'd better run",
			"Seriously, RUN!",
			"Well clearly you're not listening to me",
			"I'm going to sit tight while they eat you",
			"and I'm not going to feel any regret",
			"Well, I guess this is a lost cause, bye",
			"You failed to convince somebody to marry you. You must be ugly, poor, or both",
			"How did you possibly fail at not getting married?! I'm ashamed of you."
			
	};
	private Requirements[] A3reqs = {
		new Requirements(30, 20, 15, 20, 25),
		new Requirements(0, 0, 0, 0, 0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
		new Requirements(0,0,0,0,0),
	};
	
	private Outcome[] A3Outcomes = {
		new Outcome(true, 10, 0, 0, -10, 10, 0),
		new Outcome(true, 0, 0, 0, 0, 0, 0),
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		new Outcome(true, -5, 0, 0, 0, -20, 0),
		new Outcome(true, -10, -10, -10, -10, -40, 0),
	};
	Choice choiceA3=new Choice(A3printText, A3Story, A3reqs, A3Outcomes, p, 3,0,0,0,0,0);
	
	private String A4printText = "You really hate people. You're so angry you consider becoming a serial killer. Would you like to become a serial killer?";
	
	private String[] A4Story = {
			"You succeed at becoming a serial killer, you monster",
			"I suppose you don't have the killer instinct",
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			"At the house of your first hit, you are discovered, and the police are called. You are shot by the police and die.",
			"I'm not sure how, but you managed to fail at not becoming a serial killer. I'm going to kill you because of your sheer incompetence. Self-control isn't even an attribute in this game!"
	};
	
	private Outcome[] A4Outcomes = {
			new Outcome(true, 5, 10, 10, -5, 10, 0),
			new Outcome(true, 0, 0, 0, 0, 0, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(false, -100, -100, -100, -100, -100, 0),
			new Outcome(false, -1000, -1000, -1000, -1000, -1000, 0)
			
	};
	
	private Requirements[] A4reqs = {
			new Requirements(40, 30, 20, 20, 0),
			new Requirements(0, 0, 0, 0, 0)
	};
	
	Choice choiceA4=new Choice(A4printText, A4Story, A4reqs, A4Outcomes, p, 3, 30, 0, 0, 0, 0);
	
	private String A5PrintText = "Kids?";
	
	private String[] A5Story = {
			"You've had a baby! prepare for the next 18 years well",
			"Maybe? Well, I suppose I'll choose for you and give you a baby, you seem qualified enough. Your reluctance will not, however, go unpunished",
			"I suppose having a kid isn't for everybody",
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			"You didn't manage to have a baby. You aren't very good at this, are you?",
			"Maybe? You seem horribly unqualified to have a kid, so I'll spare the baby and not let you have one",
			"You failed (somehow) at not having a kid, so you'll get one anyway"
	};
	
	private Requirements[] A5Reqs = {
			new Requirements(5, 0, 5, 0, 0),
			new Requirements(5, 15, 10, 20, 0),
			new Requirements(0, 0, 0, 0, 0)
	};
	
	private Outcome[] A5Outcomes = {
			new Outcome(true, 5, 5, 5, -20, 5, 1),
			new Outcome(true, 5, 5, 5, -30, -10, 1),
			new Outcome(true, 0, 0, 0, 0, 0, 1),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(true, 0, 0, 0, -5, -15, 1),
			new Outcome(true, 0, 0, 0, 0, 0, 1),
			new Outcome(true, -5, -5, -5, -40, -5, 1)
	};
	
	Choice choiceA5=new Choice(A5PrintText, A5Story, A5Reqs, A5Outcomes, p, 3, 0, 0, 0, 0, 0);
			
}
