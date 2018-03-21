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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;



/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */


public class EmployeDAO extends JpaUtil{
    
    
    /*
    retourne la description textuelle du profil du client concerné par la voyance
    */
    public static Client trouverClient(Long idClient){
        Client client = new Client();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            client = em.find(Client.class, idClient);
            System.out.println("[EmployeDAO] le client se trouve dans "
                    + "la base de données.");
        }catch(NoResultException nRE){
            System.err.println("[EmployeDAO] le client ne se trouve pas dans "
                    + "la base de données.");
        }finally{
            return client;
        }     
    }  

    public static void mergeDateDebutVoyance(Voyance voyance, Date dateDebut) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setDateDebut(dateDebut);
            em.merge(voyance);
            System.out.println("[EmployeDAO] Ajout de la date de début de "
                    + "la voyance réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Ajout de la date de début "
                    + "de la voyance non réussi.");
        }
    }

    public static void mergeDateFinVoyance(Voyance voyance, Date dateFin) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setDateFin(dateFin);
            em.merge(voyance);
            System.out.println("[EmployeDAO] Ajout de la date de fin de "
                    + "la voyance réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Ajout de la date de fin "
                    + "de la voyance non réussi.");
        }
    }

    public static void mergeCommentaire(Voyance voyance, String commentaire) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            voyance.setCommentaire(commentaire);
            em.merge(voyance);
            System.out.println("[EmployeDAO] Ajout du commentaire de "
                    + "la voyance réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Ajout du commentaire "
                    + "de la voyance non réussi.");
        }
    }
    

    public static void mergeNombreAffectations(Employe employe, 
            Medium medium, int nombreAffectationsEmploye, 
            int nombreAffectationsMedium){
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            employe.setNombreAffectations(nombreAffectationsEmploye);
            medium.setNombreAffectations(nombreAffectationsMedium);
            em.merge(employe);
            em.merge(medium);
            System.out.println("[EmployeDAO] Mise à jour du nombre "
                    + "d'affectations réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Mise à jour du nombre "
                    + "d'affectations non réussi.");
        }  
    }
    
    
    public static String getStatisquesMedium(){
        String result = "";
        List<Medium> statsMediums = new ArrayList<Medium>();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select m from Medium m");
            statsMediums = (List<Medium>) query.getResultList();
            for(int i=0; i<statsMediums.size(); i++){ 
                result += statsMediums.get(i).getNom() + ": "
                        + statsMediums.get(i).getNombreAffectations() + "\n";
            }
            System.out.println("[EmployeDAO] Generation des statisques "
                    + "des mediums réussie.");
        }catch(Exception ex){
            System.err.println("[EmployeDAO] Generation des statisques des "
                    + "mediums non réussie.");
        }finally{
            return result;
        }
    }
    
    
    public static String getStatisquesEmploye(){
        String result = "";
        List<Employe> employes = new ArrayList<Employe>();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select e from Employe e");
            employes = (List<Employe>) query.getResultList();
            result = employes.toString();
            System.out.println("[EmployeDAO] Generation des statisques "
                    + "des employes réussie.");
        }catch(Exception ex){
            System.err.println("[EmployeDAO] Generation des statisques des "
                    + "employes non réussie.");
        }finally{
            return result;
        }
    }
    
    
    public static String getRepartitionEmploye(){
        String result = "";
        List<Employe> repartitionEmployes = new ArrayList<Employe>();
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select e from Employe e");
            repartitionEmployes = (List<Employe>) query.getResultList();
            for(int i=0; i<repartitionEmployes.size(); i++){ 
                result += repartitionEmployes.get(i).getNom() + " " 
                        + repartitionEmployes.get(i).getPrenom() + ": "
                        + repartitionEmployes.get(i).getNombreAffectations() * 
                        100 / repartitionEmployes.size() + "% \n" ;
            }
            System.out.println("[EmployeDAO] Generation de la repartition "
                    + "des employes réussie.");
        }catch(Exception ex){
            System.err.println("[EmployeDAO] Generation de la repartition des "
                    + "employes non réussie.");
        }finally{
            return result;
        }
    }
    
    
    public static List<String> getPredictionsClient(Client client, int amour, 
            int sante, int travail) throws IOException{
        String api = "ASTRO-02-M0lGLURBU0ktQVNUUk8tQjAy";
        List<String> predictions = new ArrayList<String>();
        AstroTest astro = new AstroTest(api);
        ProfilAstrologique profilAstrologique = client.getProfilAstrologique();
        String couleur = profilAstrologique.getCouleurPorteBonheur();
        String animal = profilAstrologique.getAnimalTotem();
        predictions = astro.getPredictions(couleur, animal, amour, sante, 
                travail);
        return predictions;
    }
}