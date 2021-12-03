package fr.travauxpratique.javatown;

public class Humain {
    private String nom;
    private String boissonFavorite;

    public Humain(String nom, String boissonFavorite) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    public String quel_est_ton_nom() {
        return nom;
    }

    public String getBoissonFavorite() {
        return boissonFavorite;
    }

    public void sePresenter() {
        System.out.println("Bonjour ! Je suis "+this.quel_est_ton_nom()+". Ah ! un bon verre de "+
                this.getBoissonFavorite()+"! GLOUPS !");
    }
}
