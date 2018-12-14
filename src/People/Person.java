package People;

import Game.Runner;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	private int hp;



	public Person (String firstName, String familyName, int xLoc, int yLoc, int hp)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.hp = hp;
	}

	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public String gethp(){
		return "You have " + hp + " hp left!";
	}


	public void hurt(int amount)
	{
		if (hp - amount >= 1)

		{
			hp = hp - amount;

		}
		else
		{
			System.out.println("Your hp dropped below 0 and you died.");
			Runner.gameOff();
		}
	}

	public void heal(int amount)
	{
		if (hp + amount <= 100) {
			hp = hp + amount;
		}
		else {
			hp = 100;
		}
	}


}
