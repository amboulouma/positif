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
    
    public static Client trouverClient(Long idClient){
        Client c;
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        c=EmployeDAO.trouverClient(idClient);
        JpaUtil.validerTransaction();
        return c;
    }
    
    
}
