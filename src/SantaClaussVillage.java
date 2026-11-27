import Building.SimulatorBuilding;

import java.util.Scanner;

public class SantaClaussVillage {
    private SantaClaus santa;
    private double maxArea;
    private int maxCapacity;
    private SimulatorBuilding[] currentBuildings;

    public SantaClaussVillage(SantaClaus santa, double maxArea, int maxCapacity, SimulatorBuilding[] currentBuildings) {
        this.santa = santa;
        this.maxArea = maxArea;
        this.maxCapacity = maxCapacity;
        this.currentBuildings = currentBuildings;
    }

    public SantaClaus getSanta() {
        return santa;
    }

    public void setSanta(SantaClaus santa) {
        this.santa = santa;
    }

    public double getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(double maxArea) {
        this.maxArea = maxArea;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public SimulatorBuilding[] getCurrentBuildings() {
        return currentBuildings;
    }

    public void setCurrentBuildings(SimulatorBuilding[] currentBuildings) {
        this.currentBuildings = currentBuildings;
    }

    /**
     * Méthode qui compte le nombre de personnages
     * @return int
     */
    public int countPeople() {
        int total = 0;
        for (SimulatorBuilding building : currentBuildings) {
            total += building.getCurrentCapacity();
        }
        return total;
    }

    /**
     * Méthode qui affiche tout les personnages présent au village
     */
    public void showEveryone() {
        System.out.println("Personnages présent au village : " + countPeople());
    }

    /**
     * Méthode qui affiche tout les personnages dans tout les bâtiments
     */
    public void showEveryoneInAllBuildings() {
        for (SimulatorBuilding building : currentBuildings) {
            System.out.println(building.showActualCharactersInBuildingAndBuildingInfo());
        }
    }

    public static void main(String[] args) {

    }
}