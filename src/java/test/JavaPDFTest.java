/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Controle.InitialInformation;
import java.io.IOException;
import java.util.ArrayList;

public class JavaPDFTest {

    public static void main(String[] args) throws IOException {

        InitialInformation information = new InitialInformation();
        information.setPath("C:/Users/USER/Downloads/Germany-Vodafone-IR21_DEUD2_Vodafone GmbH_20170203_01.pdf");
        ArrayList<String> al = new ArrayList<String>();
        al = information.Scrap();
        System.out.println("nom de l'organisation: "+al.get(0));
        System.out.println("L'initial du pays: "+al.get(1));
    

}    
}
