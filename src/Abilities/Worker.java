package Abilities;

public interface Worker {
    String getName();
    String getRace();
    int getMagic();
    void setMagic(int magic);

    default void work() {
        System.out.print(getName() + " Le " + getRace() + " Travaille.");
        setMagic(getMagic() + 10);
    }
}