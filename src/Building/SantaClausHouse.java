package Building;

import Characters.SimulatorCharacter;

public class SantaClausHouse extends SimulatorBuilding {

    public SantaClausHouse(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui verifie si le personnage peut etre accepte
     * @param character
     * @return false
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

}
