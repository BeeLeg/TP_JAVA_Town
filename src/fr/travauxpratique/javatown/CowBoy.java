package fr.travauxpratique.javatown;

public class CowBoy extends Humain{

    public int popularite;
    public String rang;

    public CowBoy(String nom) {
        super(nom, "Whisky");
        this.popularite = 0;
        this.rang = "vaillant";
    }

    public int getPopularite() {
        return popularite;
    }

    public void tirer(Brigand brigand){
        System.out.println(super.quel_est_ton_nom()+" le "+this.rang+" tire sur "+brigand.quel_est_ton_nom()+".");
        System.out.println("PAN ! Prend ça mécréant !");
        brigand.estEmprisonner(super.quel_est_ton_nom());
    }

    public void liberer(Dame dame){
        System.out.println("Coucou ! Je viens vous libérer !");
        dame.seFaireLiberer();
        this.popularite++;
    }
}
