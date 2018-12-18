package Areas;
import java.util.Scanner;
import People.Person;
import Objects.Fruit;
import Objects.Consumables;


    public class TreeArea extends Area implements Consumables{

      public TreeArea(int x, int y){
            super(x,y);
        }

        public void enterArea(Person x) {
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);

            Scanner choice = new Scanner(System.in);

            System.out.println("You enter an area surrounded by trees and bushes.");
            System.out.println("Would you like to shake the trees? [Y/N]");
            String decision = choice.nextLine();
            if (decision.equals("Y"))
            {
                Fruit a1 = new Fruit();
                String fruitName = a1.getName();
                System.out.println(fruitName + " fell out of the tree.");
                System.out.println("Do you eat it? [Y/N]");
                decision = choice.nextLine();
                if (decision.equals("Y") ){
                    System.out.println("You eat " + fruitName + ".");
                    if ((fruitName.equals("a battery") || (fruitName.equals("a dead crow"))))
                    {
                        x.hurt(10);
                    }
                    else {
                        x.heal(10);
                    }
                }
                else if (decision.equals("N")){
                    System.out.println("You do not eat " + fruitName);
                }
                else {
                    System.out.println("Please choose [Y/N]");
                }
            }
            else if (decision.equals("N"))
            {
                System.out.println("Oh well...");
            }

            System.out.println("Would you like to shake the bushes? [Y/N]");
            String decision2 = choice.nextLine();
            if (decision2.equals("Y")) {
                Fruit f1 = new Fruit();
                String fruit = f1.getName2();
                System.out.println(fruit + " fell out of the bush.");
                System.out.println("Do you eat it? [Y/N]");
                String eat2 = choice.nextLine();
                if (eat2.equals("Y")) {
                    if (fruit.equals("a remote control") || (fruit.equals("a baseball")))
                    {
                        x.hurt(10);
                    }
                    else {
                        x.heal(10);
                    }
                    System.out.println("You ate " + fruit + ".");
                    System.out.println(x.gethp());

                } else if (eat2.equals("N")) {
                    System.out.println("Oh well...");
                } else {
                    System.out.println("Please choose [Y/N]");
                }

            } else if (decision2.equals("N")) {
                System.out.println("Oh well...");
            }
            System.out.println("It seems like there is nothing left to do in this area.");
        }
        public String toString() {

            if (occupant!=null) {
                return("[P]");
            } else {
                return("[ ]");
            }
        }
    }
