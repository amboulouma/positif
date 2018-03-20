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
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.Astrologue;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.Tarologue;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyant;


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
        Employe employe = 
                AdministrateurDAO.trouverEmployeAvecAffectationsMinimales();
        String notificationEmploye = AdministrateurDAO.modifierVoyance(voyance, 
                medium, client, employe);
        JpaUtil.validerTransaction();
        System.out.println("[Notification Employe] " + notificationEmploye);
        return voyance;
    }
    
    
    public static void initPositif(){
        Medium mediumGwenael = new Voyant("Boule de Cristal", "Gwenaël", "Spécialiste des grandes conversations au-delà de TOUTES les frontières.");
        Medium mediumDalmarre = new Voyant("Marc de Café", "J. Dalmarre", "Votre avenir est devant vous: regardons-le ensemble!");
        Medium mediumIrma = new Tarologue("Tarot de Marseille", "Mme Irma", "Comprenez votre entourage grâce à mes cartes! Résultats rapides.");
        Medium mediumLisa = new Tarologue("Tarot de Brocéliande", "Mme Lisa Maria NGUYINIA", "Mes cartes spécialisées pour la région Bretagne répondront à toutes questions personnelles.");
        Medium mediumSara = new Astrologue("Ecole Normale Supérieure d'Astrologie (ENS-Astro)", "2006", "Mme Sara", "Basée à Champigny-sur-Marne, Mme Sara vous révèlera votre avenir pour éclairer votre passé.");
        Medium mediumMounia = new Astrologue("Institut des Nouveaux Savoirs Astrologiques", "2010" , "Mme Mounia Mounia", "Avenir, avenir, que nous réserves-tu? N'attendez plus, demandez à me consulter!");
    
        Employe employeGireux = new Employe("GIREUX", "Zouhair");
        Employe employeTchiumakova = new Employe("TCHIUMAKOVA", "Nicolas");
        Employe employeKamaro = new Employe("KEMARO", "Cédric");
        Employe employePamitescu = new Employe("PAMITESCY", "Olena");
        
        ajoutMedium(mediumGwenael);
        ajoutMedium(mediumDalmarre);
        ajoutMedium(mediumIrma);
        ajoutMedium(mediumLisa);
        ajoutMedium(mediumSara);
        ajoutMedium(mediumMounia);
        
        ajoutEmploye(employeGireux);
        ajoutEmploye(employeTchiumakova);
        ajoutEmploye(employeKamaro);
        ajoutEmploye(employePamitescu);
    }
}
