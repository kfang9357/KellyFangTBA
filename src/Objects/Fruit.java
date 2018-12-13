package Objects;

import People.Person;
import People.hp;

public class Fruit {

        public void eat(hp hp) {
            hp.heal(10);
        }

        public String getName() {
            int scenario = 5*(int)Math.random();
            String[] treesObjects = new String[5];
            treesObjects[0] = "Nothing";
            treesObjects[1] = "An apple";
            treesObjects[2] = "A pear";
            treesObjects[3] = "An orange";
            treesObjects[4] = "A dead crow";
            return treesObjects[scenario];
        }
}

