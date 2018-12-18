package voitures;

public class A300B extends Vehicule {
    public A300B() {
    super();
    nom = "A300B";
    prix = 14532.00;
}

    public Marque getMarque() {
        return Marque.PIGEOT;
    }
    @Override
    public double getPrix() {
        return prix;
    }
    public String getNom(){
        return nom;
    }
}
