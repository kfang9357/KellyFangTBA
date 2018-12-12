package Objects;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	int healthPoints;
	String firstName;
	String familyName;
	int xLoc, yLoc;



	public Person (String firstName, String familyName, int xLoc, int yLoc, int healthPoints)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.healthPoints = healthPoints;
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

	public int getHealthPoints() {return healthPoints;}

	public void setHealthPoints() {this.healthPoints = healthPoints;}

}
