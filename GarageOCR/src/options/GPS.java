package options;

public class GPS implements Option {
    private final double prix = 113.59;
    private final String nom = "GPS";

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        return nom + " (" + prix+ "€)";
    }
}
