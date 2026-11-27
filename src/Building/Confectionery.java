// permets à tous les personnages de se restaurer

package Building;

import Characters.SimulatorCharacter;
import Food.Food;
import Food.FoodType;

public class Confectionery extends SimulatorBuilding {

    public Confectionery(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui vérifie si le personnage peut être accepté
     * @param character
     * @return true
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return true;
    }

    /**
     * Méthode qui fait manger tout le monde
     */
    public void feedEveryone() {
        SimulatorCharacter[] present = getPresentCharacters();

        for (int i = 0; i < getCurrentCapacity(); i++) {
            SimulatorCharacter c = present[i];
            if (c.getHungerMeter() > 0) {
                c.eat(new Food(FoodType.BISCUIT));
            }
        }
    }
}