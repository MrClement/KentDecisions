package choices;

import game.Choice;
import game.Outcome;
import game.Person;
import game.Requirements;

public class JeremyTeen {
	
	private Person p;
	
	public JeremyTeen(Person p){
		this.p = p;
	}
	
	private String pt1 = "Welcome to your first day of highschool! Today you get to decide how you want to act.\n1: Become a sports jock.\n2: Hang with the popular crowd.\n3: Study for your classes.\n4: Do nothing";
	private String pt2 = "You get invited to a party. Everyone seems to be having fun. Drugs and alcohol are present.\n1: Get drunk and go crazy\n2: Drive your drunk friend home\n3: Socialize\n4: Stare at your phone";
	private String pt3 = "It is the day before finals. The year is almost over and summer is within your reach. Do you: \n1: Spend your time studying for your tests.\n2: Hang out with your friends and cram the morning of the test.\n3: Don't study and try to cheat off of someone else.\n4: Just kinda chill.";
	private String pt4 = "It is senior year and about time you made up your mind about College. Let's apply! \n1: You apply to the best engineering schools in the country. \n2: You apply to schools with Division A Lax teams. \n3: You apply to law school. \n4: You decide maybe college isn't your thing.";
	private String pt5 = "";
	
	private String[] sl1 = {
		"You get recruited by the Lax team because of your sick Lax skills. Lax.",
		"You meet some new friends. Everyone seems to want to sit next to you at lunch.", 
		"You hit the books. Your grades stay steady and the teachers seem to enjoy your participation in class.",
		"You just kinda coast along. Nobody seems to know a whole lot about you."
	};
	
	private String[] sl2 = {
		"You wake up on a park bench in the next town over wearing a traffic cone as hat.",
		"The next day, your friend thanks you profusely for your wise actions of the previous night.", 
		"You meet a girl named Maria and hit it off.",
		"You stay in the corner and keep to yourself. No one seems to notice your presence."
	};
	
	private String[] sl3 = {
		"After hours of studying you feel ready for your tests. You do well on all of them.",
		"You don't do awesome on your tests, but you feel as though your friends appreciate your carefree style.", 
		"You do well on your tests: maybe a little too well. Nobody has proof of anything, but you lose the trust of those around you.",
		"You do pretty average, although your not even sure your teachers know your name."
	};
	
	private String[] sl4 = {
		"",
		"", 
		"",
		""
	};
	
	private String[] sl5 = {
		"",
		"", 
		"",
		""
	};
	
	private Outcome o1 = new Outcome(true, 2 , -1 , 5, 0, 5, 0);
	private Outcome o2 = new Outcome(true, 5 , -1 , 0, 2, 5, 0);
	private Outcome o3 = new Outcome(true, -1 , 5 , 0, 5, 2, 0);
	private Outcome o4 = new Outcome(true, 2 , 2 , 2, 2, 2, 0); 
	
	private Outcome[] ol1 = {
		o1,
		o2,
		o3,
		o4
	};
	
	private Outcome o5 = new Outcome(true, 7 , -4 , 4, -2, 7, 0);
	private Outcome o6 = new Outcome(true, 3 , 5 , 0, 0, 4, 0);
	private Outcome o7 = new Outcome(true, 6 , 0 , 0, -1, 7, 0);
	private Outcome o8 = new Outcome(true, 2 , 2 , 2, 2, 2, 0); 
	
	private Outcome[] ol2 = {
		o5,
		o6,
		o7,
		o8
	};
	
	private Outcome o9 = new Outcome(true, 0 , 6 , 0, 3, 3, 0);
	private Outcome o10 = new Outcome(true, 6 , 0 , 3, 0, 3, 0);
	private Outcome o11 = new Outcome(true, -2 , 8 , 0, -2, 8, 0);
	private Outcome o12 = new Outcome(true, 2 , 2 , 2, 2, 2, 0); 
	
	private Outcome[] ol3 = {
		o9,
		o10,
		o11,
		o12
	};
	
	private Outcome o13 = new Outcome(true, 2 , -1 , 5, 0, 5, 0);
	private Outcome o14 = new Outcome(true, 5 , -1 , 0, 2, 5, 0);
	private Outcome o15 = new Outcome(true, -1 , 5 , 0, 5, 2, 0);
	private Outcome o16 = new Outcome(true, 2 , 2 , 2, 2, 2, 0); 
	
	private Outcome[] ol4 = {
		o13,
		o14,
		o15,
		o16
	};
	
	private Outcome o17 = new Outcome(true, 2 , -1 , 5, 0, 5, 1);
	private Outcome o18 = new Outcome(true, 5 , -1 , 0, 2, 5, 1);
	private Outcome o19 = new Outcome(true, -1 , 5 , 0, 5, 2, 1);
	private Outcome o20 = new Outcome(true, 2 , 2 , 2, 2, 2, 1); 
	
	private Outcome[] ol5 = {
		o17,
		o18,
		o19,
		o20
	};
	
	private Requirements r1 = new Requirements(2, 0, 2, 0, 2);
	private Requirements r2 = new Requirements(2, 0, 0, 2, 2);
	private Requirements r3 = new Requirements(1, 3, 0, 1, 1);
	private Requirements r4 = new Requirements(0, 0, 0, 0, 0);
	
	private Requirements[] ra1 = {
		r1,
		r2,
		r3,
		r4
	};
	
	private Requirements r5 = new Requirements(2, 0, 2, 0, 2);
	private Requirements r6 = new Requirements(2, 0, 0, 2, 2);
	private Requirements r7 = new Requirements(1, 3, 0, 1, 1);
	private Requirements r8 = new Requirements(0, 0, 0, 0, 0);
	
	private Requirements[] ra2 = {
		r5,
		r6,
		r7,
		r8
	};
	
	private Requirements r9 = new Requirements(2, 0, 2, 0, 2);
	private Requirements r10 = new Requirements(2, 0, 0, 2, 2);
	private Requirements r11 = new Requirements(1, 3, 0, 1, 1);
	private Requirements r12 = new Requirements(0, 0, 0, 0, 0);
	
	private Requirements[] ra3 = {
		r9,
		r10,
		r11,
		r12
	};
	
	private Requirements r13 = new Requirements(2, 0, 2, 0, 2);
	private Requirements r14 = new Requirements(2, 0, 0, 2, 2);
	private Requirements r15 = new Requirements(1, 3, 0, 1, 1);
	private Requirements r16 = new Requirements(0, 0, 0, 0, 0);
	
	private Requirements[] ra4 = {
		r13,
		r14,
		r15,
		r16
	};
	
	private Requirements r17 = new Requirements(2, 0, 2, 0, 2);
	private Requirements r18 = new Requirements(2, 0, 0, 2, 2);
	private Requirements r19 = new Requirements(1, 3, 0, 1, 1);
	private Requirements r20 = new Requirements(0, 0, 0, 0, 0);
	
	private Requirements[] ra5 = {
		r17,
		r18,
		r19,
		r20
	};
	
	Choice c1 = new Choice(pt1, sl1, ra1, ol1, p.getAge(), 0, 0, 0, 0, 0);
	Choice c2 = new Choice(pt2, sl2, ra2, ol2, p.getAge(), 0, 0, 0, 0, 0);
	Choice c3 = new Choice(pt3, sl3, ra3, ol3, p.getAge(), 0, 0, 0, 0, 0);
	Choice c4 = new Choice(pt4, sl4, ra4, ol4, p.getAge(), 0, 0, 0, 0, 0);
	Choice c5 = new Choice(pt5, sl5, ra5, ol5, p.getAge(), 0, 0, 0, 0, 0);
	
	
}
