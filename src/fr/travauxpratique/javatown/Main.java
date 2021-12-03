package fr.travauxpratique.javatown;

public class Main {
    public static void main(String[] args) {

        Humain brigand1 = new Brigand("Michel");
        Humain brigand2 = new Brigand("Cédric");
        Humain dame1 = new Dame("Monique", "Bleue");
        Humain dame2 = new Dame("Ginette", "Rouge");
        Humain cowboy1 = new CowBoy("Didier");
        Humain barman1 = new Barman("Arthus", "Vin");
        Humain barman2 = new Barman("Blyat", "СУКА БЛЯТЬ");
        Humain sherif = new Sherif("Danton");

        CowBoy Clint = new Sherif("Clint");

        //Clint.sePresenter();
        //((Sherif)Clint).coffrer((Brigand)brigand1);

        System.out.println("#############################################################");
        System.out.println("Brigand:");
        ((Brigand)brigand1).sePresenter();
        ((Brigand)brigand1).kidnapper((Dame)dame1);
        System.out.println("Cowboy:");
        cowboy1.sePresenter();
        ((CowBoy)cowboy1).tirer((Brigand)brigand1);
        System.out.println("Cowboy");
        ((CowBoy)cowboy1).liberer((Dame)dame1);

        System.out.println("Popularite de "+((CowBoy) cowboy1).quel_est_ton_nom()+": "+((CowBoy)cowboy1).getPopularite());

        System.out.println("#############################################################");
        System.out.println("Dame:");
        ((Dame)dame2).sePresenter();

        System.out.println("Barman");
        ((Barman)barman1).sePresenter();


        System.out.println("#############################################################");
        System.out.println("Sherif:");
        ((Sherif)sherif).rechercher((Brigand)brigand2, 300);
        System.out.println("Brigand:");
        brigand2.sePresenter();
        System.out.println("Sherif");
        ((Sherif)sherif).coffrer(((Brigand)brigand2));


    }
}
