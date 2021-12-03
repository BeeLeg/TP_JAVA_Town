package fr.travauxpratique.javatown;

public class Brigand extends Humain{

    public String look;
    private int nbDamesEnelevees;
    private int offreRecompense;
    private boolean isJail;

    public Brigand(String nom) {
        super(nom, "tord-boyaux");
        this.look = "méchant";
        this.nbDamesEnelevees = 0;
        this.offreRecompense = 100;
        this.isJail = false;
    }

    @Override
    public String quel_est_ton_nom() {
        return (super.quel_est_ton_nom()+ " le "+this.look);
    }

    @Override
    public void sePresenter() {
        System.out.println("Bonjour ! Je suis "+super.quel_est_ton_nom()+" le "
                +this.look+" et j'aime le "+super.getBoissonFavorite());
        if(this.nbDamesEnelevees == 0)
            System.out.println("J'ai l'air méchant et j'ai déjà kidnappé.... ah bah non en fait, " +
                    "j'en n'ai pas encore kidnappé...");
        if(this.nbDamesEnelevees == 1)
            System.out.println("J'ai l'air méchant et j'ai déjà kidnappé "+this.nbDamesEnelevees+" dame !");
        if(this.nbDamesEnelevees > 1)
            System.out.println("J'ai l'air méchant et j'ai déjà kidnappé "+this.nbDamesEnelevees+" dames !");
        System.out.println("Ma tête est mise à prix pour "+this.offreRecompense+" !");
    }

    public void kidnapper(Dame dame){
        System.out.println("Ah ah ! "+dame.quel_est_ton_nom()+", tu es mienne désormais !");
        dame.seFaireEnlever();
        this.nbDamesEnelevees++;
    }

    public void estEmprisonner(String nomCowboy){
        System.out.println("Brigand:");
        System.out.println("Damned ! je suis fait ! "+ nomCowboy+", tu m'as eu !");
        this.isJail = true;
    }

    public void setOffreRecompense(int offreRecompense) {
        this.offreRecompense = offreRecompense;
    }

    public int getOffreRecompense() {
        return offreRecompense;
    }

    public int getNbDamesEnelevees() {
        return nbDamesEnelevees;
    }
}
