/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;

import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import javax.persistence.EntityManager;

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
    
}
