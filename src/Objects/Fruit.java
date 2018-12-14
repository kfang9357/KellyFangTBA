package Objects;
import java.util.Random;

public class Fruit {


        public String getName() {
            Random rand = new Random();
            int scenario = rand.nextInt(4);
            String[] treesObjects = new String[5];
            treesObjects[0] = "A banana";
            treesObjects[1] = "An apple";
            treesObjects[2] = "A pear";
            treesObjects[3] = "A battery";
            treesObjects[4] = "A dead crow";
            return treesObjects[scenario];
        }

    public String getName2() {
        Random rand = new Random();
        int scenario = rand.nextInt(4);
        String[] treesObjects = new String[5];
        treesObjects[0] = "A blueberry";
        treesObjects[1] = "A blackberry";
        treesObjects[2] = "A plum";
        treesObjects[3] = "A remote control";
        treesObjects[4] = "A baseball";
        return treesObjects[scenario];
    }
}

