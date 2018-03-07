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
import javax.persistence.Embedded;
import javax.persistence.Temporal;


/**
 *
 * @author aelomarial
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClient;
    private String nom;
    private String prenom;
    private String civilite;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateNaissance;
    @Embedded
    private AdressePostale adressePostale;
    private String telephone;
    private String mail;
    @Embedded
    private ProfilAstrologique profilAstrologique;
    private Long idVoyance;

    public Client(Long idClient, String nom, String prenom, String civilite, Date dateNaissance, AdressePostale adressePostale, String telephone, String mail, ProfilAstrologique profilAstrologique, Long idVoyance) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.dateNaissance = dateNaissance;
        this.adressePostale = adressePostale;
        this.telephone = telephone;
        this.mail = mail;
        this.profilAstrologique = profilAstrologique;
        this.idVoyance = idVoyance;
    }
        
    public Long getIdClient() {
        return idClient;
    }

    public void setId(Long idClient) {
        this.idClient = idClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClient != null ? idClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idClient fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idClient == null && other.idClient != null) || (this.idClient != null && !this.idClient.equals(other.idClient))) {
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

    public String getPrenom() {
        return prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMail() {
        return mail;
    }

    public ProfilAstrologique getProfilAstrologique() {
        return profilAstrologique;
    }

    public Long getIdVoyance() {
        return idVoyance;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setProfilAstrologique(ProfilAstrologique profilAstrologique) {
        this.profilAstrologique = profilAstrologique;
    }

    public void setIdVoyance(Long idVoyance) {
        this.idVoyance = idVoyance;
    }

    @Override
    public String toString() {
        return "Client{" + "idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", civilite=" + civilite + ", dateNaissance=" + dateNaissance + ", adressePostale=" + adressePostale + ", telephone=" + telephone + ", mail=" + mail + ", profilAstrologique=" + profilAstrologique + ", idVoyance=" + idVoyance + '}';
    }
    
}
