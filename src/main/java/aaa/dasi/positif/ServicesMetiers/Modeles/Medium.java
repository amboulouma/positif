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
public class Medium implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMedium;
    private String nom;
    private String bio;

    public Medium(String nom, String bio) {
        this.nom = nom;
        this.bio = bio;
    }

    public Medium() {
    }
    

    public Long getIdMedium() {
        return idMedium;
    }

    public void setId(Long id) {
        this.idMedium = idMedium;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedium != null ? idMedium.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idMedium fields are not set
        if (!(object instanceof Medium)) {
            return false;
        }
        Medium other = (Medium) object;
        if ((this.idMedium == null && other.idMedium != null) || (this.idMedium != null && !this.idMedium.equals(other.idMedium))) {
            return false;
        }
        return true;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public String getNom() {
        return nom;
    }

    public String getBio() {
        return bio;
    }

    public void setIdMedium(Long idMedium) {
        this.idMedium = idMedium;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Medium{" + "idMedium=" + idMedium + ", nom=" + nom + ", bio=" + bio + '}';
    }
    
}
