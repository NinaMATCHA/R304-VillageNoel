import java.util.Random;

public class Clan {
    private AlphaCouple couple;
    private Werewolf[] members;

    public Clan(AlphaCouple couple, Werewolf[] members) {
        this.couple = couple;
        this.members = members;

    }

    public void reproduire(Werewolf male, Werewolf female) {
        System.out.println("Le couple alpha se reproduit !");
        Random random = new Random();
        int nbBaby = random.nextInt(7-1) + 1;
        System.out.println("Le couple alpha a eu " + nbBaby + " bébés !");
        for (int i = 0; i < nbBaby; i++) {
            membres[i] = new Werewolf("sex", 10, 10, 10, "clan");
        }

    }
}
