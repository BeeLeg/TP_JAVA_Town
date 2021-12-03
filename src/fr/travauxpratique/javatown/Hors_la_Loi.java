package fr.travauxpratique.javatown;

public interface Hors_la_Loi {


    void coffrer(CowBoy cowboy);

    default void kidnapper(Dame dame){
        System.out.println("Ah ah ! "+dame.quel_est_ton_nom()+", tu es mienne désormais !");
        dame.seFaireEnlever();
    }

    int getOffreRecompense();

    String quel_est_ton_nom();
}
