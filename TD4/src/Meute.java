import java.util.Random;

public class Meute {
    private CoupleAlpha couple;
    private Lycanthrope[] membres;

    public Meute(CoupleAlpha couple, Lycanthrope[] membres) {
        this.couple = couple;
        this.membres = membres;

    }

    public void reproduire(Lycanthrope male, Lycanthrope femelle) {
        System.out.println("Le couple alpha se reproduit !");
        Random random = new Random();
        int nbBaby = random.nextInt(7-1) + 1;
        System.out.println("Le couple alpha a eu " + nbBaby + " bébés !");
        for (int i = 0; i < nbBaby; i++) {
            membres[i] = new Lycanthrope("sexe", 10, 10, 10, "meute");
        }

    }
}
