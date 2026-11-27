package Characters.Creatures;

import Abilities.Entertainable;
import Abilities.Worker;

public class Rennes extends Creature implements Worker, Entertainable {

    public Rennes(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }
}
