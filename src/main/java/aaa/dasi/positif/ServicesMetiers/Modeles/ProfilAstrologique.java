/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Modeles;

import javax.persistence.Embeddable;

/**
 *
 * @author aelomarial
 */

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
