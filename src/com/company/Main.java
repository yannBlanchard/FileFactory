package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileFactory fileFactory = FileFactory.getInstance();
        Fichier repertoire = fileFactory.createFile(TypeFichier.Repertoire, "dossier1", TypeLecture.Read);
        Fichier repertoire2 = fileFactory.createFile(TypeFichier.Repertoire, "dossier2", TypeLecture.ReadWrite);
        repertoire.add(repertoire2);
        Fichier file = fileFactory.createFile(TypeFichier.Fichier,"Toto",TypeLecture.ReadWrite);


        repertoire.add(repertoire2);
        repertoire2.add(file);


    }
}
