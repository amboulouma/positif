/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.AdministrateurDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
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
    
    
}
