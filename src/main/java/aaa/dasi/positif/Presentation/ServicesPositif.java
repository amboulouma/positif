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
import aaa.dasi.positif.ServicesMetiers.Services.util.Saisie;
public class ServicesPositif {
    
    
    static public int interfaceUtilisateur() {
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

        System.out.println("10 -Lancer le service de retrouver un client");

        System.out.println("11- Lancer le service de démarrer une voyance");

        System.out.println("12- Lancer le service cloturer voyance avec "
                + "commentaire");

        System.out.println("13- Lancer le service cloturer voyance sans "
                + "commentaire");

        System.out.println("14 - Lancer le service de génération du tableau "
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
                + "lancer.");   
    }
        

    static public void initPositif() {
        System.out.println();

        System.out.println();
    }

    static public void ajoutEmploye() {
        System.out.println();

        System.out.println();
    }

    static public void ajoutMedium() {
        System.out.println();

        System.out.println();
    }

    static public void ajoutClient() {
        System.out.println();

        System.out.println();
    }

    static public void affectationVoyance() {
        System.out.println();

        System.out.println();
    }

    static public void inscriptionClient() {
        System.out.println();

        System.out.println();
    }

    static public void connexionClient() {
        System.out.println();

        System.out.println();
    }

    static public void genererMediums() {
        System.out.println();

        System.out.println();
    }

    static public void demanderVoyance() {
        System.out.println();

        System.out.println();
    }

    static public void genererHistoriqueVoyances() {
        System.out.println();

        System.out.println();
    }

    static public void retrouverClient() {
        System.out.println();

        System.out.println();
    }

    static public void demarerVoyance() {
        System.out.println();

        System.out.println();
    }

    static public void cloturerVoyanceAvecCommentaire() {
        System.out.println();

        System.out.println();
    }

    static public void cloturerVoyanceSansCommentaire() {
        System.out.println();

        System.out.println();
    }

    static public void genererTableauBord() {
        System.out.println();

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

        System.out.println();
    }
}
