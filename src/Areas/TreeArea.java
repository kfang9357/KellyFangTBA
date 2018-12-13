package Areas;
import java.util.Scanner;
import People.Person;
import Objects.Consumables;
import Objects.Fruit;

    public class TreeArea extends Area {
      public TreeArea(int x, int y){
            super(x,y);
        }

        public void enterArea(Person x)
        {
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);

            System.out.println("You enter an area surrounded by trees and bushes.");
            System.out.println("Would you like to shake the trees? [Y/N]");
            Scanner choice = new Scanner(System.in);
            String decision = choice.nextLine();
            if (decision.equals("Y"))
            {
                shakeTrees();
            }
            else if (decision.equals("N"))
            {
                System.out.println("Oh well...");
            }
            System.out.println("Would you like to shake the bushes? [Y/N]");
            if (decision.equals("N"))
            {
                shakeBushes();
            }
            else if (decision.equals("N"))
            {
                System.out.println("Oh well...");
            }
        }

        public void shakeTrees()
        {
            Fruit fruit = new Fruit();
            System.out.println(fruit.getName() + " fell out of the tree.");
            System.out.println("Do you eat it? [Y/N]");
            Scanner choice = new Scanner(System.in);
            if (choice.equals("Y"))
            {
                hp.heal
            }

        }

        public String shakeBushes()
        {
            int scenario = 6*(int)Math.random();
            String[] bushesObjects = new String[5];
            bushesObjects[0] = "Nothing fell out of the bushes.";
            bushesObjects[1] = "Some rasberries fell out of the bush.";
            bushesObjects[2] = "Some blueberries fell out of the bush.";
            bushesObjects[3] = "Some blackberries fell out of the bush.";
            bushesObjects[4] = "A battery fell out of the bushes.";
            return bushesObjects[scenario];
        }

        public String toString() {

            if (occupant!=null) {
                return("[P]");
            } else {
                return("[R]");
            }
        }

    }
