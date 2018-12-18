package voitures;

public class Lagouna extends Vehicule {
    public Lagouna() {
        super();
        nom = "Lagouna";
        prix = 11218.00;
    }

    public Marque getMarque() {
        return Marque.RENO;
    }
    @Override
    public double getPrix() {
        return prix;
    }
    public String getNom(){
        return nom;
    }
}
