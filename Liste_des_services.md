# Liste des services

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
static Client retournerClient(Long idClient); (pas testé)
static void demarerVoyance(Voyance voyance);
static void cloturerVoyanceAvecCommentaire(Voyance voyance, String commentaire);
static void cloturerVoyanceSansCommentaire(Voyance voyance);
static String visualiserStatistiquesMedium();
static List<String> genererPredictions(int amour, int sante, int travail);
```

## Services Administrateur
```
static void ajoutMedium(Medium medium); 
static void ajoutEmploye(Employe employe); 
static static Voyance affectationVoyance(Medium medium, client, Voyance voyance);
static void initPlatefome();
```
