package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileFactory fileFactory = FileFactory.getInstance();
        Fichier repertoire = fileFactory.createFile(TypeFichier.Repertoire, "dossier1", TypeLecture.Read);

    }
}
