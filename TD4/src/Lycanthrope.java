public class Lycanthrope {
    private String sexe;
    private enum age {
        JEUNE,
        ADULTE,
        VIEUX
    }
    private int force;
    private int facteurDomination;
    private enum rang {
        alpha,
        beta,
        gamma,
        omega
    }
    private int niveau;
    private int facteurImpetuosite;
    private String meute;

    public Lycanthrope(String sexe, int force, int facteurDomination, int facteurImpetuosite, String meute) {
        this.sexe = sexe;
        this.force = force;
        this.facteurDomination = facteurDomination;
        this.facteurImpetuosite = facteurImpetuosite;
        this.meute = meute;

        this.niveau = (force + facteurDomination + facteurImpetuosite) / 3;
    }

    public String getMeute() {
        return meute;
    }

    public void setMeute(String meute) {
        this.meute = meute;
    }

    @Override 
    public String toString() {
        return "Lycanthrope{" +
                "sexe='" + sexe + '\'' +
                ", force=" + force +
                ", facteurDomination=" + facteurDomination +
                ", niveau=" + niveau +
                ", facteurImpetuosite=" + facteurImpetuosite +
                ", meute='" + meute + '\'' +
                '}';
    }

    public void hurler() {
        System.out.println("AOUUUUUUUUU");
    }

    public void entendreHurler() {
        System.out.println("J'entends un hurlement au loin...*img depressive de loup random*");
    }
}