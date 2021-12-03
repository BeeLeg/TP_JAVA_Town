package fr.travauxpratique.javatown;

public class Dame extends Humain implements VisagePale{

    private String couleurRobe;
    private boolean etat; // true = libre, false = captive


    public Dame(String nom, String couleurRobe) {
        super(nom, "Lait");
        this.couleurRobe = couleurRobe;
        this.etat = true;
    }

    @Override
    public String quel_est_ton_nom() {
        return ("Miss "+super.quel_est_ton_nom());
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.println("Je suis une belle dame avec une robe "+this.couleurRobe+".");
    }

    public void seFaireEnlever(){
        System.out.println("Dame:");
        System.out.println("AAAAAAAAAAAAH ! Au secours!");
        this.etat = false;
    }
    public void seFaireLiberer(){
        System.out.println("Merci beaucoup ! kiss kiss love love");
        this.etat = true;
    }

    public void changerRobe(String nouvelleCouleur){
        System.out.println("Regarder ma nouvelle robe "+ nouvelleCouleur);
        this.couleurRobe = nouvelleCouleur;
    }
}
