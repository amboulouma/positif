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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


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
    private int nombreDeVoyances;
    private boolean disponible;

    public Employe() {
        this.disponible = true;
    }

    public Employe(Long idEmploye, String nom, String prenom, 
            List<Voyance> voyance, List<Medium> medium) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.voyance = voyance;
        this.medium = medium;
        this.nombreDeVoyances = 0;
        this.disponible = true;
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.disponible = true;
    }

    public int getNombreDeVoyances() {
        return this.nombreDeVoyances;
    }

    public void setNombreDeVoyances(int nombreDeVoyances) {
        this.nombreDeVoyances = nombreDeVoyances;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
    public String toStringMax() {
        return "Employe{" + "idEmploye=" + idEmploye + ", nom=" + nom 
                + ", prenom=" + prenom + ", voyance=" + voyance + ", medium=" 
                + medium + ", nombre de voyances =" + nombreDeVoyances + "}";
    }
    
    @Override
    public String toString() {
        return "\nEmploye{" + "nom=" + nom + ", prenom=" + prenom 
                + ", nombre de voyances =" + nombreDeVoyances + "}";
    }
}
