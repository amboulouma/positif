/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */


package aaa.dasi.positif.Presentation;

import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceAdministrateur;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceClient;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceEmploye;
import java.util.Date;


public class Main {
    public static void main(String[] args){
        
        JpaUtil.init();
        
        AdressePostale adressePostale = 
                new AdressePostale("302 avenue Albert Einstein",
                "Villeurbanne",
                "France",
                "69100");
        ProfilAstrologique profilAstrologique = 
                new ProfilAstrologique("Signe du zodiaque",
                "Signe Astrologique",
                "Couleur porte bonheur",
                "Animal Totem");
        Date dateNaissance = new Date(1997,12,01);
        Client client = new Client("Tom", 
                "Martin",
                "M",
                dateNaissance,
                adressePostale,
                "06 12 03 07 78",
                "tom@martin.gs",
                profilAstrologique);
        Medium medium = new Medium("Mark", "Biographie de Mark");
        Employe employe = new Employe("Kevin", "Musk");
        
        System.out.println();
        System.out.println("[Administrateur] Initalisation de la plateforme "
                + "avec le service - static void initpositif() :");
        System.out.println();
//        ServiceAdministrateur.initPositif();
        System.out.println();
        
        System.out.println();
        System.out.println("[Administrateur] Demonstation du service - "
                + "static void ajoutEmploye(Employe employe) :");
        System.out.println();
        ServiceAdministrateur.ajoutEmploye(employe);
        System.out.println();
        
        System.out.println();
        System.out.println("[Administrateur] Demonstation du service - "
                + "static void ajoutMedium(Medium medium) -");
        System.out.println();
        ServiceAdministrateur.ajoutMedium(medium);
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service - "
                + "static String inscriptionClient(Client client) :");
        System.out.println();
        System.out.println(ServiceClient.inscriptionClient(client));
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service - "
                + "static boolean connexionClient(String mail) :");
        System.out.println();
        System.out.println(ServiceClient.connexionClient("tom@martin.gs"));
        System.out.println(ServiceClient.connexionClient("tom@martan.gs"));
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service - "
                + "static List<Medium> genererMediums() :");
        System.out.println();
        System.out.println(ServiceClient.genererMediums());
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service - "
                + "static Voyance demanderVoyance(Medium medium,"
                + " Client client) :");
        System.out.println("[Administrateur] Demonstation du service - "
                + "static Voyance affectationVoyance(Medium medium, "
                + "Client client, Voyance voyance) :");
        System.out.println();
        Voyance voyance = ServiceClient.demanderVoyance(medium, client);
        System.out.println(voyance);
        System.out.println();
        
        System.out.println();
        System.out.println("[Client] Demonstation du service - "
                + "static List<Voyance> "
                + "genererHistoriqueVoyances(Client client) :");
        System.out.println();
        Long idClient = client.getIdClient();
        System.out.println(ServiceClient.genererHistoriqueVoyances(idClient));
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service - "
                + "static Client retrouverClient(Long idClient) :");
        System.out.println();
        System.out.println(ServiceEmploye.retrouverClient(idClient));
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service - "
                + "static void demarerVoyance(Voyance voyance) :");
        System.out.println();
        ServiceEmploye.demarerVoyance(voyance);
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service - static void "
                + "cloturerVoyanceAvecCommentaire(Voyance voyance, "
                + "String commentaire) :");
        System.out.println();
        String commentaire = "Un commentaire pour tester.";
        ServiceEmploye.cloturerVoyanceAvecCommentaire(voyance, commentaire, 
                employe);
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service - static void "
                + "cloturerVoyanceSansCommentaire(Voyance voyance) :");
        System.out.println();
        //ServiceEmploye.cloturerVoyanceSansCommentaire(voyance, employe);
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service - static String "
                + "genererTableauBord() :");
        System.out.println();
        System.out.println(ServiceEmploye.genererTableauBord());
        System.out.println();
        
        System.out.println();
        System.out.println("[Employe] Demonstation du service - static "
                + "List<String> genererPredictionsClient(Client client, "
                + "int amour, int sante, int travail) : \n");
        System.out.println();
        //ServiceEmploye.genererPredictionsClient(amour, sante, travail);
        System.out.println();
        
        JpaUtil.destroy();
    }
}
