package Characters.Creatures;

import Abilities.Entertainable;
import Abilities.Worker;

public class BonsHommeDeNeigeVivant extends Creature implements Worker, Entertainable {

    public BonsHommeDeNeigeVivant(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    // TODO : Implémenter une méthode qui tue les bonshommes de neige vivant si ils restent trop longtemps dans un bâtiment à l'intérieur
}
