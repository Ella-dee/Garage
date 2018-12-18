package moteurs;

public class MoteurDiesel extends Moteur {
    public MoteurDiesel(String cylindre, double prix){
        super(cylindre, prix);
        this.cylindre = cylindre;
        this.prix = prix;
        this.typeMoteur = TypeMoteur.DIESEL;
    }
    public TypeMoteur getType(){
        return TypeMoteur.DIESEL;
    }
    @Override
    public String toString(){
        return typeMoteur + " " + cylindre;
    }
}
