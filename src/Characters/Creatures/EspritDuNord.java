package Characters.Creatures;

import Abilities.Entertainable;
import Abilities.Worker;

public class EspritDuNord extends Creature implements Worker, Entertainable {

    public EspritDuNord(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }
}
