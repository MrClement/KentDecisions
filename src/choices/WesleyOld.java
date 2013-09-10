package choices;

import game.Choice;
import game.Outcome;
import game.Person;
import game.Requirements;

public class WesleyOld {
	private Person p;
	
	public WesleyOld(Person p){
		this.p = p;
	}
	
	private String pt1 = "After what has been an eternity of work and focus, it's time to retire.  As you know, you're getting older.  What will you focus on after retirement?\n1. Invest in stocks\n2. Expand your wisdom\n3. Go after younger women\n4. Relax and do what you want";
	private String pt2 = "You sit at your house and you realize there is yard work to be done outside, but due to your age, you're not sure if it would be best to do it yourself.  What do you do?\n1. Hire gardener\n2. Take advantage of 'slave labor' by paying the neighborhood kid 1 cent per weed he picks\n3. Go out and try to do it yourself\n4. Put off the yard work ";
	private String pt3 = "Time to update your will.  Who do you leave your most prized possesions and fortunes to?\n1. Your family\n2. Your mistress\n3. Charity\n4. Dedicate your net worth to maintaining your legacy.";
	private String pt4 = "Your family wants you to move into a nursing home. How do you respond?\n1. Move into the nursing home\n2. Move to a tropical island paradise \n3. Refuse to move into the nursing home and stay in your house\n4. Force your family to let you stay with them";
	private String pt5 = "Your doctor tells you that you are on the verge of death.  What is the last thing you decide to do before you die?\n1. Go on the vacation of a lifetime\n2. Climb Mount Everest\n3. Solidify your legacy\n4. Relax and wait to die in peace with the Wu Wei wisdom you have gained through a lifetime of experience";
	
	private String[] sl1 = {
			"You succesfully invest in stocks. You make bank.",
			"You successfully expand your wisdom. You are now a wise old man.",
			"You successfully go after younger women. Even in your later days, you can sure still pull.",
			"You decide to relax and do nothing. Wu Wei.",
			null,
			null,
			null,
			null,
			null,
			null,
			"You fail investing in stocks, and lose a substantial amount of your money.",
			"You fail to expand your wisdom. Seems like your intelligence will not make great gains.",
			"You fail to get any younger women. Maybe your pickup lines threw them off.",
			"You cannot relax. Maybe you should try meditation."
		};
	
	private Outcome [] o1 = {
		new Outcome(true, 2, 2, 0, 20, 10, 0),
		new Outcome(true, 2, 20, 0, 2, 10, 0),
		new Outcome(true, 20, 0, 5, 5, 20, 0),
		new Outcome(true, 20, 0, 20, 0, 20, 0),
		null,
		null,
		null,
		null,
		null,
		null,
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		
	};
	
	private Requirements [] r1 = {
			new Requirements(0, 15, 0, 15, 15),
			new Requirements(0, 15, 0, 5, 15),
			new Requirements(15, 5, 15, 15, 20),
			new Requirements(0, 0, 15, 0, 20),
	};
	
	Choice c1 = new Choice(pt1, sl1, r1, o1, p, p.getAge(), 0, 0, 0, 0, 0);
	
	private String[] sl2 = {
			"You hire a gardener, and he takes care of your yard problem. Smart move.",
			"You exploitative old man. Way to take advantage of the youth. Nonetheless, the yard work is done.",
			"You go outside and get the yard work done. Your health is impressive at your age.",
			"You put off the yard work. The yard work remains unfinished, but at least you don't have to spend money.",
			null,
			null,
			null,
			null,
			null,
			null,
			"You can't hire a good gardenenr, and thus your yard remains unkempt",
			"You can't seem to hire a young man to do your yard work. Maybe they are afraid of you.",
			"Why did you try that? You know your health isn't what it used to be.  The yard work is not ever finished.",
			"You put off the yard work. The yard work remains unfinished, but at least you don't have to spend money."
		};
	
	private Outcome [] o2 = {
		new Outcome(true, 0, 5, 10, -1, 10, 0),
		new Outcome(true, 10, 15, 10, 5, 15, 0),
		new Outcome(true, 5, 5, 0, 10, 20, 0),
		new Outcome(true, 0, 0, 10, 10, 0, 0),
		null,
		null,
		null,
		null,
		null,
		null,
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		new Outcome(true, -1, -1, -1, -1, -1, 0),
		
	};
	
	private Requirements [] r2 = {
			new Requirements(5, 0, 0, 15, 10),
			new Requirements(10, 10, 0, 10, 20),
			new Requirements(0, 0, 35, 0, 25),
			new Requirements(0, 0, 0, 0, 15),
	};
	
	Choice c2 = new Choice(pt2, sl2, r2, o2, p, p.getAge(), 0, 0, 0, 0, 0);
	
	private String[] sl3 = {
			"You leave your most important possesions to your family. You are quite the family man.",
			"You leave your estate to your mistress. If your wife outlives you, you can only imagine what she would say.",
			"You leave your fortune to charity. You are quite the philanthropist.",
			"You set up a fund to create giant statues and public services in your name.  You shall be remembered forever.",
			null,
			null,
			null,
			null,
			null,
			null,
			"Your ego prevents you from leaving your possesions to your family. You should feel ashamed.",
			"You fail to leave your estate to your mistress, and are caught by your wife. You get divorced.",
			"You wouldn't really do that? Let's be honest. Better keep all that money away from those money grabbing idiots.",
			"Come on? We both know you wouldn't do that. That's not in your capacity."
		};
	
	private Outcome [] o3 = {
			new Outcome(true, 10, 0, 0, 10, 0, 0),
			new Outcome(true, 5, 0, 0, 0, 15, 0),
			new Outcome(true, 15, 0, 0, 15, 0, 0),
			new Outcome(true, 15, 0, 0, 5, 20, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			
		};
	
	private Requirements [] r3 = {
			new Requirements(10, 15, 0, 0, 10),
			new Requirements(25, 0, 0, 0, 25),
			new Requirements(15, 0, 0, 5, 10),
			new Requirements(30, 0, 0, 30, 30),
	};
	
	Choice c3 = new Choice(pt3, sl3, r3, o3, p, p.getAge(), 0, 0, 0, 0, 0);
	
	private String[] sl4 = {
			"You move into the nursing home without complaint. You agree with your family that it is best.",
			"You offer a better idea and buy a remote island tropical paradise. Sounds nice.",
			"You successfully stay in your home by putting your family off.",
			"You come up with an idea that makes your family wish they never even suggested you move in to the nursing home. You move into your younger family's home tomorrow.",
			null,
			null,
			null,
			null,
			null,
			null,
			"You can't move into the nursing home. Even though you want it, you know it just won't work.",
			"Really? Since when could you afford a tropical island home?",
			"You fail to stay in your home, and your family is insistent. You are forced to go to the nursing home.",
			"Your family does not let that happen, and you are not insistent enough. You go to the nursing home."
		};
	
	private Outcome [] o4 = {
			new Outcome(true, 10, 0, 0, 10, 5, 0),
			new Outcome(true, 10, 0, 5, 0, 20, 0),
			new Outcome(true, 10, 0, 0, 10, 10, 0),
			new Outcome(true, 10, 0, 0, 15, 10, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			new Outcome(true, -1, -1, -1, -1, -1, 0),
			
		};
	
	private Requirements [] r4 = {
			new Requirements(0, 0, 0, 0, 0),
			new Requirements(10, 0, 20, 40, 25),
			new Requirements(10, 10, 15, 15, 15),
			new Requirements(15, 15, 10, 0, 20),
	};
	
	Choice c4 = new Choice(pt4, sl4, r4, o4, p, p.getAge(), 0, 0, 0, 0, 0);

	
	private String[] sl5 = {
			"You go on the vacation of your dreams. You die in peace, sleeping on the beach.",
			"You begin to climb Mount Everest, and as you reach your arms into the sky at the top of the mountain, you die in complete ecstacy.",
			"You succesfully solidify your legacy. Your dead body is coated in gold and made into a statue at the center of your home town.",
			"You die without desire in your mind, and with wisdom in your mind. Peace eternalizes you, and you are reincarnated.",
			null,
			null,
			null,
			null,
			null,
			null,
			"You can't afford the tropical island vacation, and you die in a hospital from a heart attack.",
			"Your health is definitely not up for that, and you die a painful and slow death of an unusual disease you catch traveling to the mountain.",
			"You fail to solidify your legacy, and die as an unknown man with little money and few friends.",
			"You have not embraced Wu Wei, and you die a life of eternal suffering and dispair."
		};
	private Outcome [] o5 = {
			new Outcome(false, 20, 0, 15, 15, 30, 0),
			new Outcome(false, 20, 0, 25, 0, 25, 0),
			new Outcome(false, 45, 0, 0, 0, 45, 0),
			new Outcome(false, 30, 70, 0, 0, 25, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			new Outcome(false, -1, -1, -1, -1, -1, 0),
			new Outcome(false, -1, -1, -1, -1, -1, 0),
			new Outcome(false, -1, -1, -1, -1, -1, 0),
			new Outcome(false, -1, -1, -1, -1, -1, 0),
			
		};
	
	private Requirements [] r5 = {
			new Requirements(20, 0, 30, 30, 30),
			new Requirements(15, 0, 40, 20, 30),
			new Requirements(40, 0, 0, 30, 35),
			new Requirements(15, 40, 0, 0, 0),
	};

	Choice c5 = new Choice(pt5, sl5, r5, o5, p, p.getAge(), 0, 0, 0, 0, 0);

	
}
