/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.EmployeDAO;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import java.util.ArrayList;
import java.util.List;

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
    
    
    public static void demarerConversation(Long idClient, Long idEmploye, Long idMedium){
        
    }
    
    
    public static void cloturerConversationAvecCommentaire(String commentaire){
        
    }
    
    
    public static void cloturerConversationSansCommentaire(){
        
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
