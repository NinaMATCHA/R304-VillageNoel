package Building;

import Characters.SimulatorCharacter;

public class Playground extends SimulatorBuilding {

    public Playground(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    /**
     * Méthode qui verifie si le personnage peut etre accepte dans le batiment
     * @param character
     * @return false
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    /**
     * Méthode qui fait faire jouer les personnages
     */
    public void play() {
        SimulatorCharacter[] charactersPresent = getPresentCharacters();
        for (int i = 0; i < getCurrentCapacity(); i++) {
            charactersPresent[i].doActivity();
            charactersPresent[i].setMagic((int) (charactersPresent[i].getMagic() * 1.5));
        }
    }

    /**
     * Méthode qui s'occupe du nettoyage du batiment
     * @param building
     */
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
