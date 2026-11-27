package Abilities;

public interface Entertainable {
    String getName();
    String getRace();
    int getMagic();
    void setMagic(int magic);

    default void play() {
        System.out.print(getName() + " Le " + getRace() + " se divertit.");
        setMagic(getMagic() + 15);
    }
}
