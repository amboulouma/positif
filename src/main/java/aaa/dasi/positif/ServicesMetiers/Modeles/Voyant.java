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
public class Voyant extends Medium implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String support;

    public Voyant() {
        
    }

    public Voyant(String support, String nom, String bio) {
        super(nom, bio);
        this.support = support;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "Voyant{" + "support=" + support + '}';
    }
    
}
