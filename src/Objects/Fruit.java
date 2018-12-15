package Objects;
import java.util.Random;

public class Fruit {


        public String getName() {
            Random rand = new Random();
            int scenario = rand.nextInt(4);
            String[] treesObjects = new String[5];
            treesObjects[0] = "a banana";
            treesObjects[1] = "a apple";
            treesObjects[2] = "a pear";
            treesObjects[3] = "a battery";
            treesObjects[4] = "a dead crow";
            return treesObjects[scenario];
        }

    public String getName2() {
        Random rand = new Random();
        int scenario = rand.nextInt(4);
        String[] treesObjects = new String[5];
        treesObjects[0] = "a blueberry";
        treesObjects[1] = "a blackberry";
        treesObjects[2] = "a plum";
        treesObjects[3] = "a remote control";
        treesObjects[4] = "a baseball";
        return treesObjects[scenario];
    }
}

