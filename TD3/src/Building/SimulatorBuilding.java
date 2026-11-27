package Building;

import Characters.SimulatorCharacter;

public abstract class SimulatorBuilding {
    private double area;
    private int maxCapacity;
    private Cleanliness cleanliness;
    private int currentCapacity;
    private SimulatorCharacter[] presentCharacters;

    public SimulatorBuilding(double area, int maxCapacity, Cleanliness cleanliness) {
        this.area = area;
        this.maxCapacity = maxCapacity;
        this.cleanliness = cleanliness;
        this.currentCapacity = 0;
        this.presentCharacters = new SimulatorCharacter[maxCapacity];
    }

    // --- GETTERS / SETTERS ---

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Cleanliness getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(Cleanliness cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public SimulatorCharacter[] getPresentCharacters() {
        return presentCharacters;
    }

    // --- METHODES ---

    public abstract boolean canAccept(SimulatorCharacter character);

    public boolean welcomeCharacter(SimulatorCharacter character) {
        if (currentCapacity >= maxCapacity) {
            System.out.println("Le bâtiment est plein.");
            return false;
        }
        if (!canAccept(character)) {
            System.out.println(character.getName() + " n'est pas accepté pour entrer.");
            return false;
        }
        presentCharacters[currentCapacity] = character;
        currentCapacity++;
        return true;
    }

    public void removeCharacter(SimulatorCharacter character) {
        for (int i = 0; i < currentCapacity; i++) {
            if (presentCharacters[i] == character) {
                // On décale les suivants d'une case vers la gauche
                for (int j = i; j < currentCapacity - 1; j++) {
                    presentCharacters[j] = presentCharacters[j + 1];
                }
                presentCharacters[currentCapacity - 1] = null;
                currentCapacity--;
                return;
            }
        }
    }

    public String showActualCharactersInBuildingAndBuildingInfo() {
        StringBuilder result = new StringBuilder("Caractéristique du bâtiment : " + area + " m², "
                + currentCapacity + " personne(s) sur " + maxCapacity
                + ", propreté : " + cleanliness + "\n");
        for (int i = 0; i < currentCapacity; i++) {
            SimulatorCharacter c = presentCharacters[i];
            result.append(" - ").append(c.getName()).append(" (").append(c.getRace()).append("), magie : ").append(c.getMagic()).append("\n");
        }
        return result.toString();
    }

    public boolean canBeCleanUp() {
        return cleanliness == Cleanliness.MAUVAIS && currentCapacity == 0;
    }

    public void cleanUp() {
        if (!canBeCleanUp()) {
            System.out.println("Impossible, le bâtiment doit être nettoyer");
            return;
        }
        cleanliness = Cleanliness.BON;
        System.out.println("Le bâtiment a été nettoyé");
    }

    public boolean contains(SimulatorCharacter character) {
        for (int i = 0; i < getCurrentCapacity(); i++) {
            if (presentCharacters[i] == character) {
                return true;
            }
        }
        return false;
    }
}