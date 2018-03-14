# Liste des services

## Services Clients
```
List<Medium> demanderVoyance();
void choisirMedium(Medium medium);
List<Voyance> genererHistorique(Client client);
```
## Services Employes
```
Client visualiserProfilClient(Long idClient);
void demarerConversation(Long idClient, Long idEmploye, Long idMedium);
void cloturerConversationAvecCommentaire(String commentaire);
void cloturerConversationSansCommentaire();
String visualiserStatistiquesMedium()
List<String> genererPrediction(int amour, int sante, int travail)
```