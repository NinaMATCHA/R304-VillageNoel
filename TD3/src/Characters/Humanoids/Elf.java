package Characters.Humanoids;

import Abilities.Worker;
import Building.SimulatorBuilding;
import Building.Workshops;
import Characters.Creatures.Creature;
import Characters.SimulatorCharacter;

public class Elf extends Humanoid implements Worker {

    public Elf(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }
}