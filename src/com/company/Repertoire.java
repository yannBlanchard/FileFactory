package com.company;

/**
 * Created by yablanch on 09/11/2015.
 */
public class Repertoire implements Fichier {
    String nom;
    TypeLecture typeOuverture;
    int id;

    public Repertoire(String nom, TypeLecture type) {
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
