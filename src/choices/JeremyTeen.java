package choices;

import game.Choice;
import game.Outcome;
import game.Person;

public class JeremyTeen {
	
	private Person p;
	
	public JeremyTeen(Person p){
		this.p = p;
	}
	
	private String pt1 = "Welcome to your first day of highschool! Today you get to decide how you want to act.\n1: Become a sports jock.\n2: Hang with the popular crowd.\n3: Study for your classes.\n4: Do nothing";
	private String pt2 = "You get invited to a party. Everyone seems to be having fun. Drugs and alcohol are present.\n1: Get drunk and go crazy\n2: Drive your drunk friend home\n3: Socialize\n4: Stare at your phone";
	private String pt3 = "";
	private String pt4 = "";
	private String pt5 = "";
	
	private String[] sl1 = {
		"You get recruited by the Lax team because of your sick Lax skills. Lax.",
		"You meet some new friends. Everyone seems to want to sit next to you at lunch.", 
		"You hit the books. Your grades stay steady and the teachers seem to enjoy your participation in class.",
		"You just kinda coast along. Nobody seems to know a whole lot about you."
	};
	
	private String[] sl2 = {
		"",
		"", 
		"",
		""
	};
	
	private String[] sl3 = {
		"",
		"", 
		"",
		""
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
	
	private Outcome o5 = new Outcome(true, 2 , -1 , 5, 0, 5, 0);
	private Outcome o6 = new Outcome(true, 5 , -1 , 0, 2, 5, 0);
	private Outcome o7 = new Outcome(true, -1 , 5 , 0, 5, 2, 0);
	private Outcome o8 = new Outcome(true, 2 , 2 , 2, 2, 2, 0); 
	
	private Outcome[] ol2 = {
		o5,
		o6,
		o7,
		o8
	};
	
	private Outcome o9 = new Outcome(true, 2 , -1 , 5, 0, 5, 0);
	private Outcome o10 = new Outcome(true, 5 , -1 , 0, 2, 5, 0);
	private Outcome o11 = new Outcome(true, -1 , 5 , 0, 5, 2, 0);
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
	
	Choice c1 = new Choice(pt1, sl1, ol1, p.getAge(), 0, 0, 0, 0, 0);
	Choice c2 = new Choice(pt2, sl2, ol2, p.getAge(), 0, 0, 0, 0, 0);
	Choice c3 = new Choice(pt3, sl3, ol3, p.getAge(), 0, 0, 0, 0, 0);
	Choice c4 = new Choice(pt4, sl4, ol4, p.getAge(), 0, 0, 0, 0, 0);
	Choice c5 = new Choice(pt5, sl5, ol5, p.getAge(), 0, 0, 0, 0, 0);
	
	
}
