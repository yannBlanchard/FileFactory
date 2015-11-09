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

    public Fichier createFile(String fileType,String name,String type){
        if(fileType == null){
            return null;
        }
        if(fileType.equalsIgnoreCase("FICHIERORDINAIRE")){
            return new FichierOrdinaire(name,type);
        } else if(fileType.equalsIgnoreCase("REPERTOIRE")){
            return new Repertoire(name,type);
        }
        return  null;
    }
}
