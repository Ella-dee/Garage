package options;

public class VitreElectrique implements Option {
    private final double prix = 212.35;

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        String nom = "Vitres électriques";
        return nom + " (" + prix+ "€)";
    }
}
