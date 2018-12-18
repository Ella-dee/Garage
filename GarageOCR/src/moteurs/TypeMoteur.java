package moteurs;

public enum TypeMoteur {
    DIESEL("Moteur Diesel"),
    ESSENCE("Moteur essence"),
    ELECTRIQUE("Moteur électrique"),
    HYBRIDE("Moteur hybride");
    private String typeMoteur = "";
    //Constructeur
    TypeMoteur(String typeMoteur) {
        this.typeMoteur = typeMoteur;
    }
    public String toString() {
        return typeMoteur;
    }
}
