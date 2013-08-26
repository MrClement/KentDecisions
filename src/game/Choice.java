package game;

import java.util.Scanner;

public class Choice {
	
	private Person d;
	private int Final;
	private String printText; //This is the where the first era printext is
	private String [] story; //this stores all the choices and storyline so the execute class can print the choice
	
	
	public Choice(Person p)
	{
		d = p;
	}
	
	public void print()
	{
		//prints choices to player
		System.out.println(printText);
	}
	
	public void execute(int i)
	{
		//Player inputs which choice-Modifies Final output
		System.out.println(story[i]);
	}
	

}
