package com.company;

/**
 * Created by yablanch on 09/11/2015.
 */
public class FichierOrdinaire implements Fichier {
    String nom;
    String typeOuverture;
    int id;

    public FichierOrdinaire(String nom, String typeOuverture) {
        this.nom = nom;
        this.typeOuverture = typeOuverture;
    }

    @Override
    public void add() {
        
    }

    @Override
    public void remove() {

    }

    @Override
    public void modifier() {

    }
}
