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

    @Override
    public boolean canAccept(SimulatorCharacter character) {
        return false;
    }

    public void addFood(Food food) {
        stock.add(food);
    }

    public void removeFood(Food food) {
        stock.remove(food);
    }

    public void showFood() {
        for (int i = 0; i < stock.size(); i++) {
            Food f = stock.get(i);
            System.out.println((i + 1) + ". " + f.getName() + " = " + f.getValue());
        }
    }
}