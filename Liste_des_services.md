# Liste des services

## Services Administrateur
```
static void initPositif();
static void ajoutEmploye(Employe employe); 
static void ajoutMedium(Medium medium); 
static Voyance affectationVoyance(Medium medium, Client client, Voyance voyance);
```

## Services Clients
```
static String inscriptionClient(Client client);
static boolean connexionClient(String mail);
static List<Medium> genererMediums();
static Voyance demanderVoyance(Medium medium, Client client);
static List<Voyance> genererHistoriqueVoyances(Client client);
```
## Services Employes
```
static Client retournerClient(Long idClient);
static void demarerVoyance(Voyance voyance);
static void cloturerVoyanceAvecCommentaire(Voyance voyance, Commentaire commentaire, Employe employe);
static void cloturerVoyanceSansCommentaire(Voyance voyance, Employe employe)
static String visualiserStatistiquesMedium();
static List<String> genererPredictions(int amour, int sante, int travail);
```

