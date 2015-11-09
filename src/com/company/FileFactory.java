package com.company;



/**
 * Created by yablanch on 09/11/2015.
 */
public final class FileFactory {
    private final static FileFactory ourInstance = new FileFactory();

    public static FileFactory getInstance() {
        return ourInstance;
    }

    private FileFactory() {
    }

    public Fichier createFile(TypeFichier fileType,String name,TypeLecture type){
        if(fileType == null){
            return null;
        }
        switch (fileType){
            case Repertoire:
                return new Repertoire(name,type);
            case Fichier:
                return new FichierOrdinaire(name,type);
            default:
                System.out.println("Erreur type inconnu");
                break;
        }

        return  null;
    }
}
