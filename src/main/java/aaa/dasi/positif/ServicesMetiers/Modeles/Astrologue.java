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
        return "\nAstrologue{" + "ecole=" + ecole + ", promotion=" + promotion + "," + super.toString()  + "}";
    }
    
}
