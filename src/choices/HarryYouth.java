package choices;

import game.Choice;
import game.Outcome;
import game.Person;
import game.Requirements;

public class HarryYouth {
	private Person d;
	
	public HarryYouth(Person p)
	{
		d = p;
	}
	
	//Choice1
	Requirements r1 [] =  {
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0)
	};
	
	String [] c1Story = new String []{
			"You leave the object alone! \nBad call on your part you have missed out on a very valuble childhood experience. \nYou should explore more in coming ages.",
			"You are clearly going to grow up to be very self concious and closed off.\nYour choice to not only miss out on a very important experience but to also cry leaves everyone concerned about your outgoingness.",
			"GREAT! You have just found the object you will call BaBa for the rest of your life. \nYou are showing not only the first signs of motion but also outgoingness and bravery to grab an unknown object.\nWhen you grab the object you hear beads rattle and you vigoursly shake.\nYour parents walk in and smile.",
			"Your attempts to do something are amusing and you start to giggle.\n Your parents walk in and smile. You have just found a great skill in life...Being a goof.",
			"Great! You have just found the object you will call MeMe for the rest of your life. \nYou are showing the first signs of motion and your ability to start shaking the object shows intelligence and gives you a new passion...Weightlifting"};
	Outcome [] outcomeLineC1 = new Outcome[]{
			new Outcome(true, 0, 0, 0, 0,-3, 0), 
			new Outcome(true, 0, -2, 0, 0, -4, 0),
			new Outcome(true, 0, 0, 2, 0, 3, 0),
			new Outcome(true, 5, 0, 0, 0, 2, 0),
			new Outcome(true, 0, 0, 6, 0, 2, 0)
			};
	Choice c1 = new Choice(
			"When you are born you see an object in the distance what do you do? \n1. Leave the object alone \n2.Leave the object and cry \n3. Crawl over to the object and grab it \n4.Flail misserably\5.Crawl over to the object and shake it up and down.", 
			c1Story, r1, outcomeLineC1, d, d.getAge(), d.getCharisma(), d.getIntelligence(), d.getStrength(), d.getWealth(), d.getConfidence());
	
	//Choice2
	String [] c2Story = new String[] {
			"Your confidence and charisma have impressed your peers. \nYou are immensily successful and have just found some bros for life! \nYou will surely reap the benefits of being one of the cool kids later in life...Keep it up.",
			"Ohhhh so your one of THOSE kids...",
			"Your dedication to academia is quite apparant.\nKeep it up so your life can go further",
			"Your leadership has united this band of misfits! \nThese are some friends you will keep forever",
			"",
			"",
			"",
			"",
			"",
			"",
			"Your peers think your statement is ingenuine and your not bro enough. 'Leave GDI'. You have failed"			
			};
	
	Outcome [] outcomeLineC2 = new Outcome []{
			new Outcome(true, 3, 0, 0, 2, 6, 0), 
			new Outcome(true, 2, -5, 0, 0, 0, 0),
			new Outcome(true, 0, 6, 0, 0, -2, 0),
			new Outcome(true, 4, 0, 0, 0, 2, 0),	
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(true, -1, 0, 0, 0, -2, 0)
			};
	
	Requirements r2 [] =  {
			new Requirements(2, 0, 0, 0, 5),
			new Requirements(-1,-1,-1,-1,-1),
			new Requirements(0,0,0,0,0),
			new Requirements(0,0,0,0,0),
	};
	
	Choice c2 = new Choice("You are now away from being in the isolated haven now known as 'Home' and you are entering a new place your parents call 'School'. \nWhen you enter this weird place you see kids like yourself running around. \nConfused by everything happening what do you do? \n1.Approach some of the boys that are playing blocks with eachother and say 'What up bros' .\n2.Sit in the corner and sniff and eat glue \n3.Go pick up a book and start looking at pictures. \n4.Approach one of the kids that are playing by themselves.", 
			c2Story, r2, outcomeLineC2, d, d.getAge(), d.getCharisma(), d.getIntelligence(), d.getStrength(), d.getWealth(), d.getConfidence());
	
	//Choice3
	
	
	
	Choice c3 = new Choice("Your teacher says 'Recess' and all the kids go outside what do you do? \n1.", storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);
	Choice c4 = new Choice(printText1, storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);
	Choice c5 = new Choice(printText1, storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);

}
