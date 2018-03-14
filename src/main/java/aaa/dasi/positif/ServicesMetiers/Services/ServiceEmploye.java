/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.EmployeDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;

/**
 *
 * @author aelomarial
 */
public class ServiceEmploye {
    
   public static void demarrerVoyance(Voyance voyance){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        //ClientDAO.persist(client);
        JpaUtil.validerTransaction();
    }
   
   public static void cloturerVoyance(Voyance voyance){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        //ClientDAO.persist(client);
        JpaUtil.validerTransaction();
    }
   
   public static void voirHistoriqueClient(Client client){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        //ClientDAO.persist(client);
        JpaUtil.validerTransaction();
    }
   
   public static void voirProfilClient(Long idClient){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.trouverProfilClient(idClient);
        JpaUtil.validerTransaction();
    }
    
}
