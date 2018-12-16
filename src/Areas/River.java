package Areas;
import Objects.Consumables;
import Objects.Fruit;
import People.Person;
import Objects.Fish;

import java.util.Scanner;

public class River extends Area implements Consumables {

    public River(int x, int y){
        super(x,y);
    }

    public void enterArea(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        Scanner choice = new Scanner(System.in);

        System.out.println("You stop in front a glorious river..");
        System.out.println("What do you do?");
        System.out.println("[A] Drink from the Glorious River");
        System.out.println("[B] Look at your reflection");
        System.out.println("[C] You go fishing");
        System.out.println("[D] You do nothing");
        String decision = choice.nextLine();
        if (decision.equals("A")) {
            System.out.println("You cup your hands and scoop some water out of the river and into your parched mouth.");
            x.heal(15);
        }
        else if (decision.equals("B"))
        {
            System.out.println("You sit by the river and ponder about all the mysteries of life...");
        }
        else if (decision.equals("C"))
        {
            Fish f1 = new Fish();
            String fishName = f1.getName();
            System.out.println("You caught " + fishName + "!");
            System.out.println("Do you eat it? [Y/N]");
            String eat = choice.nextLine();
            if (eat.equals("Y"))
            {
                System.out.println("You ate the " + fishName + "!");
                if ((fishName.indexOf("salmon")>=0) || (fishName.indexOf("rainbow trout")>=0))
                {
                    x.heal(5);
                }
                else
                {
                    x.hurt(15);
                }
            }
        }
        System.out.println(x.gethp());
        System.out.println("It looks like there is nothing left to do in this area.");

    }

    public String toString() {

        if (occupant!=null) {
            return("[P]");
        } else {
            return("[ ]");
        }
    }

}
