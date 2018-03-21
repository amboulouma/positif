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
public class AdressePostale {
    private String adresse;
    private String ville;
    private String pays;
    private String codePostale;

    public AdressePostale() {
    }
    
    

    public AdressePostale(String adresse, String ville, String pays, String codePostale) {
        this.adresse = adresse;
        this.ville = ville;
        this.pays = pays;
        this.codePostale = codePostale;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    @Override
    public String toString() {
        return "AdressePostale{" + adresse + ", " + ville + ", " + codePostale + ", " + pays + "}";
    }
    
    
}
