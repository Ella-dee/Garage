package options;

public class VitreElectrique implements Option {
    private final double prix = 212.35;
    private final String nom = "Vitres électriques";

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        return nom + " (" + prix+ "€)";
    }
}
