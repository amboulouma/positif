# Liste des services

La liste des services métiers de l'application POSIT'IF

## Services Administrateur

La liste des services métiers Administrateur de POSIT'IF

```static void initPositif();```
Permet d'initialiser l'application POSIT'IF

```static void ajoutEmploye(Employe employe);```
Permet d'ajouter un employé à POSIT'IF

```static void ajoutMedium(Medium medium);```
Permet d'ajouter un medium à POSIT'IF

```public static void ajoutClient(Client client);```
Permet d'ajouter un client à POSIT'IF

```static Voyance affectationVoyance(Medium medium, Client client, Voyance voyance);```
Permet d'affecter une voyance à un employé

## Services Clients

La liste des services métiers Clients de POSIT'IF

```static String inscriptionClient(Client client);```
Permet au client de s'inscrire à POSIT'IF

```static boolean connexionClient(String mail);```
Permet au client de se connecter à POSIT'IF

```static List<Medium> genererMediums();```
Permet au client de générer les mediums de POSIT'IF

```static Voyance demanderVoyance(Medium medium, Client client);```
Permet au client de demander une voyance à POSIT'IF

```static List<Voyance> genererHistoriqueVoyances(Client client);```
Permet au client de générer l'historique de ses voyances à POSIT'IF

## Services Employés

La liste des services métiers Employés de POSIT'IF

```static Client retrouverClient(Long idClient);```
Permet à l'employé de retrouver un client de POSIT'IF

```static void demarerVoyance(Voyance voyance);```
Permet à l'employé de démarer une voyance avec un client de POSIT'IF

```static void cloturerVoyanceAvecCommentaire(Voyance voyance, Commentaire commentaire, Employe employe);```
Permet à l'employé de cloturer une voyance commentée avec un client de POSIT'IF

```static void cloturerVoyanceSansCommentaire(Voyance voyance, Employe employe);```
Permet à l'employé de démarer une voyance non commentée avec un client de POSIT'IF

```static String genererTableauBord();```
Permet de générer le tableau de bord comprenant toutes les statistiques des mediums et des employés de POSIT'IF

```static String genererStatistiquesMedium();```
Permet à l'employé de générer les statistiques de voyances d'un medium de POSIT'IF

```static String genererStatistiquesEmploye();```
Permet à l'employé de générer les statistiques de voyances d'un employé de POSIT'IF

```static String genererRepartitionEmploye()```
Permet à l'employé de générer les statistiques de répartition de voyances entre les employés de POSIT'IF

```static List<String> genererPredictionsClient(Client client, int amour, int sante, int travail);```
Permet à l'employé de générer les prédictions d'un client de POSIT'IF