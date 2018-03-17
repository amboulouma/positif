/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.Presentation;

import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceAdministrateur;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceClient;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceEmploye;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aelomarial
 */
public class Main {
    public static void main(String[] args){
        
        JpaUtil.init();
        
        AdressePostale adressePostale = 
                new AdressePostale("302 avenue Albert Einstein",
                "Villeurbanne",
                "France",
                "69100");
        ProfilAstrologique profilAstrologique = 
                new ProfilAstrologique("Signe du zodiaque",
                "Signe Astrologique",
                "Couleur porte bonheur",
                "Animal Totem");
        Date dateNaissance = new Date(1997,12,01);
        Client client = new Client("Tom", 
                "Martin",
                "M",
                dateNaissance,
                adressePostale,
                "06 12 03 07 78",
                "tom@martin.gs",
                profilAstrologique);
        Medium mediumMark = new Medium("Mark", "Biographie de Mark");
        
        System.out.println();
        System.out.println("[Administrateur] Demonstation du service : "
                + "initPlatefome :");
        System.out.println();
        //ServiceAdministrateur.initPlatefome();
        System.out.println();
        
        System.out.println();
        System.out.println("[Administrateur] Demonstation du service : "
                + "ajoutMedium :");
        System.out.println();
        ServiceAdministrateur.ajoutMedium(mediumMark);
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service : "
                + "inscriptionClient :");
        System.out.println();
        System.out.println(ServiceClient.inscriptionClient(client));
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service : "
                + "connexionClient :");
        System.out.println();
        System.out.println(ServiceClient.connexionClient("tom@martin.gs"));
        System.out.println(ServiceClient.connexionClient("tom@martan.gs"));
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service : "
                + "genererMediums :");
        System.out.println();
        System.out.println(ServiceClient.genererMediums());
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service : "
                + "creerVoyance :");
        System.out.println();
        System.out.println(ServiceClient.demanderVoyance(mediumMark, client));
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service : "
                + "genererHistoriqueVoyances :");
        System.out.println();
        Long idClient = client.getIdClient();
        System.out.println(ServiceClient.genererHistoriqueVoyances(idClient));
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service : "
                + "retournerClient :");
        System.out.println();
        System.out.println(ServiceEmploye.retournerClient(idClient));
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service : "
                + "demarerVoyance :");
        System.out.println();
        //ServiceEmploye.demarerConversation(idClient, idEmploye, idMedium);
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service : cloturerVoyanceAvecCommentaire :");
        System.out.println();
        //ServiceEmploye.cloturerConversationAvecCommentaire(commentaire);
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service : cloturerVoyanceSansCommentaire :");
        System.out.println();
        //ServiceEmploye.cloturerConversationSansCommentaire();
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service : visualiserStatistiquesMedium :");
        System.out.println();
        //ServiceEmploye.visualiserStatistiquesMedium();
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service : genererPredictions :");
        System.out.println();
        //ServiceEmploye.genererPredictions(amour, sante, travail);
        System.out.println();
        
        JpaUtil.destroy();
    }
}
