package Characters.Humanoids;

import java.util.Random;

public class MischieviousLutin extends Lutin {

    public MischieviousLutin(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    /**
     * Méthode qui fait faire les pranks
     */
    public void doPrank() {
        Random randomNumber = new Random();
        System.out.println(" Le lutin farceur fait un prank...");

        switch (randomNumber.nextInt(6) + 1) {
            case 1:
                System.out.println(" Lait magique !");
                if (!super.isCreature()) {
                    System.out.println(" Cela fait monter la magie de Noel des humanoïdes !");
                    setMagic(getMagic() + 5);
                }
                else {
                    System.out.println(" Cela fait baisser la magie de Noel des créatures !");
                    setMagic(getMagic() - 5);
                }
                break;
            case 2:
                System.out.println(" Soupe au bas !");
                if (!super.isCreature()) {
                    System.out.println(" Cela fait monter la magie de Noel des humanoïdes !");
                    setMagic(getMagic() + 3);
                }
                else {
                    System.out.println(" Cela fait baisser la magie de Noel des créatures !");
                    setMagic(getMagic() - 3);
                }
                break;
            case 3:
                System.out.println(" Papier toilette roulé !");
                if (!super.isCreature()) {
                    System.out.println(" Cela fait monter la magie de Noel des humanoïdes !");
                    setMagic(getMagic() + 5);
                }
                else {
                    System.out.println(" Cela fait baisser la magie de Noel des créatures !");
                    setMagic(getMagic() - 5);
                }
                break;
            case 4:
                System.out.println(" Yeux remuant !");
                if (!super.isCreature()) {
                    System.out.println(" Cela fait monter la magie de Noel des humanoïdes !");
                    setMagic(getMagic() + 7);
                }
                else {
                    System.out.println(" Cela fait baisser la magie de Noel des créatures !");
                    setMagic(getMagic() - 7);
                }
                break;
            case 5:
                System.out.println(" Tyrolienne !");
                if (!super.isCreature()) {
                    System.out.println(" Cela fait monter la magie de Noel des humanoïdes !");
                    setMagic(getMagic() + 6);
                }
                else {
                    System.out.println(" Cela fait baisser la magie de Noel des créatures !");
                    setMagic(getMagic() - 6);
                }
                break;
            case 6:
                System.out.println(" Cadeau farceur !");
                if (!super.isCreature()) {
                    System.out.println(" Cela fait monter la magie de Noel des humanoïdes !");
                    setMagic(getMagic() + 10);
                }
                else {
                    System.out.println(" Cela fait baisser la magie de Noel des créatures !");
                    setMagic(getMagic() - 10);
                }
                break;
        }
    }
}
