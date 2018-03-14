/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Modeles;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author aelomarial
 */
@Entity
public class Tarologue extends Medium implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cartes;

    public Tarologue() {
    }
    
    public Tarologue(String cartes, String nom, String bio) {
        super(nom, bio);
        this.cartes = cartes;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCartes() {
        return cartes;
    }

    public void setCartes(String cartes) {
        this.cartes = cartes;
    }

    @Override
    public String toString() {
        return "Tarologue{" + "cartes=" + cartes + '}';
    }
    
}
