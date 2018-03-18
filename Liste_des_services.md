# Liste des services

La liste des services métiers de POSIT'IF

## Services Administrateur

La liste des services métiers Administrateur de POSIT'IF

```static void initPositif();```
Permet d'initialiser la plateform POSIT'IF
```static void ajoutEmploye(Employe employe);```
Permet d'ajouter un employé à POSIT'IF
```static void ajoutMedium(Medium medium);```
Permet d'ajouter un medium à POSIT'IF
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
Permet à l'employé de générer retrouver un client de POSIT'IF
```static void demarerVoyance(Voyance voyance);```
```static void cloturerVoyanceAvecCommentaire(Voyance voyance, Commentaire commentaire, Employe employe);```
```static void cloturerVoyanceSansCommentaire(Voyance voyance, Employe employe);```
```static String visualiserStatistiquesMedium();```
```static List<String> genererPredictions(int amour, int sante, int travail);```


