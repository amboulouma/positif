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
public class Astrologue extends Medium implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ecole;
    private String promotion;

    public Astrologue() {
    }
    
    public Astrologue(String ecole, String promotion, String nom, String bio) {
        super(nom, bio);
        this.ecole = ecole;
        this.promotion = promotion;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEcole() {
        return ecole;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Astrologue{" + "ecole=" + ecole + ", promotion=" + promotion + '}';
    }
    
}
