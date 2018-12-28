package options;

public class SiegeChauffant implements Option{
    private final double prix = 562.9;

    @Override
    public double getPrix() {
        return prix;
    }

    public String toString(){
        String nom = "Siège chauffant";
        return nom + " (" + prix+ "€)";
    }
}
