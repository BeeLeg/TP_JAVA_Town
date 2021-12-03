package fr.travauxpratique.javatown;

public class Sherif extends CowBoy implements Hors_la_Loi{

    private int nbBrigandsCoffres;

    public Sherif(String nom) {
        super(nom);
        this.nbBrigandsCoffres = 0;
    }

    @Override
    public void coffrer(CowBoy cowboy) {

    }

    @Override
    public int getOffreRecompense() {
        return 0;
    }

    @Override
    public String quel_est_ton_nom() {
        return "Sherif "+super.quel_est_ton_nom();
    }

    public void coffrer(Brigand brigand){
        System.out.println("Au nom de la Loi, je vous arrête !");
        brigand.estEmprisonner(super.quel_est_ton_nom());
        this.nbBrigandsCoffres ++;
    }

    public void rechercher(Brigand brigand, int nouvellePrime){
        System.out.println("OYEZ OYEZ BRAVE GENS !! "+nouvellePrime+" $ à qui arrêtera "
            +brigand.quel_est_ton_nom()+" mort ou vif !!");
        brigand.setOffreRecompense(nouvellePrime);
    }
}
