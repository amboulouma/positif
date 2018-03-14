# Liste des services

## Services Clients
```
static void inscriptionClient(Client client);
static boolean connexionClient(String mail);
static List<Medium> demanderVoyance();
static void choisirMedium(Medium medium);
static List<Voyance> genererHistorique(Client client);
```
## Services Employes
```
static Client visualiserProfilClient(Long idClient);
static void demarerConversation(Long idClient, Long idEmploye, Long idMedium);
static void cloturerConversationAvecCommentaire(String commentaire);
static void cloturerConversationSansCommentaire();
static String visualiserStatistiquesMedium();
static List<String> genererPrediction(int amour, int sante, int travail);
```