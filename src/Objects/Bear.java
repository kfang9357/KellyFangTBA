package Objects;
import java.util.Random;
import java.util.Scanner;

public class Bear {
    public String getName() {

        Random rand = new Random();
        int scenario = rand.nextInt(4);
        String[] bearsObject = new String[5];
        bearsObject[0] = "a grizzly bear";
        bearsObject[1] = "a black bear";
        bearsObject[2] = "a mutant bear";
        bearsObject[3] = "an old renaissance painting ";
        bearsObject[4] = "a flash drive";
        return bearsObject[scenario];
    }

    public void fightBear()
    {
        Random rand2 = new Random();
        int scenario = rand2.nextInt(2);
        String[] bearScnario = new String[3];
        bearScnario[0] = "the bear kills you!";
        bearScnario[1] = "you kill the bear!";
        bearScnario[2] = "you and the bear form a spiritual connection.";
        Scanner choice = new Scanner(System.in);
        System.out.println("Do you want to fight the bear? [Y/N]");
        String a = choice.nextLine();
        if (a.equals("Y"))
        {
            System.out.println(bearScnario[scenario]);
        }
        else
        {
            System.out.println("Good call...");
        }
    }

}
