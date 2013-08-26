package game;

import java.util.Scanner;

public class Choice {
	
	private Person d;
	private int Final;
	
	
	public Choice(Person p)
	{
		d = p;
	}
	
	public void print()
	{
		//prints choices to player
		System.out.println("Welcome to the game!");
	}
	
	public int execute(int i)
	{
		//Player inputs which choice-Modifies Final output
		Final = i;
		return Final;
	}
	
	public int getFinal()
	{
		return Final;
	}

}
