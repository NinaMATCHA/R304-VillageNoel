package Characters.Creatures;

import Abilities.Entertainable;
import Abilities.Worker;

public class BonsHommeDeNeigeVivant extends Creature implements Worker, Entertainable {

    public BonsHommeDeNeigeVivant(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }


    @Override
    public void play() {
        System.out.print(getName() + " Le " + getRace() + " se divertit.");
        setMagic(getMagic() + 10);
    }

    @Override
    public void work() {
        System.out.print(getName() + " Le " + getRace() + " Travaille.");
        setMagic(getMagic() + 10);
    }

    // TODO : Implémenter une méthode qui tue les bonshommes de neige vivant si ils restent trop longtemps dans un bâtiment à l'intérieur
}
