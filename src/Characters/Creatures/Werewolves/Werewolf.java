package Characters.Creatures;

import Abilities.Entertainable;
import Abilities.Worker;

public class Werewolf extends Creature implements Worker, Entertainable {
    public enum Sex {M, F}
    public enum Age {
        YOUNG(1),
        ADULT(2),
        OLD(0.5)
    }
    public enum Rank {
        ALPHA(1),
        BETA(2),
        GAMMA(3),
        OMEGA(4)
    }
    private Sex sex;
    private Rank rank;
    private Age age;
    private int strength;
    private int dominationFactor;
    private int level;
    private int impetuosityFactor;
    private String clan;

    public Werewolf(String Name, String Sexe, String Race, int Age, int HungerMeter, boolean TirednessMeter, int Magic) {
        super(Name, Sexe, Race, Age, HungerMeter, TirednessMeter, Magic);
    }

    public Werewolf(Sex sex, Age age, int strength, int dominationFactor, Rank rank, int impetuosityFactor, String clan) {
        this.sex = sex;
        this.age = age;
        this.strength = strength;
        this.dominationFactor = dominationFactor;
        this.rank = rank;
        this.impetuosityFactor = impetuosityFactor;
        this.clan = clan;
        this.level = calculateLevel();
    }

    private int calculateLevel() {
        return this.strength + this.dominationFactor + this.rank.ordinal();
    }

    public Sexe getSex() {
        return this.sex;
    }

    public Age getAge() {
        return this.age;
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getLevel() {
        return this.level;
    }

    public int getstrength(){
        return this.strength;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
        this.calculerlevel();
    }

    public String getClan() {
        return this.clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public String toString() {
        return "Werewolf{"
                + "sexe='" + this.sexe + '\''
                + ", age=" + this.age
                + ", strength=" + this.strength
                + ", dominationFactor=" + this.dominationFactor
                + ", rank=" + this.rank
                + ", level=" + this.level
                + ", impetuosityFactor=" + this.impetuosityFactor
                + ", clan='" + this.clan + '\''
                + '}';
    }

    public void hurler(Howl howl) {
        System.out.println("AAAAAAAAAAdam");
    }

    public void entendreHurler(Howl howl) {
        System.out.println("J'entends un hurlement au loin... *img depressive de loup random*");
    }

    public void domination(Werewolf other) {
        if (other.getRank() == Rank.ALPHA && other.getSex() == Sex.F) {
            System.out.println("Impossible : c'est la femelle alpha !");}
        else if (impetuosityFactor * strength <= other.getstrength()){
                System.out.println("Impossible : l'adversaire semble trop fort...");
        }
        else if( other.getRank() == Rank.OMEGA || other.getLevel() < this.getLevel()) {
            System.out.println("Domination");
            this.dominationFactor += 1;
            other.dominationFactor += -1;
            if(this.getRank().ordinal() > other.getRank().ordinal()){
                Rank tmp = this.getRank();
                this.setRank(other.getRank());
                other.setRank(tmp);
                System.out.println("Rang echange : " + this.getRank());
                System.out.println("level : " + this.getLevel());
            }
        }
        else {
        }
    }
}
