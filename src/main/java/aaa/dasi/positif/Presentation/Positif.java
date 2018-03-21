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

import java.io.IOException;

public class Positif {
    public static void main(String[] args) throws IOException{
        while (true) {
            int service = ServicesPositif.interfaceUtilisateur();
            switch (service) {
                case 0:
                        System.out.println("Vous avez choisi le service "
                                + "d'initialisation de l'application.");
                        ServicesPositif.initPositif();
                        break;
                case 1:
                        System.out.println("Vous avez choisi le service d'ajout"
                                + " d'employé à POSIT'IF.");
                        ServicesPositif.ajoutEmploye();
                        break;
                case 2:
                        System.out.println("Vous avez choisi le service d'ajout de "
                                + "medium à POSIT'IF.");
                        ServicesPositif.ajoutMedium();
                        break;
                case 3:
                        System.out.println("Vous avez choisi le service d'ajout "
                                + "de client à POSIT'IF.");
                        ServicesPositif.ajoutClient();
                        break;
                case 4: 
                        System.out.println("Vous avez choisi le service "
                                + "d'attenctation de voyance à un employé "
                                + "d'employé de POSIT'IF.");
                        ServicesPositif.affectationVoyance();
                        break;
                case 5:
                        System.out.println("Vous avez choisi le service "
                                + "d'inscription à POSIT'IF.");
                        ServicesPositif.inscriptionClient();
                        break;
                case 6:
                        System.out.println("Vous avez choisi le service de connexion "
                                + "à POSIT'IF.");
                        ServicesPositif.connexionClient();
                        break;
                case 7:
                        System.out.println("Vous avez choisi le service de "
                                + "génération des mediums de POSIT'IF.");
                        ServicesPositif.genererMediums();
                        break;
                case 8:
                        System.out.println("Vous avez choisi le service de demande "
                                + "de voyance POSIT'IF.");
                        ServicesPositif.demanderVoyance();
                        break;
                case 9:
                        System.out.println("Vous avez choisi le service de "
                                + "génértion de l'historique de voyance.");
                        ServicesPositif.genererHistoriqueVoyances();
                        break;
                case 10:
                        System.out.println("Vous avez choisi le service de "
                                + "retrouver un client de POSIT'IF.");
                        ServicesPositif.retrouverClient();
                        break;
                case 11:
                        System.out.println("Vous avez choisi le service de "
                                + "démarrage de voyance POSIT'IF.");
                        ServicesPositif.demarerVoyance();
                        break;
                case 12:
                        System.out.println("Vous avez choisi le service de "
                                + "cloturage de voyance avec commentaire.");
                        ServicesPositif.cloturerVoyanceAvecCommentaire();
                        break;
                case 13:
                        System.out.println("Vous avez choisi le service de "
                                + "cloturage de voyance sans commentaire.");
                        ServicesPositif.cloturerVoyanceSansCommentaire();
                        break;
                case 14:
                        System.out.println("Vous avez choisi le service de "
                                + "génération de tableau de bord.");
                        ServicesPositif.genererTableauBord();
                        break;
                case 15:
                        System.out.println("Vous avez choisi le service de "
                                + "génération de statistiques des mediums de "
                                + "POSIT'IF.");
                        ServicesPositif.genererStatistiquesMedium();
                        break;
                case 16:
                        System.out.println("Vous avez choisi le service de "
                                + "génération de statistiques des employes de "
                                + "POSIT'IF.");
                        ServicesPositif.genererStatistiquesEmploye();
                        break;
                case 17:
                        System.out.println("Vous avez choisi le service de "
                                + "génération de repartition des employes de "
                                + "POSIT'IF.");
                        ServicesPositif.genererRepartitionEmploye();
                        break;
                case 18:
                        System.out.println("Vous avez choisi le service de "
                                + "génération de prédictions client.");
                        ServicesPositif.genererPredictionsClient();
                        break;
                default: System.out.println("Service introuvable.");
                        break;
            }
        }   
    }
    
}
