package Building;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class Offices extends SimulatorBuilding {

    public Offices(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui verifie si le personnage peut etre accepte dans le batiment
     * @param character
     * @return
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return character instanceof Humanoid;
    }

    /**
     * Méthode qui fait faire travailler
     */
    public void workEveryone() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].doActivity();
        }
    }
}