/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Modeles;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
    @ManyToMany
    private List<Employe> employe;

    public Medium(String nom, String bio) {
        this.nom = nom;
        this.bio = bio;
    }

    public Medium() {
    }

    public Medium(Long idMedium, String nom, String bio, List<Employe> employe) {
        this.idMedium = idMedium;
        this.nom = nom;
        this.bio = bio;
        this.employe = employe;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdMedium() {
        return idMedium;
    }

    public String getNom() {
        return nom;
    }

    public String getBio() {
        return bio;
    }

    public List<Employe> getEmploye() {
        return employe;
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

    public void setEmploye(List<Employe> employe) {
        this.employe = employe;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idMedium);
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.bio);
        hash = 97 * hash + Objects.hashCode(this.employe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medium other = (Medium) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.bio, other.bio)) {
            return false;
        }
        if (!Objects.equals(this.idMedium, other.idMedium)) {
            return false;
        }
        if (!Objects.equals(this.employe, other.employe)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medium{" + "idMedium=" + idMedium + ", nom=" + nom + ", bio=" + bio + ", employe=" + employe + '}';
    }
    
    
    
}
