package voitures;

public class D4 extends Vehicule {
    public D4() {
        super();
        nom = "D4";
        prix = 12985.00;
    }

    public Marque getMarque() {
        return Marque.TROEN;
    }
    @Override
    public double getPrix() {
        return prix;
    }
    public String getNom(){
        return nom;
    }
}
