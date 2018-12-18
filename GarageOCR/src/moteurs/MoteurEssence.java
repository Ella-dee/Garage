package moteurs;

public class MoteurEssence extends Moteur {
    public MoteurEssence(String cylindre, double prix){
        super(cylindre, prix);
        this.cylindre = cylindre;
        this.prix = prix;
        this.typeMoteur = TypeMoteur.ESSENCE;
    }
    public TypeMoteur getType(){
        return TypeMoteur.ESSENCE;
    }
    @Override
    public String toString(){
        return typeMoteur + " " + cylindre;
    }
}
