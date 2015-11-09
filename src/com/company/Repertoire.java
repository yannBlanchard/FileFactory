package com.company;

import clover.org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yablanch on 09/11/2015.
 */
public class Repertoire implements Fichier {
    String nom;
    TypeLecture typeOuverture;
    Map<String,Fichier> fichiers = new HashedMap();

    public Repertoire(String nom, TypeLecture type) {
        this.nom = nom;
        this.typeOuverture = type;
    }

    @Override
    public void add(Fichier file) {
        fichiers.put(nom, file);
    }

    @Override
    public void remove(Fichier file) {
        fichiers.remove(file);
    }

    @Override
    public void modifier(Fichier file) {

    }

}
