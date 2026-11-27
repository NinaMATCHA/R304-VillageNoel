package Characters;

import Food.Food;
import Food.FoodType;

/**
 * Class mère SimulatorCharacter qui recupère toutes les informations des characters
 * et leur fait faire des actions différentes
 *
 * @author Ewan FRANCOIS
 * @version 1.1
 */

public class SimulatorCharacter {

    // --- VARIABLES ---

    private String Name;
    private String Sexe;
    private String Race;
    private int Age;
    private int HungerMeter;
    private boolean TirednessMeter;
    private int Magic;

    // --- CONSTRUCTEURS ---

    public SimulatorCharacter() {
        this.Name = "";
        this.Sexe = "";
        this.Race = "";
        this.Age = 0;
        this.HungerMeter = 0;
        this.TirednessMeter = false;
        this.Magic = 0;
    }

    public SimulatorCharacter(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        this.Name = Name;
        this.Sexe = Sexe;
        this.Race = Race;
        this.Age = Age;
        this.HungerMeter = HungerMeter;
        this.TirednessMeter = TirednessMeter;
        this.Magic = Magic;
    }

    // --- GETTER ET SETTER ---

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }
    
    public String getRace() {
        return Race;
    }
    
    public void setRace(String Race) {
        this.Race = Race;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getHungerMeter() {
        return HungerMeter;
    }

    public void setHungerMeter(int HungerMeter) {
        this.HungerMeter = HungerMeter;
    }

    public boolean isTirednessMeter() {
        return TirednessMeter;
    }

    public void setTirednessMeter(boolean TirednessMeter) {
        this.TirednessMeter = TirednessMeter;
    }

    public int getMagic() {
        return Magic;
    }

    public void setMagic(int Magic) {
        this.Magic = Magic;
    }

    // --- METHODES ---

    /**
     * Méthode qui fait les bruits des créatures
     * @param Race
     */
    public void doNoice(String Race) {
        System.out.println("Coucou, je suis " + getRace() + ", je m'appelle " + getName() + " et j'ai " + getAge());
    }

    /**
     * Méthode qui fait déplacer les characters
     */
    public void move() {
        // TODO : Se deplace dans les divers batiments
    }

    /**
     * Méthode qui fait faire manger les characters
     * @param food
     * @return true ou false selon les cas
     */
    public boolean eat(Food food) {
        if (sleep()) {
            System.out.println(getName() + " mange...");
            return true;
        }
        else {
            System.out.println(getName() + " est entrain de dormir, il ne peut manger.");
            return false;
        }
    }

    /**
     * Méthode qui fait faire dormir les characters
     * @return false ou true selon les cas
     */
    public boolean sleep() {
        if (isTirednessMeter()) {
            System.out.println(getName() + " s'endort...");
            return false;
        }
        else {
            return true;
        }
    }

    public boolean doActivity() {
        if (sleep() || !eat(new Food(FoodType.BISCUIT))) {
            System.out.println(getName() + " pars faire son activité...");
            return true;
        }
        else {
            System.out.println(getName() + " est en train de dormir ou de manger.");
            return false;
        }
    }

    public int changeMagic(int magic) {
        if (doActivity()) {
            System.out.println(getName() + " s'amuse et gagne de la magie de Noel");
            magic += 10;
        }
        else {
            System.out.println(getName() + " ne s'amuse pas et perd de la magie de Noel");
            magic -= 10;
        }
        return magic;
    }
}
