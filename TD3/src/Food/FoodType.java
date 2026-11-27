package Food;

public enum FoodType {
    BISCUIT("biscuit", 10),
    CHOCOLAT_CHAUD("chocola chaud", 15),
    GUIMAUVE("guimauve", 5),
    GRUAU_AVOINE("gruau d'avoine", 20),
    FRIANDISE("friandises", 5);

    private final String Name;
    private final int Value;

    FoodType(String name, int value) {
        Name = name;
        Value = value;
    }

    public String getName() {
        return Name;
    }

    public int getValue() {
        return Value;
    }
}
