package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileFactory fileFactory = FileFactory.getInstance();
        Fichier repertoire = fileFactory.createFile("REPERTOIRE","dossier1","Lecture");

    }
}
