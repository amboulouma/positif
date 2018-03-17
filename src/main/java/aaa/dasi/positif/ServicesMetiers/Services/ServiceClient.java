/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */


package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.ClientDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.ArrayList;
import java.util.List;


public class ServiceClient{
    
    public static String inscriptionClient(Client client){
        System.out.println("[ServiceClient] Service inscription du client "
                + "lancé.");
        String mailDeConfirmation;
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        mailDeConfirmation = ClientDAO.persistClient(client);
        JpaUtil.validerTransaction();
        return mailDeConfirmation;
    }
    
    
    public static boolean connexionClient(String mail){
        System.out.println("[ServiceClient] Service connexion du client "
                + "lancé.");
        return ClientDAO.trouverMail(mail);
    }
    
    
        public static Voyance demanderVoyance(Medium medium, Client client){
        System.out.println("[ServiceClient] Service de la création de la "
                + "voyance pour le client lancé.");
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Voyance voyance = new Voyance(medium, client);
        ClientDAO.persistVoyance(voyance);
        JpaUtil.validerTransaction();
        ServiceAdministrateur.affectationVoyance(medium, client, voyance);
        return voyance;
    }

    
    
    public static List<Medium> genererMediums(){
        System.out.println("[ServiceClient] Service de générations des mediums "
                + "pour client lancé.");
        List<Medium> mediums = new ArrayList<Medium>() ;
        mediums = ClientDAO.getListMediums();
        return mediums;
    }
    
    
    public static List<Voyance> genererHistoriqueVoyances(Long idClient){
        System.out.println("[ServiceClient] Service de génération de "
                + "l'historique des voyances du client lancé.");
        List<Voyance> voyances = new ArrayList<Voyance>() ;
        voyances = ClientDAO.getListVoyances(idClient);
        return voyances;
    }
}
