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

        Scanner choice = new Scanner(System.in);

        if (bearName.indexOf("bear")>=0)
        {
            System.out.println("Do you want to fight the bear? [Y/N]");
            String a = choice.nextLine();
            if (a.equals("Y"))
            {
                String scenario = b1.fightBear();
                System.out.println(scenario);
                if (scenario.indexOf("kills")>=0)
                {
                    Game.Runner.gameOff();
                }
                else if (scenario.indexOf("health")>-0)
                {
                    x.heal(20);
                }
                else if (scenario.indexOf("hurts")>=0)
                {
                    x.hurt(30);
                }
            }
            else
            {
                System.out.println("Good call...");
            }
            x.gethp();
        }

        System.out.println("It seems like there is nothing left to do in this area");
    }


    public String toString() {

        if (occupant!=null) {
            return("[P]");
        } else {
            return("[ ]");
        }
    }

}
