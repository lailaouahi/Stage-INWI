/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *

 */
public class ListOfApn {
    private String id;
    private String description;
    private String exemple;
    private String APNopID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
     public String getAPNopID() {
        return APNopID;
    }

    public void setDescreption(String APNopID) {
        this.APNopID = APNopID;
    }


    public String getDescrption() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExemple() {
        return exemple;
    }

    public void setExemple(String exemple) {
        this.exemple = exemple;
    }
    
    
}
