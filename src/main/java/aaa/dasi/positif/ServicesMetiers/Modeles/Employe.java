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
import java.util.List;
import java.util.Objects;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


/**
 *
 * @author amine
 */
@Entity
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmploye;
    private String nom;
    private String prenom;
    @OneToMany
    private List<Voyance> voyance;
    @ManyToMany
    private List<Medium> medium;

    public Employe() {
    }

    public Employe(Long idEmploye, String nom, String prenom, List<Voyance> voyance, List<Medium> medium) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.voyance = voyance;
        this.medium = medium;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdEmploye() {
        return idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Voyance> getVoyance() {
        return voyance;
    }

    public List<Medium> getMedium() {
        return medium;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setVoyance(List<Voyance> voyance) {
        this.voyance = voyance;
    }

    public void setMedium(List<Medium> medium) {
        this.medium = medium;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idEmploye);
        hash = 29 * hash + Objects.hashCode(this.nom);
        hash = 29 * hash + Objects.hashCode(this.prenom);
        hash = 29 * hash + Objects.hashCode(this.voyance);
        hash = 29 * hash + Objects.hashCode(this.medium);
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
        final Employe other = (Employe) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.idEmploye, other.idEmploye)) {
            return false;
        }
        if (!Objects.equals(this.voyance, other.voyance)) {
            return false;
        }
        if (!Objects.equals(this.medium, other.medium)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employe{" + "idEmploye=" + idEmploye + ", nom=" + nom + ", prenom=" + prenom + ", voyance=" + voyance + ", medium=" + medium + '}';
    }

}
