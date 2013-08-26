package game;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		/////////// Makes new Person with name a ///////////
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Decisions");
		System.out.println("What is your name?");
		String a = s.nextLine();
		Person p = new Person(a);
		
		/////////// Outputs stats generated randomly upon creation of Person p ///////////
		
		System.out.println("These are your stats:");
		System.out.println(p.getName() + ":");
		System.out.println("You are male");
		System.out.println("You are currently a child");
		System.out.println("Charisma = " + p.getCharisma());
		System.out.println("Intelligence = " + p.getIntelligence());
		System.out.println("Strength = " + p.getStrength());
		System.out.println("Wealth = " + p.getWealth());
		System.out.println("Confidence = " + p.getConfidence());
		
		/////////// Runs the Game ///////////
		
		while (p.isAlive() == true){
			
		}
		

	}

}
