package com.company;

/**
 * Created by yablanch on 09/11/2015.
 */
public class FichierOrdinaire implements Fichier {
    String nom;
    TypeLecture typeOuverture;

    public FichierOrdinaire(String nom, TypeLecture type) {
        this.nom = nom;
        this.typeOuverture = type;
    }

    @Override
    public void add(Fichier file) {
        
    }

    @Override
    public void remove(Fichier file) {

    }

    @Override
    public void modifier(Fichier file) {

    }

}
