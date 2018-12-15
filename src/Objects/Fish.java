package Objects;
import java.util.Random;
public class Fish {

    public String getName() {
        Random rand = new Random();
        int scenario = rand.nextInt(4);
        String[] bearsObject = new String[5];
        bearsObject[0] = "a salmon";
        bearsObject[1] = "a rainbow trout";
        bearsObject[2] = "a screwdriver";
        bearsObject[3] = "a photograph of a clown";
        bearsObject[4] = "a diamond ring";
        return bearsObject[scenario];
    }
}
