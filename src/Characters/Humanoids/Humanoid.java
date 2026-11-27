package Characters.Humanoids;

import Characters.SimulatorCharacter;

public abstract class Humanoid extends SimulatorCharacter {

    public Humanoid() {
        super();
    }

    public Humanoid(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    /**
     * Méthode qui vérifie si c'est une créature
     * @return false
     */
    public boolean isCreature() {
        return false;
    }
}
