package fr.travauxpratique.javatown;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Barman extends Humain{

    private String nomBar;

    public Barman(String nom) {
        super(nom, "Vin");
        this.nomBar = "Chez "+super.quel_est_ton_nom();
    }

    public Barman(String nom, String nomBar) {
        super(nom);
        this.nomBar = nomBar;
    }

    @Override
    public void sePresenter() {
        System.out.println("Bonjour, je suis "+super.quel_est_ton_nom()+" le Barman, j'aime le "
                +super.getBoissonFavorite()+". Bienvenu dans mon bar le "+this.nomBar+" Coco.");
    }
}
