# Liste des services

## Services Clients
```
static String inscriptionClient(Client client);
static boolean connexionClient(String mail);
static List<Medium> genererMediums();
static Voyance creerVoyance(Medium medium, Client client);
static List<Voyance> genererHistoriqueVoyances(Client client);
```
## Services Employes
```
static Client retournerClient(Long idClient); (pas testé)
static void demarerConversation(Long idClient, Long idEmploye, Long idMedium);
static void cloturerConversationAvecCommentaire(String commentaire);
static void cloturerConversationSansCommentaire();
static String visualiserStatistiquesMedium();
static List<String> genererPredictions(int amour, int sante, int travail);
```

## Services Administrateur
```
static void ajoutMedium(Medium medium); 
static void initPlatefome();
```
