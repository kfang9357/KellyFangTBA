package People;

import Game.Runner;

public class hp {
    private int hp;

    public hp(int hp)
    {
        this.hp = hp;
    }


    public String gethp()
    {
        return ("You have " + hp + " hp left!" );
    }

    public void hurt()
    {
        if (hp>=11)
        {
            hp = hp - 10;

        }
        else
        {
            System.out.println("Your hp dropped below 0 and you died.");
            Runner.gameOff();
        }
    }

    public void heal(int g)
    {
        if (hp + g <=100) {
            hp = hp + g;
        }
        else {
            hp = 100;
        }
    }

}
