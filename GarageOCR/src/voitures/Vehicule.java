package voitures;
import moteurs.*;
import options.*;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {
    double prix;
    String nom;
    private List<Option> options = new ArrayList<>();
    private Marque nomMarque;
    private Moteur moteur;

    Vehicule() {
        this.prix = prix;
        this.nom = nom;
        this.options = options;
        this.nomMarque = nomMarque;
        this.moteur = moteur;
    }
    public String toString(){
        double total = getPrix()+getPrixOptions()+moteur.getPrix();
        return  "+ " + getMarque() + " : " + nom + " " + moteur.toString()+"("+getPrixVoitureMoteur()+"€)"+ getOptions()+" d'une valeur totale de "+arrondi(total,2)+"€.\n";
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
    public double getPrix(){
        return prix;
    }
    public double getPrixOptions(){
        double prixoptions = 0;
        for (Option options : options) {
            prixoptions += options.getPrix();
        }
        return prixoptions;
    }
    public double getPrixVoitureMoteur(){
        double prixvoit = getPrix();
        double prixmot = moteur.getPrix();
        double total = prixvoit+prixmot;
        return total;
    }
    public String getNom(){
        return nom;
    }

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);

    }

}
