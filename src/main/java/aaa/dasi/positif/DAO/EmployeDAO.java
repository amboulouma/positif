/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.DAO;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author aelomarial
 */
public class EmployeDAO extends JpaUtil{
    
    public static void persist(Employe employe) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(employe);
    }
    
}