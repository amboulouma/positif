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
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
    private int nombreAffectations;
    
    public Medium(String nom, String bio) {
        this.nom = nom;
        this.bio = bio;
    }

    public Medium(Long idMedium, String nom, String bio, List<Employe> employe) {
        this.idMedium = idMedium;
        this.nom = nom;
        this.bio = bio;
        this.employe = employe;
        this.nombreAffectations = 0;
    }

    public Medium() {
    }

    public Medium(Long idMedium, String nom) {
        this.idMedium = idMedium;
        this.nom = nom;
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
    
    public int getNombreAffectations() {
        return this.nombreAffectations;
    }

    public void setNombreAffectations(int nombreAffectations) {
        this.nombreAffectations = nombreAffectations;
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
    public String toString() {
        return "Medium{" + "idMedium=" + idMedium + ", nom=" + nom + ", bio=" + bio + ", employe=" + employe + '}';
    }

    
    
   
}
