/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */


package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.AdministrateurDAO;
import aaa.dasi.positif.DAO.EmployeDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.mergeDateDebutVoyance(voyance, dateDebut);
        JpaUtil.validerTransaction();
    }
    
    
    public static void cloturerVoyanceAvecCommentaire(Voyance voyance, 
            String commentaire, Employe employe){
        System.out.println("[ServiceEmploye] Service cloturer la voyance "
                + "avec le client avec commentaire de l'employé lancé.");
        Date dateFin = new Date();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.mergeDateFinVoyance(voyance, dateFin);
        EmployeDAO.mergeCommentaire(voyance, commentaire);
        EmployeDAO.mergeDisponibilite(employe);
        JpaUtil.validerTransaction();
    }
    
    
    public static void cloturerVoyanceSansCommentaire(Voyance voyance, 
            Employe employe){
        System.out.println("[ServiceEmploye] Service cloturer la voyance "
                + "avec le client sans commentaire de l'employé lancé.");
        Date dateFin = new Date();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.mergeDateFinVoyance(voyance, dateFin);
        EmployeDAO.mergeDisponibilite(employe);
        JpaUtil.validerTransaction();
    }
    
    
    public static String visualiserStatistiquesMedium(){
        String statistiqueMedium = "";
        
        return statistiqueMedium;
    }
    
    
    public static List<String> genererPredictions(int amour, int sante, 
            int travail){
        List<String> predictions = new ArrayList<String>() ;
        
        return predictions;
    }

}
