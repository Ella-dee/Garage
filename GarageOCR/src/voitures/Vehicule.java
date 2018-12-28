package voitures;
import moteurs.*;
import options.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {
    double prix;
    String nom;
    protected List<Option> options = new ArrayList<>();
    protected Marque nomMarque;
    protected Moteur moteur;

    Vehicule() {
        this.prix = prix;
        this.nom = nom;
        this.options = options;
        this.nomMarque = nomMarque;
        this.moteur = moteur;
    }
    public String toString(){
        double total = getPrix()+getPrixOptions()+moteur.getPrix();
        return  "+ " + getMarque() + " : " + nom + " " + moteur.toString()+"("+getPrixVoitureMoteur()+"€)"+ getOptions()+" d'une valeur totale de "+arrondi(total,2)+"€.";
    }
    public void addOption(Option option){
        options.add(option);
    }
    public void setMoteur(Moteur moteur){
        this.moteur = moteur;
    }
    Marque getMarque(){
        return nomMarque;
    }
    public Moteur getMoteur(){
        return moteur;
    }
    private List<Option> getOptions(){
        return options;
    }
    double getPrix(){
        return prix;
    }
    private double getPrixOptions(){
        double prixoptions = 0;
        for (Option options : options) {
            prixoptions += options.getPrix();
        }
        return prixoptions;
    }
    private double getPrixVoitureMoteur(){
        double prixvoit = getPrix();
        double prixmot = moteur.getPrix();
        return prixvoit+prixmot;
    }
    public String getNom(){
        return nom;
    }

    private static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);

    }

}
