package Building;

import Characters.SimulatorCharacter;

public class BellTower extends SimulatorBuilding {

    private int minutes;

    public BellTower(double Area, Cleanliness cleanliness) {
        super(Area, 0, cleanliness);
        this.minutes = 8 * 60;
    }

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    public int countMagicLevel(SimulatorBuilding[] buildings) {
        int total = 0;
        for (SimulatorBuilding building : buildings) {
            SimulatorCharacter[] characterPresent = building.getPresentCharacters();
            for (int i = 0; i < building.getCurrentCapacity(); i++) {
                total += characterPresent[i].getMagic();
            }
        }
        return total;
    }

    public void updateTime(int minutesToAdd) {
        minutes = (minutes + minutesToAdd) % (24 * 60);
    }

    public String getTime() {
        return String.format("%02d:%02d", minutes / 60, minutes % 60);
    }
}
