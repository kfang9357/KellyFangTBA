package Areas;
import java.util.Scanner;
import Objects.Person;

    public class TreeArea {
        Person occupant;
        int xLoc,yLoc;

        public TreeArea(int x, int y)
        {
            xLoc = x;
            yLoc = y;
        }

        /**
         * Method controls the results when a person enters this room.
         * @param x the Person entering
         */
        public void enterRoom(Person x)
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

        public String shakeTrees()
        {
            int scenario = 5*(int)Math.random();
            String[] treesObjects = new String[5];
            treesObjects[0] = "Nothing fell out of the tree.";
            treesObjects[1] = "An apple fell out of the tree.";
            treesObjects[2] = "A pear fell out of the tree.";
            treesObjects[3] = "An orange fell out of the tree.";
            treesObjects[4] = "A dead crow fell out of the tree. Ominous...";
            return treesObjects[scenario];
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

        public void leaveRoom(Person x)
        {
            occupant = null;
        }

    }
