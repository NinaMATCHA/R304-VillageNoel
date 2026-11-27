package Characters.Creatures;

import Abilities.Entertainable;
import Abilities.Worker;

public class Snowman extends Creature implements Worker, Entertainable {

    public Snowman(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    //  tue les bonshommes de neige vivant si ils restent trop longtemps dans un bâtiment à l'intérieur
}
