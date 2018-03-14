/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.Presentation;

import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceClient;
import java.util.Date;

/**
 *
 * @author aelomarial
 */
public class Main {
    public static void main(String[] args){
        AdressePostale adressePostale = new AdressePostale("302 avenue Albert Einstein","Villeurbanne","France","69100");
        ProfilAstrologique profilAstrologique = new ProfilAstrologique("Signe du zodiaque","Signe Astrologique","Couleur porte bonheur","Animal Totem");
        Date dateNaissance = new Date(1997,12,01);
        Client client = new Client("Tom", "Martin", "M", dateNaissance, adressePostale, "06 12 03 07 78", "tom@martin.gs", profilAstrologique);        
        ServiceClient.inscriptionClient(client);
    }
}
