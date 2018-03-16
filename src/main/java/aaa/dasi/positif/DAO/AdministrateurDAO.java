/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;

import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author amine
 */

public class AdministrateurDAO extends JpaUtil{
    public static void persistMedium(Medium medium) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(medium);
        }catch(Exception ex) {
            System.err.println("Erreur lors de la persistance!");
        }
    }
    
}
