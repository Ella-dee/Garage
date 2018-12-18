package moteurs;

public class MoteurHybride extends Moteur {
    public MoteurHybride(String cylindre, double prix){
        super(cylindre, prix);
        this.cylindre = cylindre;
        this.prix = prix;
        this.typeMoteur = TypeMoteur.HYBRIDE;
    }
    public TypeMoteur getType(){
        return TypeMoteur.HYBRIDE;
    }
    @Override
    public String toString(){
        return typeMoteur + " " + cylindre;
    }
}
