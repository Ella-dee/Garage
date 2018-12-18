package options;

public class SiegeChauffant implements Option{
    private final double prix = 562.9;
    private final String nom = "Siège chauffant";

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        return nom + " (" + prix+ "€)";
    }
}
