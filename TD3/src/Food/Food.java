package Food;

public class Food {
    private String Name;
    private int Value;

    public Food() {
        Name = "";
        Value = 0;
    }

    public Food(String Name, int Value) {
        this.Name = Name;
        this.Value = Value;
    }

    public Food(FoodType type) {
        this.Name = type.name();
        this.Value = type.getValue();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
