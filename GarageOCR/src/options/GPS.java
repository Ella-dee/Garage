package options;

public class GPS implements Option {
    private final double prix = 113.59;

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        String nom = "GPS";
        return nom + " (" + prix+ "€)";
    }
}
