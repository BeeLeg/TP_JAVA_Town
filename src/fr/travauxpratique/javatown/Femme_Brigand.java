package fr.travauxpratique.javatown;

public class Femme_Brigand extends Dame implements Hors_la_Loi{

    public Femme_Brigand(String nom, String couleurRobe) {
        super(nom, couleurRobe);
    }

    @Override
    public void coffrer(CowBoy cowboy) {

    }

    @Override
    public int getOffreRecompense() {
        return 0;
    }
}
