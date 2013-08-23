package game;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Decisions");
		System.out.println("What is your name?");
		String a = s.nextLine();
		Person p = new Person(a);
		
		System.out.println("These are your stats:");
		System.out.println(p.getName() + ":");
		System.out.println("You are a man");
		System.out.println("You are currently a child");
		System.out.println("Charisma = " + p.getCharisma());
		System.out.println("Intelligence = " + p.getIntelligence());
		System.out.println("Strength = " + p.getStrength());
		System.out.println("Wealth = " + p.getWealth());
		System.out.println("Confidence = " + p.getConfidence());
		

	}

}
