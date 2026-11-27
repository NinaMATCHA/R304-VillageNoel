package Characters.Humanoids;

import Abilities.Entertainable;
import Abilities.Worker;

public class Lutin extends Humanoid implements Worker, Entertainable {

    public Lutin(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }


    @Override
    public void play() {
        System.out.print(getName() + " Le " + getRace() + " se divertit.");
        setMagic(getMagic() + 10);
    }

    @Override
    public void work() {
        System.out.print(getName() + " Le " + getRace() + " Travaille.");
        setMagic(getMagic() + 10);
    }

    // TODO : Certains lutin peuvent se transformer en lutins farceurs
}
