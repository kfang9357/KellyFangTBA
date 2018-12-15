package Areas;
import Objects.Bear;
import Game.Runner;
import People.Person;


import java.util.Scanner;

public class BearsDen extends Area {

    public BearsDen(int x, int y){
        super(x,y);
    }

    @Override
    public void enterArea(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You walk into a bear's den!");
        Bear b1 = new Bear();
        String bearName = b1.getName();
        System.out.println("You see " + bearName + ".");
        if (bearName.indexOf("bear")>=0)
        {
            b1.fightBear();
        }
        else
        {

        }
        Scanner choice = new Scanner(System.in);
        String decision = choice.nextLine();
        if (decision.equals("Y"))
        {
            fightBear();
            if (fightBear().indexOf("died")>=0)
            {
                Runner.gameOff();
            }
        }
        else if (decision.equals("N"))
        {
            System.out.println("Good call.");
        }
    }


    public String fightBear()
    {
        int scenario = (int)(Math.random())*2;
        String[] bearOutCome = new String[2];
        bearOutCome[0] = "You defeated the bear but got hurt!";
        bearOutCome[1] = "The bear ripped you to shreds! You died.";
        return bearOutCome[scenario];
    }

    public String toString() {

        if (occupant!=null) {
            return("[P]");
        } else {
            return("[B]");
        }
    }

}
