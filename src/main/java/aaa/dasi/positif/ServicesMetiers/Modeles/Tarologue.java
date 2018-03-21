/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */


package aaa.dasi.positif.ServicesMetiers.Modeles;

import java.io.Serializable;
import javax.persistence.Entity;


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
        return "\nTarologue{" + "cartes=" + cartes + "," + super.toString() + "}";
    }
    
}
