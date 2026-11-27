package Building;

import Characters.Humanoids.Humanoid;
import Characters.SimulatorCharacter;

public class Shops extends SimulatorBuilding {

    public Shops(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return character instanceof Humanoid;
    }

    public void buy() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].doActivity();
            charactersPresent[i].setMagic(charactersPresent[i].getMagic() + 10);
        }
    }
}
