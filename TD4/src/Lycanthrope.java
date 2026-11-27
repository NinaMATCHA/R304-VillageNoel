/**
 * Lycanthrope dans une colonie.
 */
public class Lycanthrope {
    public enum Sexe {M, F}
    public enum Age {
        JEUNE(1),
        ADULTE(2),
        VIEUX(0.5)
    }
    public enum Rank {
        ALPHA(1),
        BETA(2),
        GAMMA(3),
        OMEGA(4)
    }
    private Sexe sexe;
    private Rank rank;
    private Age age;
    private int force;
    private int facteurDomination;
    private int niveau;
    private int facteurImpetuosite;
    private String meute;

    public Lycanthrope(Sexe sexe, Age age, int force, int facteurDomination, Rank rank, int facteurImpetuosite, String meute) {
        this.sexe = sexe;
        this.age = age;
        this.force = force;
        this.facteurDomination = facteurDomination;
        this.rank = rank;
        this.facteurImpetuosite = facteurImpetuosite;
        this.meute = meute;
        this.niveau = calculerNiveau();
    }

    private int calculerNiveau() {
        return this.force + this.facteurDomination + this.rank.ordinal();
    }

    public Sexe getSexe() {
        return this.sexe;
    }

    public Age getAge() {
        return this.age;
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public int getForce(){
        return this.force;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
        this.calculerNiveau();
    }

    public String getMeute() {
        return this.meute;
    }

    public void setMeute(String meute) {
        this.meute = meute;
    }

    @Override
    public String toString() {
        return "Lycanthrope{"
                + "sexe='" + this.sexe + '\''
                + ", age=" + this.age
                + ", force=" + this.force
                + ", facteurDomination=" + this.facteurDomination
                + ", rank=" + this.rank
                + ", niveau=" + this.niveau
                + ", facteurImpetuosite=" + this.facteurImpetuosite
                + ", meute='" + this.meute + '\''
                + '}';
    }

    public void hurler(Hurlement hurlement) {
        System.out.println("AAAAAAAAAAdam");
    }

    public void entendreHurler(Hurlement hurlement) {
        System.out.println("J'entends un hurlement au loin... *img depressive de loup random*");
    }

    public void domination(Lycanthrope other) {
        if (other.getRank() == Rank.ALPHA && other.getSexe() == Sexe.F) {
            System.out.println("Impossible : c'est la femelle alpha !");}
        else if (facteurImpetuosite * force <= other.getForce()){
                System.out.println("Impossible : l'adversaire semble trop fort...");
        }
        else if( other.getRank() == Rank.OMEGA || other.getNiveau() < this.getNiveau()) {
            System.out.println("Domination");
            this.facteurDomination += 1;
            other.facteurDomination += -1;
            if(this.getRank().ordinal() > other.getRank().ordinal()){
                Rank tmp = this.getRank();
                this.setRank(other.getRank());
                other.setRank(tmp);
                System.out.println("Rang echange : ");
                System.out.println("Niveau : ");
            }
        }
        else {
        }
    }
}