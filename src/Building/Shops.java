package Building;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class Shops extends SimulatorBuilding {

    public Shops(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui vérifie si le personnage peut être accepté dans le bâtiment
     * @param character
     * @return true ou false selon la race du personnage
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return character instanceof Humanoid;
    }

    /**
     * Méthode qui fait en sorte que les personnages puissent acheter dans le magasin
     */
    public void buy() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].doActivity();
            charactersPresent[i].setMagic(charactersPresent[i].getMagic() + 10);
        }
    }
}
