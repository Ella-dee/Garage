package voitures;

public enum Marque {
    RENO("Voiture Reno"),
    PIGEOT("Voiture Pigeot"),
    TROEN("Voiture Troen");
    private String marque = "";

    //Constructeur
    Marque(String marque) {
        this.marque = marque;
    }
    public String toString() {
        return marque;
    }

}
