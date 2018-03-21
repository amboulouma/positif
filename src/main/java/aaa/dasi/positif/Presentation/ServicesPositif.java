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
import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Astrologue;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import static aaa.dasi.positif.ServicesMetiers.Modeles.Employe_.voyance;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.Tarologue;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyant;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceAdministrateur;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceClient;
import aaa.dasi.positif.ServicesMetiers.Services.ServiceEmploye;
import aaa.dasi.positif.ServicesMetiers.Services.util.Saisie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ServicesPositif {
    
    static public int interfaceUtilisateur() {
        System.out.println();
        
        System.out.println("Bienvenue sur POSIT'IF, le service de voyance "
                + "du futur.");

        System.out.println();        
        
        System.out.println("Les service Administrateur ");

        System.out.println();

        System.out.println("0- Lancer le service d'initialisation de "
                + "l'application.");

        System.out.println("1- Lancer le service d'ajout d'employe");

        System.out.println("2- Lancer le service d'ajout de medium");

        System.out.println("3- Lancer le service d'ajout de client");

        System.out.println();

        System.out.println("Les service Client ");

        System.out.println();

        System.out.println("4- Lancer le service d'inscription");

        System.out.println("5- Lancer le service de connexion");

        System.out.println();

        System.out.println("Les service Employé");

        System.out.println();

        System.out.println("6- Lancer le service de retrouver un client");

        System.out.println("7- Lancer le service de démarrer une voyance");
        
        return Saisie.lireInteger("Entrez votre choix : ");
    }
        

    static public void initPositif() {
        System.out.println();
        ServiceAdministrateur.initPositif();
        System.out.println();
    }

    static public void ajoutEmploye() {
        System.out.println();
        String nom = Saisie.lireChaine("Entrer le nom de l'employe : ");
        String prenom = Saisie.lireChaine("Entrer le prénom de l'employé : ");
        Employe employe = new Employe(nom, prenom);
        ServiceAdministrateur.ajoutEmploye(employe);
        System.out.println();
    }
    

    static public void ajoutMedium() {
        System.out.println();
        System.out.println("1- Astrologue");
        System.out.println("2- Tarologue");
        System.out.println("3- Voyant");
        int choixMedium = Saisie.lireInteger("Entrez type de voyant que vous voulez "
                + "entrer : ");  
        Medium medium = new Medium();
        if (choixMedium == 1){
            String nom = Saisie.lireChaine("Entrer le nom du medium : ");
            String bio = Saisie.lireChaine("Entrer la biographie du medium : ");
            String ecole = Saisie.lireChaine("Entrer l'école du medium : ");
            String promo = Saisie.lireChaine("Entrer la promo du medium : ");
            medium = new Astrologue(nom, bio, ecole, promo);
        } else if (choixMedium == 2){
            String nom = Saisie.lireChaine("Entrer le nom du medium : ");
            String bio = Saisie.lireChaine("Entrer la biographie du medium : ");
            String support = Saisie.lireChaine("Entrer le support du medium : ");
            medium = new Tarologue(nom, bio, support);
        } else if (choixMedium == 3){
            String nom = Saisie.lireChaine("Entrer le nom du medium : ");
            String bio = Saisie.lireChaine("Entrer la biographie du medium : ");
            String support = Saisie.lireChaine("Entrer le support du medium : ");
            medium = new Voyant(nom, bio, support);
        } else {
            System.out.println("Saisie invalide, veuillez reessayer à nouveau");
            ajoutMedium();
        }
        ServiceAdministrateur.ajoutMedium(medium);
        System.out.println();
    }
    

    static public void ajoutClient() throws ParseException {
        System.out.println();
        String nom = Saisie.lireChaine("Entrer le nom du client : ");
        String prenom = Saisie.lireChaine("Entrer le prenom du client : ");
        String mail = Saisie.lireChaine("Entrer l'email du client : ");
        String stringDateNaissance = Saisie.lireChaine("Entrer votre date de "
                + "naissance au format jj/mm/aaaa : ");
        Date dateNaissance = new 
            SimpleDateFormat("dd/MM/yyyy").parse(stringDateNaissance);
        Client client = new Client(nom, prenom, mail, dateNaissance);
        ServiceAdministrateur.ajoutClient(client);
        System.out.println();
    }

    
    static public void inscriptionClient() throws ParseException {
        System.out.println();
        String nom = Saisie.lireChaine("Entrer votre nom : ");
        String prenom = Saisie.lireChaine("Entrer votre prenom : ");
        String civilite = Saisie.lireChaine("Entrer votre civilite : ");
        String stringDateNaissance = Saisie.lireChaine("Entrer votre date de "
                + "naissance au format jj/mm/aaaa : ");
        Date dateNaissance = new 
            SimpleDateFormat("dd/MM/yyyy").parse(stringDateNaissance);
        String mail = Saisie.lireChaine("Entrer votre adresse email : ");
        String telephone = Saisie.lireChaine("Entrer votre numero de "
                + "telephone : ");
        String adresse = Saisie.lireChaine("Entrer votre adresse : ");
        String ville = Saisie.lireChaine("Entrer votre ville : ");
        String codePostale = Saisie.lireChaine("Entrer votre code postale :");
        String pays = Saisie.lireChaine("Entrer votre pays : ");
        AdressePostale adressePostale = new AdressePostale(adresse, ville, 
                codePostale, pays);

        Client client = new Client(nom, prenom, civilite, dateNaissance, 
                adressePostale, telephone, mail);
        System.out.println(ServiceClient.inscriptionClient(client));
        System.out.println();
    }

    
    static public void connexionClient() throws ParseException {
        System.out.println();
        String mail = Saisie.lireChaine("Entrer votre mail pour vous "
                + "connecter : ");
        Client client;
        client = ServiceClient.connexionClient(mail);
        if (client != null){
            System.out.println("Vous etes connecte !");
            System.out.println("1- Demander voyance");
            System.out.println("2- Voir mon historique");
            System.out.println();
            int choix = Saisie.lireInteger("Entrez votre choix : ");
            switch (choix) {
                case 1:
                    System.out.println();
                    List<Medium> listMedium = ServiceClient.
                            genererMediums();
                    for (int i = 0; i < listMedium.size(); i++) {
                        System.out.println(i + 1 + "- " + listMedium.get(i));
                    }   int choixMedium = Saisie.lireInteger("Choisisser "
                            + "votre medium : ");
                    Voyance voyance = ServiceClient.demanderVoyance(
                            listMedium.get(choixMedium - 1), client);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println(ServiceClient.genererHistoriqueVoyances(mail));
                    System.out.println();
                    break;
                default:
                    System.out.println("Saisie incorrecte.");
                    connexionClient();
                    break;
            }
        } else {
            System.out.println("Saisie incorrecte.");
            int choix = Saisie.lireInteger("Si vous n'etes pas encore inscrit "
                    + "entrez 1 sinon 2 pour reessayer de vous connecter : ");
            switch (choix) {
                case 1:
                    inscriptionClient();
                    break;
                case 2:
                    connexionClient();
                    break;
                default:
                    System.out.println("Saisie incorrecte.");
                    connexionClient();
                    break;
            }
        System.out.println();
        }
    }
    
    
    static public void retrouverClient() {
        System.out.println();
        String id = Saisie.lireChaine("Entrer l'identifiant du client que "
                + "vous cherchez : ");
        Long idClient = Long.parseLong(id);
        System.out.println(ServiceEmploye.retrouverClient(idClient));
        System.out.println();
    }

    static public void demarrerVoyance() {
        System.out.println();
        String id = Saisie.lireChaine("Entrer l'identifiant du client avec qui"
                + " vous voulez demarrer la voyance : ");
        Long idClient = Long.parseLong(id);
        
        List<Medium> listMedium = ServiceClient.genererMediums();
        for (int i = 0; i < listMedium.size(); i++) {
            System.out.println(i + 1 + "- " + listMedium.get(i));
        }
        int choixMedium = Saisie.lireInteger("Choisisser "
                + "votre medium : ");
        Voyance voyance = ServiceClient.demanderVoyance(
                listMedium.get(choixMedium - 1), 
                ServiceEmploye.retrouverClient(idClient));
        ServiceEmploye.demarrerVoyance(voyance);
        System.out.println();
        System.out.println("Disscussion démarré:");
        System.out.println("1- Cloturer la discussion avec commentaire");
        System.out.println("2- Cloturer la discussion sans commentaire");
        System.out.println();
        int choix = Saisie.lireInteger("Entrez votre choix : ");
        do {
            switch (choix) {
                case 1:
                    String commentaire = Saisie.lireChaine("Entrez votre "
                            + "commentaire : ");
                    ServiceEmploye.cloturerVoyanceAvecCommentaire(voyance,
                            commentaire);
                    break;
                case 2:
                    ServiceEmploye.cloturerVoyanceSansCommentaire(voyance);
                    break;   
                default:
                    System.out.println("Saisie incorrecte.");
                    break;
            }
        } while (choix != 1 && choix !=2);
        System.out.println();
        
        System.out.println();
        System.out.println("Disscussion démarré:");
        System.out.println("1- Générer tableau de bord");
        System.out.println("2- Générer statistiques du medium");
        System.out.println("3- Générer statistiques de l'employé");
        System.out.println("4- Générer répartition des employé");
        System.out.println("5- Générer prédiction pour le client");
        System.out.println();
        choix = Saisie.lireInteger("Entrez votre choix : ");
         do {
            switch (choix) {
                case 1:
                    String commentaire = Saisie.lireChaine("Entrez votre "
                            + "commentaire : ");
                    ServiceEmploye.cloturerVoyanceAvecCommentaire(voyance,
                            commentaire);
                    break;
                case 2:
                    ServiceEmploye.genererTableauBord();
                    break;
                case 3:
                    ServiceEmploye.genererStatistiquesMedium();
                    break;
                case 4:
                    ServiceEmploye.genererStatistiquesEmploye();
                    break;   
                case 5:
                    ServiceEmploye.genererRepartitionEmploye();
                    break;
                default:
                    System.out.println("Saisie incorrecte.");
                    break;
            }
        } while (choix != 1 && choix !=2 && choix != 3 && choix !=4 && choix != 5);
    }
}
