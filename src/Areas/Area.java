package Areas;

import People.Person;

public class Area {
    Person occupant;
    int xLoc,yLoc;

    public Area(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterArea(Person x)
    {
        System.out.println("You find yourself in a part of the forest with nothing...");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveArea(Person x)
    {
        occupant = null;
    }

}
