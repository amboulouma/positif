
/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */

package aaa.dasi.positif.DAO;

import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import aaa.dasi.positif.ServicesMetiers.Services.util.AstroTest;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class AdministrateurDAO extends JpaUtil{
    public static void persistMedium(Medium medium) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(medium);
            System.out.println("[AdministrateurDAO] Persistance du "
                    + "medium réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] Erreur lors de "
                    + "la persistance du medium.");
        }
    }
    
    
    public static void persistEmploye(Employe employe) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(employe);
            System.out.println("[AdministrateurDAO] Persistance de "
                    + "l'employe réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] Erreur lors de "
                    + "la persistance de l'employe.");
        }
    }
    
    
    public static void persistClient(Client client) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            String api = "ASTRO-02-M0lGLURBU0ktQVNUUk8tQjAy";
            List<String> profilAstrologique = new ArrayList<String>();
            AstroTest astro = new AstroTest(api);
            profilAstrologique = astro.getProfil(client.getPrenom(), 
                    client.getDateNaissance());
            ProfilAstrologique profilCalcule = new ProfilAstrologique();
            profilCalcule.setSigneZodiaque(profilAstrologique.get(0));
            profilCalcule.setSigneAstrologique(profilAstrologique.get(1));
            profilCalcule.setCouleurPorteBonheur(profilAstrologique.get(2));
            profilCalcule.setAnimalTotem(profilAstrologique.get(3));
            client.setProfilAstrologique(profilCalcule);
            em.persist(client);
            System.out.println("[AdministrateurDAO] Persistance du "
                    + "client réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] Erreur lors de "
                    + "la persistance du client.");
        }
    }
    
    
    public static Employe trouverEmployeAvecAffectationsMinimales(){
        Employe employe = new Employe();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select distinct e from Employe e "
                    + "where e.nombreAffectations = (select "
                    + "MIN(e.nombreAffectations) from Employe e)");
            employe = (Employe)query.getSingleResult();
            System.out.println("[AdministrateurDAO] Employé avec affectations "
                    + "minimales trouvé.");
        }catch(NoResultException nRE){
            System.err.println("[AdministrateurDAO] Employé avec affectations "
                    + "minimales non trouvé.");
        }
        return employe;
    }

    public static String modifierVoyance(Voyance voyance, Medium medium, 
            Client client, Employe employe) {
        String notificationEmploye = "";
        int nombreAffectationsEmploye = employe.getNombreAffectations();
        int nombreAffectationsMedium = medium.getNombreAffectations();
        try{
            notificationEmploye += "Voyance demandée pour le client " 
                    + client.getNom() + " " + client.getPrenom() + " (#" 
                    + client.getIdClient() + "), Médium : " + medium.getNom();
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setEmploye(employe);
            voyance.setMedium(medium);
            nombreAffectationsEmploye++;
            nombreAffectationsMedium++;
            em.merge(voyance);
            EmployeDAO.mergeNombreAffectations(employe, medium, 
                    nombreAffectationsEmploye, nombreAffectationsMedium);
            System.out.println("[AdministrateurDAO] modification de la voyance "
                    + "réussie.");
        }catch(Exception ex) {
            System.err.println("[AdministrateurDAO] modification de la voyance "
                    + "non réussie.");
        }finally{
            return notificationEmploye;
        }
    }
    
}
