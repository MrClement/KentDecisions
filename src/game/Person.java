package game;

import java.util.Random;

public class Person {

	private int charisma;
	private int intelligence;
	private int strength;
	private int wealth;
	private boolean gender; // true=male, false=female
	private boolean alive;
	private int age; // 0=youth, 1=teen, 2=adult, 3=old
	private int confidence;
	private String name;

	/**
	 * Person constructs a person with a given name (String), and with the
	 * attributes charisma, intelligence, strength, confidence, and wealth as a
	 * random number from 1 to 10 Gender is automatically assigned to true
	 * (male), age is assigned as 0 (youth), and alive is set to true (alive)
	 * 
	 * @param String
	 *            name
	 */

	public Person(String name) {
		boolean goodEnough = false;
		while (!goodEnough) {
			this.name = name;
			Random rand = new Random();
			this.intelligence = rand.nextInt(9) + 1;
			this.charisma = rand.nextInt(9) + 1;
			this.strength = rand.nextInt(9) + 1;
			this.gender = true;
			this.age = 0;
			this.confidence = rand.nextInt(9) + 1;
			this.alive = true;
			this.wealth = rand.nextInt(9) + 1;
			if ((intelligence + charisma + strength + confidence + wealth) >= 25
					&& (intelligence + charisma + strength + confidence + wealth) <= 30) {
				goodEnough = true;
			}
		}

	}

	/**
	 * getter for a person's charisma
	 * 
	 * @return charisma
	 */
	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getConfidence() {
		return confidence;
	}

	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
