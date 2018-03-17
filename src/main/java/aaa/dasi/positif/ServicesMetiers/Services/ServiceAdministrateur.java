/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.AdministrateurDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;

/**
 *
 * @author amine
 * @author amine
 * @author amine
 * @author amine
 */
public class ServiceAdministrateur {

    public static void ajoutMedium(Medium medium){
        System.out.println("[ServiceAdministrateur] Service inscription du "
                + "medium lancé.");
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        AdministrateurDAO.persistMedium(medium);
        JpaUtil.validerTransaction();
    }
    
    public static void ajoutEmploye(Employe employe){
        System.out.println("[ServiceAdministrateur] Service inscription du "
                + "medium lancé.");
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        AdministrateurDAO.persistEmploye(employe);
        JpaUtil.validerTransaction();
    }
    
    public static Voyance affectationVoyance(Medium medium, 
            Client client, Voyance voyance){
        System.out.println("[ServiceAdministrateur] Service d'affectation de "
                + "voyance lancé.");
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Employe employe = AdministrateurDAO.trouverEmployeDisponible();
        String notificationEmploye = AdministrateurDAO.modifierVoyance(voyance, 
                medium, client, employe);
        JpaUtil.validerTransaction();
        System.out.println("[Notification Employe] " + notificationEmploye);
        return voyance;
    }
}
