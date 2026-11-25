package Building;

import Characters.SimulatorCharacter;

public class StockRooms extends SimulatorBuilding {


    public StockRooms(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    public void stockFood() {
        // TODO : Stock la food (pas hesiter a mettre des parametres de type food)
    }   // En quantité limité btw
}
