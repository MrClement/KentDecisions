package choices;

import game.Choice;
import game.Outcome;
import game.Person;

public class HarryYouth {
	private Person d;
	
	public HarryYouth(Person p)
	{
		d = p;
	}
	String [] c1Story = new String []{"You leave the object alone! \nBad call on your part you have missed out on a very valuble childhood experience. \nYou should explore more in coming ages.",
			"You are clearly going to grow up to be very self concious and closed off.\nYour choice to not only miss out on a very important experience but to also cry leaves everyone concerned about your outgoingness.",
			"GREAT! You have just found the object you will call BaBa for the rest of your life. \nYou are showing not only the first signs of motion but also outgoingness and bravery to grab an unknown object.\nWhen you grab the object you hear beads rattle and you vigoursly shake.\nYour parents walk in and smile.",
			"Your attempts to do something are amusing and you start to giggle.\n Your parents walk in and smile. You have just found a great skill in life...Being a goof.",
			"Great! You have just found the object you will call MeMe for the rest of your life. \nYou are showing the first signs of motion and your ability to start shaking the object shows intelligence and gives you a new passion...Weightlifting"};
	Outcome [] outcomeLineC2 = new Outcome[]{new Outcome(true, 0, 0, 0, 0,
			-3, 0), new Outcome(true, 0, -2, 0, 0, -4, 0),new Outcome(true, 0, 0, 2, 0, 3, 0),new Outcome(true, 5, 0, 0, 0, 2, 0),new Outcome(true, 0, 0, 6, 0, 2, 0)};
	Choice c1 = new Choice("When you are born you see an object in the distance what do you do? \n1. Leave the object alone \n2.Leave the object and cry \n3. Crawl over to the object and grab it \n4.Flail misserably\5.Crawl over to the object and shake it up and down.", 
			c1Story, outcomeLineC2, d.getAge(), d.getCharisma(), d.getIntelligence(), d.getStrength(), d.getWealth(), d.getConfidence());
	
	String [] c2Story = new String[]{
	Choice c2 = new Choice("You are now away from being in the isolated haven now known as 'Home' and you are entering a new place your parents call 'School'. \nWhen you enter this weird place you see kids like yourself running around. \nConfused by everything happening what do you do?", storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);
	Choice c3 = new Choice(printText1, storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);
	Choice c4 = new Choice(printText1, storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);
	Choice c5 = new Choice(printText1, storylines, outcomelines, age, charisma, intelligence, strength, wealth, confidence);

}
