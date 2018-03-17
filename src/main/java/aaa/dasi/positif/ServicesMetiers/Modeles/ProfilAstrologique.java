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

import javax.persistence.Embeddable;




@Embeddable
public class ProfilAstrologique {
    private String signeZodiaque;
    private String signeAstrologique;
    private String couleurPorteBonheur;
    private String animalTotem;

    public ProfilAstrologique() {
    }

    
    public ProfilAstrologique(String signeZodiaque, String signeAstrologique, String couleurPorteBonheur, String animalTotem) {
        this.signeZodiaque = signeZodiaque;
        this.signeAstrologique = signeAstrologique;
        this.couleurPorteBonheur = couleurPorteBonheur;
        this.animalTotem = animalTotem;
    }

    
    public String getSigneZodiaque() {
        return signeZodiaque;
    }

    public String getSigneAstrologique() {
        return signeAstrologique;
    }

    public String getCouleurPorteBonheur() {
        return couleurPorteBonheur;
    }

    public String getAnimalTotem() {
        return animalTotem;
    }

    public void setSigneZodiaque(String signeZodiaque) {
        this.signeZodiaque = signeZodiaque;
    }

    public void setSigneAstrologique(String signeAstrologique) {
        this.signeAstrologique = signeAstrologique;
    }

    public void setCouleurPorteBonheur(String couleurPorteBonheur) {
        this.couleurPorteBonheur = couleurPorteBonheur;
    }

    public void setAnimalTotem(String animalTotem) {
        this.animalTotem = animalTotem;
    }

    @Override
    public String toString() {
        return "ProfilAstrologique{" + "signeZodiaque=" + signeZodiaque + ", signeAstrologique=" + signeAstrologique + ", couleurPorteBonheur=" + couleurPorteBonheur + ", animalTotem=" + animalTotem + '}';
    }
    
    
}
