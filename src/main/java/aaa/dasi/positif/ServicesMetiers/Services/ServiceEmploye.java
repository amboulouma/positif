/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.EmployeDAO;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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
    
    
    public static void demarerVoyance(Voyance voyance){
        System.out.println("[ServiceEmploye] Service demarer la voyance "
                + "avec le client de l'employé lancé.");
        Date dateDebut = new Date();
        EmployeDAO.persistDateDebutConversation(dateDebut);
    }
    
    
    public static void cloturerVoyanceAvecCommentaire(Voyance voyance, String commentaire){
        System.out.println("[ServiceEmploye] Service cloturer la voyance "
                + "avec le client avec commentaire de l'employé lancé.");
        
    }
    
    
    public static void cloturerVoyanceSansCommentaire(Voyance voyance){
        System.out.println("[ServiceEmploye] Service cloturer la voyance "
                + "avec le client sans commentaire de l'employé lancé.");
        
    }
    
    
    public static String visualiserStatistiquesMedium(){
        String statistiqueMedium = "";
        
        return statistiqueMedium;
    }
    
    
    public static List<String> genererPredictions(int amour, int sante, int travail){
        List<String> predictions = new ArrayList<String>() ;
        
        return predictions;
    }
}
