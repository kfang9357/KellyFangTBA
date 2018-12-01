package Rooms;

import Game.Runner;
import People.Person;

public class NewRoom extends Room {

    public NewRoom (int x, int y){
        super(x,y);
    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("There was a booby trap! You died.");
        Runner.gameOff();
    }
}
