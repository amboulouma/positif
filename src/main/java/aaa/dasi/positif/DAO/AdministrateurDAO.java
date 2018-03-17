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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author amine
 */

public class AdministrateurDAO extends JpaUtil{
    public static void persistMedium(Medium medium) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(medium);
            System.out.println("[AdministrateurDAO] Persistance du "
                    + "medium réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] Erreur lors de "
                    + "la persistance du medium.");
        }
    }
    
    
    public static void persistEmploye(Employe employe) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(employe);
            System.out.println("[AdministrateurDAO] Persistance de "
                    + "l'employe réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] Erreur lors de "
                    + "la persistance de l'employe.");
        }
    }
    
    
    public static Employe trouverEmployeDisponible(){
        Employe employe = new Employe();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select e from Employe e "
                        + "where e.disponible= :disponible");
            query.setParameter("disponible", true);
            employe = (Employe)query.getSingleResult();
            System.out.println("[AdministrateurDAO] Employé disponible trouvé.");
        }catch(NoResultException nRE){
            System.err.println("[AdministrateurDAO] Aucun employé disponible "
                    + "trouvé.");
        }
        return employe;
    }

    public static String modifierVoyance(Voyance voyance, Medium medium, Client client, Employe employe) {
        String notificationEmploye = "";
        try{
            notificationEmploye += "Voyance demandée pour le client " 
                    + client.getNom() + " " + client.getPrenom() + " (#" 
                    + client.getIdClient() + "), Médium : " + medium.getNom();
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setEmploye(employe);
            voyance.setMedium(medium);
            employe.setDisponible(false);
            System.out.println("[AdministrateurDAO] modification de la voyance "
                    + "réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] modification de la voyance "
                    + "non réussie.");
        }finally{
            return notificationEmploye;
        }
    }
    
}
