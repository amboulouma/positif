/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
/**
 *
 * @author aelomarial
 */
public class EmployeDAO extends JpaUtil{
    
    
    /*
    retourne la description textuelle du profil du client concerné par la voyance
    */
    public static Client trouverClient(Long idClient){
        Client client = new Client();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            client = em.find(Client.class, idClient);
            System.out.println("[EmployeDAO] le client se trouve dans "
                    + "la base de données.");
        }catch(NoResultException nRE){
            System.err.println("[EmployeDAO] le client ne se trouve pas dans "
                    + "la base de données.");
        }finally{
            return client;
        }     
    }  

    public static void persistDateDebutVoyance(Voyance voyance, Date dateDebut) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setDateDebut(dateDebut);
            em.merge(voyance);
            System.out.println("[EmployeDAO] Ajout de la date de début de "
                    + "la voyance réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Ajout de la date de début "
                    + "de la voyance non réussi.");
        }
    }

    public static void persistDateFinVoyance(Voyance voyance, Date dateFin) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setDateFin(dateFin);
            em.merge(voyance);
            System.out.println("[EmployeDAO] Ajout de la date de fin de "
                    + "la voyance réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Ajout de la date de fin "
                    + "de la voyance non réussi.");
        }
    }
}