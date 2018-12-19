package moteurs;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
    String cylindre;
    double prix;
    TypeMoteur typeMoteur;

    Moteur(String cylindre, double prix){
        this.cylindre = cylindre;
        this.prix = prix;
        this.typeMoteur = getType();
    }
    public String toString(){
        return getType() + " " + cylindre;
    }
    public double getPrix(){
        return prix;
    }
    public String getCylindre() {
        return cylindre;
    }
    TypeMoteur getType()
    {return typeMoteur;}
}
