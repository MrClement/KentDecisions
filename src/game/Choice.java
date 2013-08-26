package game;

import java.util.Scanner;

public class Choice {
	
	private Person d;
	private int Final;
	private String printText;
	private String [] story;
	
	
	public Choice(Person p)
	{
		d = p;
	}
	
	public void print()
	{
		//prints choices to player
		System.out.println(printText);
	}
	
	public int execute(int i)
	{
		//Player inputs which choice-Modifies Final output
		Final = i;
		System.out.println(story[i]);
		return Final;
	}
	
	public int getFinal()
	{
		return Final;
	}

}
