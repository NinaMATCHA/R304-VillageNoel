package Characters.Humanoids;

import Characters.SimulatorCharacter;

public abstract class Humanoid extends SimulatorCharacter {

    public Humanoid() {
        super();
    }

    public Humanoid(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    public boolean isCreature() {
        return false;
    }

    public boolean isDevoured() {
        // TODO : Faire les différents cas au moment des noces funebres
        return false;
    }
}
