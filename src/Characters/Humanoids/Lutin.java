package Characters.Humanoids;

import Abilities.Entertainable;
import Abilities.Worker;
import Building.SimulatorBuilding;
import Building.Workshops;
import Characters.Creatures.Creature;
import Characters.SimulatorCharacter;

import java.util.Random;

public class Lutin extends Humanoid implements Worker, Entertainable {

    private boolean prankster;

    public Lutin(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    // TODO : Certains lutin peuvent se transformer en lutins farceurs
    public void checkTransformation() {
        if(!prankster && new Random().nextInt(100) < 10) {
            prankster = true;
            System.out.println(getName() + " est devenu un lutin farceur !");
        }
    }
}
