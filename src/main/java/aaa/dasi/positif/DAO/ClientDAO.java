/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;

import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author aelomarial
 */
public class ClientDAO extends JpaUtil{
      
    public static void persist(Client client) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(client);
    }
 
    /*
    retourne vrai si l'adresse mail existe dans bd
    => client connecté
    */
    public static boolean trouverMail(String paramMail){
        boolean res = true;
        EntityManager em = JpaUtil.obtenirEntityManager();
        
        Query query = em.createQuery("select * from Client where mail= :mail");
        query.setParameter("mail", paramMail);
        Client resultat = (Client) query.getSingleResult();
        
        JpaUtil.validerTransaction();
        
        if (resultat == null) res=false;
        
        return res;
    }
}
