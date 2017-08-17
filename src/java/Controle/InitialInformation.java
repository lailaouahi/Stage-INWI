/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.IOException;
import java.util.ArrayList;

/**
 *

 */
public class InitialInformation {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
        
    //methode pour la lecture du page 2
    public ArrayList<String> Scrap() throws IOException{
        //appel de l'objet PDFManager
        PDFManager pdfm =  new PDFManager();
        //définir le path
        pdfm.setFilePath(path);
        //l'indice premier
        int OrgNameIndex = pdfm.ToText().indexOf("Organisation name");
        //2eme indice
        int ContryInIndex = pdfm.ToText().indexOf("Country initials");
        //3eme indice
        int PageTwoOf = pdfm.ToText().indexOf("Page 2 of");
        //liste pour les données
        ArrayList<String> al = new ArrayList<>();
        //ajouter les données à la liste
        al.add((String) pdfm.ToText().subSequence(OrgNameIndex+18, ContryInIndex));
        al.add((String) pdfm.ToText().subSequence(ContryInIndex+16, PageTwoOf));
        //retourner la liste
             return al;
       
    }
}
