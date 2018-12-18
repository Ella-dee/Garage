package moteurs;

public class MoteurElectrique extends Moteur {
    public MoteurElectrique(String cylindre, double prix){
    super(cylindre, prix);
    this.cylindre = cylindre;
    this.prix = prix;
    this.typeMoteur = TypeMoteur.ELECTRIQUE;
}
    public TypeMoteur getType(){
        return TypeMoteur.ELECTRIQUE;
    }
    @Override
    public String toString(){
        return typeMoteur + " " + cylindre;
    }
}
