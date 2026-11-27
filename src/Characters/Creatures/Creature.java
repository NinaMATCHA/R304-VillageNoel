package Characters.Creatures;

import Building.SimulatorBuilding;
import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

import java.util.Random;

public abstract class Creature extends SimulatorCharacter {

    public Creature() {
        super();
    }

    public Creature(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    public void funeralEncounter(SimulatorBuilding building) {
        SimulatorCharacter[] presents = building.getPresentCharacters();
        int count = building.getCurrentCapacity();

        // y a-t-il une créature, et combien d'humanoïdes ?
        SimulatorCharacter creature = null;
        int humanoidCount = 0;
        for (int i = 0; i < count; i++) {
            if (presents[i] instanceof Creature) {
                creature = presents[i];
            } else if (presents[i] instanceof Humanoid) {
                humanoidCount++;
            }
        }
        if (creature == null || humanoidCount == 0) {
            return;
        }

        // choisir une victime au hasard parmi les humanoïdes
        Random random = new Random();
        int target = random.nextInt(humanoidCount);
        SimulatorCharacter victim = null;
        int seen = 0;
        for (int i = 0; i < count; i++) {
            if (presents[i] instanceof Humanoid) {
                if (seen == target) {
                    victim = presents[i];
                    break;
                }
                seen++;
            }
        }

        // probabilité : forte s'il se repose, faible sinon (bruyant)
        int chance = victim.isTirednessMeter() ? 50 : 10;
        if (random.nextInt(100) >= chance) {
            return;
        }

        // les témoins perdent beaucoup de magie
        System.out.println(creature.getName() + " dévore " + victim.getName() + " !");
        for (int i = 0; i < count; i++) {
            if (presents[i] instanceof Humanoid && presents[i] != victim) {
                presents[i].setMagic(Math.max(0, presents[i].getMagic() - 30));
            }
        }

        // la victime disparaît du bâtiment (en dernier, car ça décale le tableau)
        building.removeCharacter(victim);
    }
}
