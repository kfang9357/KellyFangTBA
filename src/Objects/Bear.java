package Objects;
import Game.Runner;
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

    public String fightBear() {
        Random rand2 = new Random();
        int scenario = rand2.nextInt(3);
        String[] bearScnario = new String[4];
        bearScnario[0] = "the bear kills you!";
        bearScnario[1] = "you kill the bear!";
        bearScnario[2] = "you and the bear form a spiritual connection. she lends you some of her health.";
        bearScnario[3] = "the bear hurts you!";
        String b = bearScnario[scenario];
        return b;
    }

}
