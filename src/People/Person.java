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

	public String gethp()
	{
		return ("You have " + hp + " hp left!" );
	}

	public void hurt()
	{
		if (hp>=11)
		{
			hp = hp - 10;

		}
		else
		{
			System.out.println("Your hp dropped below 0 and you died.");
			Runner.gameOff();
		}
	}

	public void heal()
	{
		if (hp<=90) {
			hp = hp + 10;
		}
		else {
			hp = 100;
		}
	}

}
