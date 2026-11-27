package Building;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class MaleCabin extends SimulatorBuilding {

    public MaleCabin(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        if (character instanceof Humanoid && character.getSexe().equals("Male")) {
            return true;
        } else {
            return false;
        }
    }

    public void sleepEveryone() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].sleep();
        }
    }

}
