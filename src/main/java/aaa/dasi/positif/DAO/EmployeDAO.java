/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author aelomarial
 */
public class EmployeDAO extends JpaUtil{
    
    
    /*
    retourne la description textuelle du profil du client concerné par la voyance
    */
    public static String trouverProfilClient(Long idClient){
        EntityManager em = JpaUtil.obtenirEntityManager();
        
        Query query = em.createQuery("select * from Client where idClient= :id");
        query.setParameter("id", idClient);
        Client resultat = (Client) query.getSingleResult();
        
        JpaUtil.validerTransaction();
        
        return resultat.toString();
    }
    
}