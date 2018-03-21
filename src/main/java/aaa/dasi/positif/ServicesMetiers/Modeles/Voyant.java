/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Amine Mohamed Boulouma
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * 
 */


package aaa.dasi.positif.ServicesMetiers.Modeles;

import java.io.Serializable;
import javax.persistence.Entity;


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
        return "\nVoyant{" + "support=" + support + "," + super.toString() +"}";
    }
    
}
