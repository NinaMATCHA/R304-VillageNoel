import java.util.Random;

public class Meute {
    private Lycanthrope[] CoupleAlpha;
    private Lycanthrope[] membres;

    public Meute(Lycanthrope[] CoupleAlpha, Lycanthrope[] membres) {
        this.CoupleAlpha = CoupleAlpha;
        this.membres = membres;

    }

    public void reproduire(Lycanthrope male, Lycanthrope femelle) {
        System.out.println("Le couple alpha se reproduit !");
        nbBaby = randomint(1, 5);
        System.out.println("Le couple alpha a eu " + nbBaby + " bébés !");
        for (int i = 0; i < nbBaby; i++) {
            membres[i] = new Lycanthrope("sexe", 10, 10, 10, "meute");
        }

    }
}
