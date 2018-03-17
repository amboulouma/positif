/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.EmployeDAO;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;

/**
 *
 * @author aelomarial
 */
public class ServiceEmploye {
    
    public static Client retournerClient(Long idClient){
        System.out.println("[ServiceEmploye] Service retourner client de "
                + "l'employé lancé.");
        return EmployeDAO.trouverClient(idClient);
    }
    
    
}
