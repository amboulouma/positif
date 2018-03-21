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
import aaa.dasi.positif.ServicesMetiers.Services.util.Saisie;
import java.io.IOException;
import java.text.ParseException;

public class Positif {
    public static void main(String[] args) throws IOException, ParseException{
        JpaUtil.init();
        boolean flag = true;
        while (flag) {
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
                                + "d'inscription à POSIT'IF.");
                        ServicesPositif.inscriptionClient();
                        break;
                case 5:
                        System.out.println("Vous avez choisi le service de connexion "
                                + "à POSIT'IF.");
                        ServicesPositif.connexionClient();
                        break;
                case 6:
                        System.out.println("Vous avez choisi le service de "
                                + "retrouver un client de POSIT'IF.");
                        ServicesPositif.retrouverClient();
                        break;
                case 7:
                        System.out.println("Vous avez choisi le service de "
                                + "démarrage de voyance POSIT'IF.");
                        ServicesPositif.demarrerVoyance();
                        break;
                default: System.out.println("Service introuvable.");
                        break;
            }
            Saisie.pause();
        }
        JpaUtil.destroy();
    }
    
}
