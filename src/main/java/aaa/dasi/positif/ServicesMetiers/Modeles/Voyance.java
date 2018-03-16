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
import java.util.Date;
import java.util.Objects;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author amine
 */
@Entity
public class Voyance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVoyance;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    private String commentaire;
    @ManyToOne
    Employe employe;
    @ManyToOne
    Medium medium;
    @ManyToOne
    Client client;

    public Voyance() {
    }

    public Voyance(Date dateDebut, Date dateFin, String commentaire, Employe employe, Medium medium, Client client) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.commentaire = commentaire;
        this.employe = employe;
        this.medium = medium;
        this.client = client;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Voyance(Medium medium, Client client) {
        this.medium = medium;
        this.client = client;
    }

    public Long getIdVoyance() {
        return idVoyance;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Employe getEmploye() {
        return employe;
    }

    public Medium getMedium() {
        return medium;
    }

    public Client getClient() {
        return client;
    }

    public void setIdVoyance(Long idVoyance) {
        this.idVoyance = idVoyance;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.idVoyance);
        hash = 41 * hash + Objects.hashCode(this.dateDebut);
        hash = 41 * hash + Objects.hashCode(this.dateFin);
        hash = 41 * hash + Objects.hashCode(this.commentaire);
        hash = 41 * hash + Objects.hashCode(this.employe);
        hash = 41 * hash + Objects.hashCode(this.medium);
        hash = 41 * hash + Objects.hashCode(this.client);
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
        final Voyance other = (Voyance) obj;
        if (!Objects.equals(this.commentaire, other.commentaire)) {
            return false;
        }
        if (!Objects.equals(this.idVoyance, other.idVoyance)) {
            return false;
        }
        if (!Objects.equals(this.dateDebut, other.dateDebut)) {
            return false;
        }
        if (!Objects.equals(this.dateFin, other.dateFin)) {
            return false;
        }
        if (!Objects.equals(this.employe, other.employe)) {
            return false;
        }
        if (!Objects.equals(this.medium, other.medium)) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voyance{" + "idVoyance=" + idVoyance + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", commentaire=" + commentaire + ", employe=" + employe + ", medium=" + medium + ", client=" + client + '}';
    }
    
}
