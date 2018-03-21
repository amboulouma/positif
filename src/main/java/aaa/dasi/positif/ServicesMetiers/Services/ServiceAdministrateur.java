/**
 * POSIT'IF 2018
 * 
 * 
 * @author B3432
 * @author Abdelaziz El Omari Alaoui
 * @author Agathe Sauvestre
 * @author Amine Mohamed Boulouma
 */


package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.AdministrateurDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Astrologue;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.Employe;
import aaa.dasi.positif.ServicesMetiers.Modeles.Medium;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import aaa.dasi.positif.ServicesMetiers.Modeles.Tarologue;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyance;
import aaa.dasi.positif.ServicesMetiers.Modeles.Voyant;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;


public class ServiceAdministrateur {
    
    public static void initPositif(){
        System.out.println();
        System.out.println("[ServiceAdministrateur] Service initialisation de "
                + "l'application POSIT'IF lancé.");
        System.out.println();
        System.out.println("Initialisation de POSIT'IF...");
        System.out.println();
        System.out.println("---------------------------------------------------"
                + "---------------------");
        Medium mediumGwenael = new Voyant("Boule de Cristal", "Gwenaël", 
                "Spécialiste des grandes conversations au-delà de TOUTES "
                + "les frontières.");
        Medium mediumDalmarre = new Voyant("Marc de Café", "J. Dalmarre", 
                "Votre avenir est devant vous: regardons-le ensemble!");
        Medium mediumIrma = new Tarologue("Tarot de Marseille", "Mme Irma", 
                "Comprenez votre entourage grâce à mes cartes! Résultats "
                + "rapides.");
        Medium mediumLisa = new Tarologue("Tarot de Brocéliande", "Mme Lisa "
                + "Maria NGUYINIA", "Mes cartes spécialisées pour la région "
                + "Bretagne répondront à toutes questions "
                + "personnelles.");
        Medium mediumSara = new Astrologue("Ecole Normale Supérieure "
                + "d'Astrologie (ENS-Astro)", "2006", "Mme Sara", 
                "Basée à Champigny-sur-Marne, Mme Sara vous révèlera "
                + "votre avenir pour éclairer votre passé.");
        Medium mediumMounia = new Astrologue("Institut des Nouveaux Savoirs "
                + "Astrologiques", "2010" , "Mme Mounia Mounia", "Avenir, "
                + "avenir, que nous réserves-tu? N'attendez plus, "
                + "demandez à me consulter!");
    
        Employe employeGireux = new Employe("GIREUX", "Zouhair");
        Employe employeTchiumakova = new Employe("TCHIUMAKOVA", "Nicolas");
        Employe employeKamaro = new Employe("KEMARO", "Cédric");
        Employe employePamitescu = new Employe("PAMITESCY", "Olena");
        
        final int NOMBRE_CLIENTS = 20;
        
        Client clients[] = new Client[NOMBRE_CLIENTS];
        
        String noms[] = {"Martin", "Bernard", "Thomas", "Petit", "Robert", 
            "Richard", "Durand", "Dubois", "Moreau", "Laurent", "Simon", 
            "Michel", "Lefebvre", "Leroy", "Roux", "David", "Bertrand", 
            "Morel", "Fournier", "Girard"};
        String prenoms[] = {"Emma", "Lucas", "Chloé", "Louis", "Jade", "Gabriel",
            "Manon", "Julien", "Louise", "Timéo", "Zoé", "Hugo", "Kendra", 
            "Arthur", "Léna", "Ethan","Sarah", "Raphaël", "Camille", "Maël"};
        String civilites[] = {"F", "M"};
        
        int annee = 0, mois = 0, jour = 0, i = 0;
        Date datesDeNaissance[] = new Date[NOMBRE_CLIENTS];
        
        for(i = 0; i < NOMBRE_CLIENTS; i++) {
            annee = ThreadLocalRandom.current().nextInt(1960, 2000);
            mois = ThreadLocalRandom.current().nextInt(1, 13);
            jour = ThreadLocalRandom.current().nextInt(1, 29);
            datesDeNaissance[i] = new Date(annee, mois, jour);
        }
        
        String adresses[] = {"40 rue Marilyn Monroe", 
            "39 avenue Abraham Lincoln", "3 rue Mother Teresa ", 
            "10 avenue John F. Kennedy", "57 rue Martin Luther King", 
            "4 avenue Nelson Mandela ", "21 rue Queen Elizabeth", 
            "10 avenue Winston Churchill", "43 rue Donald Trump ", 
            "48 avenue Bill Gates ", "25 rue Muhammad Ali", 
            "44 avenue Mahatma Gandhi", "30 rue Margaret Thatcher", 
            "14 avenue Christopher Columbus", "10 rue Charles Darwin ", 
            "30 avenue Elvis Presley ", "6 rue Albert Einstein ", 
            "12 avenue Paul McCartney ", "8 rue Queen Victoria ", 
            "55 avenuePope Francis "};
        String villes[] = {"Paris", "Marseille ", "Lyon ", "Toulouse ", "Nice", 
            "Nantes ", "Strasbourg", "Montpellier ", "Bordeaux", "Rennes", 
            "Le Havre ", "Reims ", "Lille ", "Saint-Étienne", "Toulon", 
            "Grenoble", "Angers", "Dijon", "Brest", "Le Mans"};
        String pays = "France";
        String codesPostales[] = {"75000", "13000", "69000", "31000", "06000", 
            "44000", "67000", "34000", "33000", "35000", "76600", "51100", 
            "59000", "42000", "83000", "38000","49000", "21000", "29100", 
            "72000"};

        AdressePostale adressesPostales[] = new AdressePostale[NOMBRE_CLIENTS];
        for(i = 0; i < NOMBRE_CLIENTS; i++) {
            adressesPostales[i] = new AdressePostale(adresses[i], 
                    villes[i], 
                    pays,
                    codesPostales[i]);
        }
        
        String telephones[] = {"06 73 17 97 68", "06 32 66 36 28", "06 28 04 42 48", 
            "06 04 67 54 07", "06 67 15 72 87", "06 98 69 30 41", 
            "06 77 71 51 93", "06 91 68 99 14","06 99 76 30 09", 
            "06 97 02 17 46", "06 33 41 25 33", "06 22 34 94 82", 
            "06 32 64 53 97", "06 74 69 10 14", "06 63 80 67 34", 
            "06 64 09 61 06","06 38 44 61 58", "06 14 04 67 40", 
            "06 39 12 87 07", "06 70 14 85 97"};
        String mails[] = {"martin.emma@gmail.com", "bernard.lucas@gmail.com", 
            "thomas.chloe@gmail.com", "petit.louis@gmail.com", 
            "robert.jade@gmail.com", "richard.gabriel@gmail.com", 
            "durand.manon@gmail.com", "dubois.julien@gmail.com", 
            "moreau.louise@gmail.com", "laurent.timeo@gmail.com", 
            "simon.zoe@gmail.com", "michel.hugo@gmail.com", 
            "lefebvre.kendra@gmail.com", "leroy.arthur@gmail.com", 
            "roux.lena@gmail.com", "david.ethan@gmail.com", 
            "bertrand.sarah@gmail.com", "morel.raphael@gmail.com", 
            "fournier.camille@gmail.com", "girard.mael@gmail.com"};
        
        ProfilAstrologique profilAstrologique = 
                new ProfilAstrologique("Signe du zodiaque",
                "Signe Astrologique",
                "Couleur porte bonheur",
                "Animal Totem");
        
        for(i = 0; i < NOMBRE_CLIENTS; i++) {
            clients[i] = new Client(noms[i], 
                prenoms[i],
                civilites[(i%2)],
                datesDeNaissance[i],
                adressesPostales[i],
                telephones[i],
                mails[i],
                profilAstrologique);
        }
        
        ajoutMedium(mediumGwenael);
        ajoutMedium(mediumDalmarre);
        ajoutMedium(mediumIrma);
        ajoutMedium(mediumLisa);
        ajoutMedium(mediumSara);
        ajoutMedium(mediumMounia);
        
        ajoutEmploye(employeGireux);
        ajoutEmploye(employeTchiumakova);
        ajoutEmploye(employeKamaro);
        ajoutEmploye(employePamitescu);
        
        for(i = 0; i < NOMBRE_CLIENTS; i++) {
            ajoutClient(clients[i]);
        }
        
        System.out.println("---------------------------------------------------"
                + "---------------------");
        System.out.println("Fin de l'initialisation de l'application POSIT'IF");
    }
    

    public static void ajoutMedium(Medium medium){
        System.out.println();
        System.out.println("[ServiceAdministrateur] Service ajout du "
                + "medium lancé.");
        System.out.println();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        AdministrateurDAO.persistMedium(medium);
        JpaUtil.validerTransaction();
    }
    
    public static void ajoutEmploye(Employe employe){
        System.out.println();
        System.out.println("[ServiceAdministrateur] Service ajout de "
                + "l'employé lancé.");
        System.out.println();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        AdministrateurDAO.persistEmploye(employe);
        JpaUtil.validerTransaction();
    }
    
    public static void ajoutClient(Client client){
        System.out.println();
        System.out.println("[ServiceAdministrateur] Service ajout du "
                + "client lancé.");
        System.out.println();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        AdministrateurDAO.persistClient(client);
        JpaUtil.validerTransaction();
    }
    
    public static Voyance affectationVoyance(Medium medium, 
            Client client, Voyance voyance){
        System.out.println();
        System.out.println("[ServiceAdministrateur] Service d'affectation de "
                + "voyance lancé.");
        System.out.println();
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Employe employe = 
                AdministrateurDAO.trouverEmployeAvecAffectationsMinimales();
        String notificationEmploye = AdministrateurDAO.modifierVoyance(voyance, 
                medium, client, employe);
        JpaUtil.validerTransaction();
        System.out.println("[Notification Employe] " + notificationEmploye);
        return voyance;
    }
}
