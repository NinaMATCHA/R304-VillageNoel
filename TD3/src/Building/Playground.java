package Building;

import Characters.SimulatorCharacter;

public class Playground extends SimulatorBuilding {

    public Playground(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    public void play() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].doActivity();
            charactersPresent[i].setMagic((int) (charactersPresent[i].getMagic() * 1.5));
        }
    }

    public void takeCare(SimulatorBuilding building) {
        // TODO : doit avoir un entretient fréquent
        if (building.getCleanliness() == Cleanliness.MAUVAIS) {
            building.setCleanliness(Cleanliness.CORRECT);
        }
        if (building.getCleanliness() == Cleanliness.CORRECT) {
            building.setCleanliness(Cleanliness.BON);
        }
    }
}
