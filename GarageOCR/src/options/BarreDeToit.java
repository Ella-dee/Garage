package options;

public class BarreDeToit implements Option {
    private final double prix = 29.9;

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        String nom = "Barre de toit";
        return nom + " (" + prix+ "€)";
    }
}
