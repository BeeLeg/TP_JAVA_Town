package fr.travauxpratique.javatown;

public class CowBoy extends Humain implements VisagePale{

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

    public void tirer(Hors_la_Loi hll){
        System.out.println(super.quel_est_ton_nom()+" le "+this.rang+" tire sur "+hll.quel_est_ton_nom()+".");
        System.out.println("PAN ! Prend ça mécréant !");
        if(hll instanceof Brigand)
            ((Brigand)hll).estEmprisonner(super.quel_est_ton_nom());
    }

    public void liberer(Dame dame){
        System.out.println("Coucou ! Je viens vous libérer !");
        dame.seFaireLiberer();
        this.popularite++;
    }
}
