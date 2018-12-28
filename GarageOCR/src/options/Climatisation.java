package options;

public class Climatisation implements Option {
    private final double prix = 347.3;

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        String nom = "Climatisation";
        return nom + " (" + prix+ "€)";
    }
}
