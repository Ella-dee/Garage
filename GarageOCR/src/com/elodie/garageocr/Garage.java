package com.elodie.garageocr;

import voitures.*;
import java.util.ArrayList;
import java.util.List;

class Garage {
    private final List<Vehicule> voitures = new ArrayList<>();

    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("*************************\n" + "* Garage OpenClassrooms *\n" + "*************************\n");
        if(voitures.isEmpty()){
            str.append("Aucune voiture");
        }
        else{
            for (Vehicule voiture : voitures) {
                String car = " " + voiture;
                str.append(car);
            }
        }
        return str.toString();
    }
    public void addVoiture(Vehicule v){
        voitures.add(v);
    }

}
