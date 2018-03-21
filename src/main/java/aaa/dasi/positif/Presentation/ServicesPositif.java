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

        System.out.println("4- Lancer le service d'affectation de voyance");

        System.out.println();

        System.out.println("Les service Client ");

        System.out.println();

        System.out.println("5- Lancer le service d'inscription");

        System.out.println("6- Lancer le service de connexion");

        System.out.println("7- Lancer le service de génération des mediums");

        System.out.println("8- Lancer le service de demande de voyances");

        System.out.println("9- Lancer le service de génération de "
                + "l'historique");

        System.out.println();

        System.out.println("Les service Employé");

        System.out.println();

        System.out.println("10- Lancer le service de retrouver un client");

        System.out.println("11- Lancer le service de démarrer une voyance");

        System.out.println("12- Lancer le service cloturer voyance avec "
                + "commentaire");

        System.out.println("13- Lancer le service cloturer voyance sans "
                + "commentaire");

        System.out.println("14- Lancer le service de génération du tableau "
                + "de bord");

        System.out.println("15- Lancer le service de génération de statistiques "
                + "des mediums");

        System.out.println("16- Lancer le service de génération de statistiques "
                + "des employés");

        System.out.println("17- Lancer le service de génération de répartition "
                + "des employés");

        System.out.println("18- Lancer le service de génération de prédictions "
                + "client");
        
        System.out.println();
        
        return Saisie.lireInteger("Entrez le numéro du service que vous voulez "
                + "lancer : ");   
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

    static public void affectationVoyance() {
        System.out.println();
        
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
            if (choix == 1) {
                System.out.println();
                List<Medium> listMedium = ServiceClient.
                        genererMediums();
                for (int i = 0; i < listMedium.size(); i++) {
                    System.out.println("1- " + listMedium.get(i));
                }
                int choixMedium = Saisie.lireInteger("Choisisser "
                        + "votre medium : ");
                Voyance voyance = ServiceClient.demanderVoyance(
                        listMedium.get(choixMedium + 1), client);
                System.out.println();
            } else if (choix == 2) {
                System.out.println();
                System.out.println(ServiceClient.genererHistoriqueVoyances(mail));
                System.out.println();
            } else {
                System.out.println("Saisie incorrecte.");
                connexionClient();
            }
        } else {
            System.out.println("Saisie incorrecte.");
            int choix = Saisie.lireInteger("Si vous n'etes pas encore inscrit "
                    + "entrez 1 sinon 2 pour reessayer de vous connecter : ");
            if (choix == 1) {
                inscriptionClient();
            } else if (choix == 2) {
                connexionClient();
            } else {
                System.out.println("Saisie incorrecte.");
                connexionClient();
            }
        System.out.println();
        }
    }
    

    static public void retrouverClient() {
        System.out.println();
        System.out.println(ServiceEmploye.retrouverClient(idClient));
        System.out.println();
    }

    static public void demarerVoyance() {
        System.out.println();
        ServiceEmploye.demarrerVoyance(voyance);
        System.out.println();
    }

    static public void cloturerVoyanceAvecCommentaire() {
        System.out.println();
        String commentaire = "Un commentaire pour tester.";
        ServiceEmploye.cloturerVoyanceAvecCommentaire(voyance, commentaire);
        System.out.println();
    }

    static public void cloturerVoyanceSansCommentaire() {
        System.out.println();
        ServiceEmploye.cloturerVoyanceSansCommentaire(voyance);
        System.out.println();
    }

    static public void genererTableauBord() {
        System.out.println();
        System.out.println(ServiceEmploye.genererTableauBord());
        System.out.println();
    }

    static public void genererStatistiquesMedium() {
        System.out.println();

        System.out.println();
    }

    static public void genererStatistiquesEmploye() {
        System.out.println();

        System.out.println();
    }

    static public void genererRepartitionEmploye() {
        System.out.println();

        System.out.println();
    }

    static public void genererPredictionsClient() {
        System.out.println();
        System.out.println(ServiceEmploye.genererPredictionsClient(client, 2, 
                    1, 3));
        System.out.println();
    }
}
