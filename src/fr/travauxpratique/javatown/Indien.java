package fr.travauxpratique.javatown;

public class Indien extends Humain{

    private int nbPlumes;
    private String totem;

    public Indien(String nom) {
        super(nom, "Jus de racines");
        this.nbPlumes = 0;
        this.totem = "Coyote";
    }

    public void scalp(Humain humain){

        this.nbPlumes++;
    }
}
