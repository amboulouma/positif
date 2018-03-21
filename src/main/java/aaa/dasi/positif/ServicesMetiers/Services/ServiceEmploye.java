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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ServiceEmploye {
    
    public static Client retrouverClient(Long idClient){
        System.out.println();
        System.out.println("[ServiceEmploye] Service retrouver client de "
                + "l'employé lancé.");
        System.out.println();
        return EmployeDAO.trouverClient(idClient);
    }
    
    
    public static void demarerVoyance(Voyance voyance, Employe employe){
        System.out.println();
        System.out.println("[ServiceEmploye] Service demarer la voyance "
                + "avec le client de l'employé lancé.");
        System.out.println();
        Date dateDebut = new Date();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.mergeDateDebutVoyance(voyance, dateDebut, employe);
        JpaUtil.validerTransaction();
    }
    
    
    public static void cloturerVoyanceAvecCommentaire(Voyance voyance, 
            String commentaire, Employe employe){
        System.out.println();
        System.out.println("[ServiceEmploye] Service cloturer la voyance "
                + "avec le client avec commentaire de l'employé lancé.");
        System.out.println();
        Date dateFin = new Date();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.mergeDateFinVoyance(voyance, dateFin, employe);
        EmployeDAO.mergeCommentaire(voyance, commentaire);
        JpaUtil.validerTransaction();
    }
    
    
    public static void cloturerVoyanceSansCommentaire(Voyance voyance, 
            Employe employe){
        System.out.println();
        System.out.println("[ServiceEmploye] Service cloturer la voyance "
                + "avec le client sans commentaire de l'employé lancé.");
        System.out.println();
        Date dateFin = new Date();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        EmployeDAO.mergeDateFinVoyance(voyance, dateFin, employe);
        JpaUtil.validerTransaction();
    }
    
    public static String genererTableauBord() {
        System.out.println();
        System.out.println("[ServiceEmploye] Service générer le tableau de "
                + "bord.");
        System.out.println();
        String tableauBord = "";
        tableauBord += "\nInformations du tableau de bord\n\n";
        tableauBord += "1.Total de voyances demandées par medium\n";
        tableauBord += genererStatistiquesMedium() + "\n";
        tableauBord += "2.Total de voyances réalisées par employé\n";
        tableauBord += genererStatistiquesEmploye() + "\n\n";
        tableauBord += "3.Répartition des voyances entres employés\n";
        tableauBord += genererRepartitionEmploye();
        return tableauBord;
    }
    
    public static String genererStatistiquesMedium(){
        System.out.println();
        System.out.println("[ServiceEmploye] Service générer les statistiques "
                + "des medium lancé.");
        System.out.println();
        String statistiqueMedium = EmployeDAO.getStatisquesMedium();
        return statistiqueMedium;
    }
    
    public static String genererStatistiquesEmploye(){
        System.out.println();
        System.out.println("[ServiceEmploye] Service générer les statistiques "
                + "des employes lancé.");
        System.out.println();
        String statistiqueMedium = EmployeDAO.getStatisquesEmploye();
        return statistiqueMedium;
    }
    
    public static String genererRepartitionEmploye(){
        System.out.println();
        System.out.println("[ServiceEmploye] Service générer la repartition "
                + "des employes lancé.");
        System.out.println();
        String statistiqueMedium = EmployeDAO.getRepartitionEmploye();
        return statistiqueMedium;
    }
    
    
    public static List<String> genererPredictionsClient(Client client, int amour, int sante, 
            int travail) throws IOException{
        System.out.println();
        System.out.println("[ServiceEmploye] Service générer des prédiction "
                + "pour le client de l'employe est lancé.");
        System.out.println();
        List<String> predictions = new ArrayList<String>() ;
        predictions = EmployeDAO.getPredictionsClient(client, amour, sante, travail);
        return predictions;
    }

}
