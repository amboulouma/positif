/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;

import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author aelomarial
 */
public class ClientDAO extends JpaUtil{
      
    public static void persist(Client client) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(client);
        }catch (Exception ex){
            System.err.println("Erreur lors de la persistance du client.");
        }
    }
 
    /*
    retourne vrai si l'adresse mail existe dans bd
    => client connecté
    */
    public static boolean trouverMail(String paramMail){
        boolean resultat = false;
        try{
            
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select c from Client c where c.mail= :mail");
            query.setParameter("mail", paramMail);
            Client client = (Client) query.getSingleResult();
            resultat = true; 
        }catch(NoResultException nRE){
            System.err.println("Vous n'êtes pas encore inscrit dans notre plateforme");
        }finally{
            return resultat;
        }     
    }
    
    public static void persistVoyance(Voyance voyance) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(voyance);
        }catch(Exception ex) {
            System.err.println("Erreur lors de la persistance de la voyance.");
        }
    }
    
    static List<Medium> getListMediums(){
        List<Medium> mediums = new ArrayList<Medium>() ;
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select m from Medium m");
            mediums = (List<Medium>) query.getResultList();
        }catch(NoResultException nRE){
            System.err.println("Aucun médium n'est enregistré.");
        }finally{
            return mediums;
        }
    }
}
