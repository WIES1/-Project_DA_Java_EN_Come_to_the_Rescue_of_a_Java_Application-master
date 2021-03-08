package com.hemebiotech.Project02Eclipse.service;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class CountData {

    public Map<String, Integer> count(List<String> symptomsList) {

        Map<String, Integer> symptomsMap; //k-v
        symptomsMap = new TreeMap<String, Integer>(); // on appelle le constructor

        for (String s : symptomsList) {
            if (symptomsMap.containsKey(s)) {// condition du 1er if
                int i = symptomsMap.get(s) + 1; // on obtient le chiffre qu on doit incrementer
                symptomsMap.put(s, i);
                // est ce que la liste des cles de la Map contient S? on va incrementer la cle de cette et sinon on va creer dans le else une nouvelle entree avec s affectee avec une valeur 1
            } else {
                symptomsMap.put(s, 1); //pas d'occurence

            }

        }

        // DANS CETTE METHODE ELLE PREND LES PARAMETRES DES SYMPTOMES ET ELLE RENVOIE CHAQUE SYMPTOME ET A CHAQUE ELEMENT ET VOIR SI
        // INCREMENTER LA LISTE ET SINON EN INSERANT LE NOUVEAU SYMPTOME ET INSERER LA K-V AU NIVEAU DE LA MAP,
        // CREER UNE MAP
        // TODO Auto-generated method stub
        return symptomsMap;
    }

}