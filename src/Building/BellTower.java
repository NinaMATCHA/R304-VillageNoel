package Building;

import Characters.SimulatorCharacter;

public class BellTower extends SimulatorBuilding {

    private int minutes;

    public BellTower(double Area, Cleanliness cleanliness) {
        super(Area, 0, cleanliness);
        this.minutes = 8 * 60;
    }

    /**
     * Méthode qui vérifie si il peut accepter le personnage
     * @param character
     * @return false
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    /**
     * Méthode qui compte le niveau de la magie
     * @param buildings
     * @return int
     */
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

    /**
     * Méthode qui change le temps
     * @param minutesToAdd
     */
    public void updateTime(int minutesToAdd) {
        minutes = (minutes + minutesToAdd) % (24 * 60);
    }

    /**
     * Méthode qui affiche le temps
     * @return String
     */
    public String getTime() {
        return String.format("%02d:%02d", minutes / 60, minutes % 60);
    }
}
