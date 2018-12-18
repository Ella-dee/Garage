package options;

public class Climatisation implements Option {
    private final double prix = 347.3;
    private final String nom = "Climatisation";

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        return nom + " (" + prix+ "€)";
    }
}
