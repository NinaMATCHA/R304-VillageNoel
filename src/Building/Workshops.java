package Building;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class Workshops extends SimulatorBuilding {

    public Workshops(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui verifie si le personnage peut etre accepté dans le batiment
     * @param character
     * @return true ou false selon les cas
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return character instanceof Humanoid;
    }

    /**
     * Méthode qui fait faire travailler les personnages
     */
    public void work() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();

        for (int i = 0 ; i < getCurrentCapacity() ; i++) {
            charactersPresent[i].doActivity();
            charactersPresent[i].setMagic(charactersPresent[i].getMagic() + 10);
        }
    }
}
