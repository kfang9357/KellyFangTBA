package Areas;

import Game.Runner;
import People.Person;

public class Civilization extends Area
{

	public Civilization(int x, int y) {
		super(x, y);

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterArea(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You find your way back to life.");
		Runner.gameOff();
	}

	public String toString() {

		if (occupant!=null) {
			return("[ ]");
		} else {
			return("[C]");
		}
	}
	

}
