Ce projet Java simule la gestion d'une petite entreprise avec une hiérarchie d'employés, comprenant des managers et des développeurs. Il est structuré en plusieurs packages pour assurer une organisation claire des différentes fonctionnalités :

ma.projet.beans : Contient les classes qui représentent les employés de l'entreprise (Personne, Manager, Developpeur) avec des attributs comme le nom et le salaire.

ma.projet.connexion : Gère la connexion à la base de données via la classe Connexion, qui utilise un fichier de configuration properties pour les informations de connexion (URL, nom d'utilisateur, mot de passe).

ma.projet.dao : Définit une interface IDao pour standardiser les opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) des entités métier.

ma.projet.service : Implémente les services associés aux employés (ManagerService, DeveloppeurService) en appliquant les méthodes CRUD définies dans l'interface IDao.

ma.projet.test : Comprend la classe Entreprise qui permet de tester les fonctionnalités de gestion d'employés, notamment l'ajout, la mise à jour, et l'affichage de la hiérarchie des employés.


Prérequis
Java 8+
MySQL (ou tout autre SGBD compatible avec JDBC)
XAMPP ou un autre environnement de serveur local pour gérer MySQL
NetBeans ou un autre IDE Java
Fichier properties pour la configuration de la connexion à la base de données.
