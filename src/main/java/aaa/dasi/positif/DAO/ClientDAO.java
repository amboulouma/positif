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
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import aaa.dasi.positif.ServicesMetiers.Services.util.AstroTest;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class ClientDAO extends JpaUtil{
      
    public static String persistClient(Client client) {
        String mailDeConfirmation = "Expediteur : contact@posit.if\n"
                + "Pour : " + client.getMail() + "\n"
                + "Sujet : Bienvenue chez POSIT'IF\n\n";
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
            System.out.println("[ClientDAO] persistence du client réussie.");
            mailDeConfirmation += "Bonjour " + client.getPrenom() + ",\n"
                + "Nous vous confirmons votre inscription au "
                + "service POSIT'IF. Votre numéro de client est " 
                + client.getIdClient() + ".\n";
        }catch (Exception ex){
            System.err.println("[ClientDAO] Erreur lors de la persistance du "
                    + "client.");
            mailDeConfirmation += "Bonjour " + client.getPrenom() + ",\n"
                    +"Votre inscription au service POSIT'IF a "
                    + "malencoutreusement échoué... Merci de recommencer "
                    + "ultérieurement.\n";
        }finally{
            return mailDeConfirmation;
        }
    }
    
    public static void persistVoyance(Voyance voyance) {
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            em.persist(voyance);
            System.out.println("[ClientDAO] persistence de la voyance "
                    + "réussie.");
        }catch(Exception ex) {
            System.err.println("[ClientDAO] Erreur lors de la persistance de "
                    + "la voyance.");
        }
    }

    
    
    public static boolean trouverMail(String paramMail){
        boolean resultat = false;
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select c from Client c "
                    + "where c.mail= :mail");
            query.setParameter("mail", paramMail);
            Client client = (Client)query.getSingleResult();
            System.out.println("[ClientDAO] le client se trouve dans "
                    + "la base de données.");
            resultat = true; 
        }catch(NoResultException nRE){
            System.err.println("[ClientDAO] le client ne se trouve pas dans "
                    + "la base de données.");
        }finally{
            return resultat;
        }     
    }
    
    
    public static List<Medium> getListMediums(){
        List<Medium> mediums = new ArrayList<Medium>() ;
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select m from Medium m");
            mediums = (List<Medium>) query.getResultList();
            System.out.println("[ClientDAO] Generation de la liste "
                    + "des mediums réussie.");
        }catch(NoResultException nRE){
            System.err.println("[ClientDAO] Generation de la liste des "
                    + "mediums non réussie.");
        }finally{
            return mediums;
        }
    }  
   
    public static List<Voyance> getListVoyances(Long idClient){
        List<Voyance> voyances = new ArrayList<Voyance>() ;
        try{
            EntityManager em = JpaUtil.obtenirEntityManager();
            Query query = em.createQuery("select v from Voyance v "
                    + "where v.client.idClient = :paramID");
            query.setParameter("paramID", idClient);
            System.out.println("[ClientDAO] Generation de la liste "
                    + "des voyances réussie.");
            voyances = (List<Voyance>) query.getResultList();
        }catch(Exception e){
            System.err.println("[ClientDAO] Generation de la liste "
                    + "des voyances non réussie.");
        }finally{
            return voyances;
        }
    }
}
