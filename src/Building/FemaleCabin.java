package Building;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class FemaleCabin extends SimulatorBuilding {

    public FemaleCabin(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui verifie si le personnage peut etre accepte dans le bâtiment
     * @param character
     * @return true ou false selon les cas
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        if (character instanceof Humanoid && character.getSexe().equals("Female")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Méthode qui fait faire dormir tout le monde
     */
    public void sleepEveryone() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].sleep();
        }
    }
}
