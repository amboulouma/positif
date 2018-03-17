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
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


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

    public static void mergeDisponibilite(Employe employe) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            employe.setDisponible(true);
            em.merge(employe);
            System.out.println("[EmployeDAO] Mise à jour de la disponibilite "
                    + "réussi.");
        }catch(Exception ex) {
            System.err.println("[EmployeDAO] Mise à jour de la disponibilite "
                    + "non réussi.");
        }  
    }
}