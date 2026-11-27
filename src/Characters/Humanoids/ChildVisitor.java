package Characters.Humanoids;

import Abilities.Entertainable;

public class ChildVisitor extends Humanoid implements Entertainable {

    public ChildVisitor(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    /**
     * Méthode qui fait jouer les personnages
     */
    @Override
    public void play() {
        System.out.print(getName() + " Le " + getRace() + " se divertit.");
        setMagic(getMagic() + 30);
    }
}
