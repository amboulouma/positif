    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.ClientDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author aelomarial
 */
public class ServiceClient{
    
    public static void inscriptionClient(Client client){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        ClientDAO.persist(client);
        JpaUtil.validerTransaction();
    }
    
    public static boolean connexionClient(String mail){
        return ClientDAO.trouverMail(mail);
    }
    
    public static List<Voyance> genererMediums(){
        List<Voyance> ArrayList = null;
        List<Voyance> Voyance = null;
        return ArrayList;
    }
    
    public static Voyance creerVoyance(Medium medium, Client client){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Voyance voyance = new Voyance (medium, client);
        ClientDAO.persistVoyance(voyance);
        JpaUtil.validerTransaction();
        return voyance;
    }
    
    public static List<Voyance> genererHistoriqueVoyances(Client client){
        List<Voyance> ArrayList = null;
        List<Voyance> Voyance = null;
        return ArrayList;
    }
}
