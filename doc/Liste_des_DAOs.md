# Liste des DAOs

La liste des DAOs de l'application POSIT'IF

## DAOs Administrateurs

```public static void persistMedium(Medium medium);```
Permet de persister un

```public static void persistEmploye(Employe employe);```


```public static Employe trouverEmployeDisponible();```


```public static String modifierVoyance(Voyance voyance, Medium medium, Client client, Employe employe);```



## DAOs Clients

```public static String persistClient(Client client);```


```public static void persistVoyance(Voyance voyance);```


```public static boolean trouverMail(String mail);```


```public static List<Medium> getListMediums();```


```public static List<Voyance> getListVoyances(Long idClient);```



## DAOs Employés

```public static Client trouverClient(Long idClient);```


```public static void mergeDateDebutVoyance(Voyance voyance, Date dateDebut);```


```public static void mergeDateFinVoyance(Voyance voyance, Date dateFin);```


```public static void mergeCommentaire(Voyance voyance, String commentaire);```


```public static void mergeDisponibilite(Employe employe);```


