package Building;

import Characters.SimulatorCharacter;
import Food.Food;

import java.util.ArrayList;
import java.util.List;

public class StockRooms extends SimulatorBuilding {

    private List<Food> stock = new ArrayList<>();

    public StockRooms(double area, int maxCapacity, Cleanliness cleanliness) {
        super(area, maxCapacity, cleanliness);
    }

    public List<Food> getStock() {
        return stock;
    }

    /**
     * Méthode qui verifie si un personnage peut etre accepté dans le batiment
     * @param character
     * @return false
     */
    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    /**
     * Méthode qui ajoute de la nourriture
     * @param food
     */
    public void addFood(Food food) {
        stock.add(food);
    }

    /**
     * Méthode qui enlève de la nourriture
     * @param food
     */
    public void removeFood(Food food) {
        stock.remove(food);
    }

    /**
     * Méthode qui affiche la nourriture actuelle en stock
     */
    public void showFood() {
        for (int i = 0; i < stock.size(); i++) {
            Food f = stock.get(i);
            System.out.println((i + 1) + ". " + f.getName() + " = " + f.getValue());
        }
    }
}