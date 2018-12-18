package options;

public class BarreDeToit implements Option {
    private final double prix = 29.9;
    private final String nom = "Barre de toit";

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        return nom + " (" + prix+ "€)";
    }
}
