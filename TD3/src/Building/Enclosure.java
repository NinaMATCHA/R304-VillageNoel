// certains sont ouverts, n’accueille qu’un type de créature à la fois et leur permet
// de se reposer

package Building;

import Characters.Creatures.Creature;
import Characters.SimulatorCharacter;

public class Enclosure extends SimulatorBuilding {

    private boolean Open;

    public Enclosure(double area, int maxCapacity ,Cleanliness cleanliness, boolean Open) {
        super(area, maxCapacity, cleanliness);
        this.Open = Open;
    }

    public boolean isOpen() {
        return Open;
    }


    @Override
    public boolean canAccept(SimulatorCharacter character) {
        if (!(character instanceof Creature)) {
            return false;
        }

        if (getCurrentCapacity() == 0) {
            return true;
        }

        return character.getRace().equals(getPresentCharacters()[0].getRace());
    }

    public void sleepEveryone() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].sleep();
        }
    }

}
