package com.company;

/**
 * Created by yablanch on 09/11/2015.
 */
public class FichierOrdinaire implements Fichier {
    String nom;
    TypeLecture typeOuverture;
    int id;

    public FichierOrdinaire(String nom, TypeLecture type) {
        this.nom = nom;
        this.typeOuverture = type;
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
