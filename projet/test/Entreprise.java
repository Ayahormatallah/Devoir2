package ma.projet.test;


import ma.projet.beans.*;

import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;
import java.util.List;



public class Entreprise {
    public static void main(String[] args) {
        DeveloppeurService developpeurservice = new DeveloppeurService();
        // Création des 2  développeurs
        Developpeur dev1 = new Developpeur("aya", 6000);
        Developpeur dev2 = new Developpeur("mohamed", 6500);
        developpeurservice.create(dev1);
        developpeurservice.create(dev2);
        
         // Étape 2: Création d'un manager
        ManagerService managerservice = new ManagerService();
        Manager manager1 = new Manager("Manager 1", 50000);
        managerservice.create(manager1);
        //ceration d'un 3eme developpeur
        Developpeur dev3 = new Developpeur ("amine",5000);
        developpeurservice.create(dev3);
        // Créer un directeur général qui gère un manager et un autre développeur
        Manager directeur = new Manager("directeur",100000);
        managerservice.create(directeur);
        System.out.println("Directeur Général: " + directeur.getNom() + " - Salaire: " + directeur.getSalaire());
        System.out.println("Manager: " + manager1.getNom() + " - Salaire: " + manager1.getSalaire());
        System.out.println("Développeurs gérés par le manager:");
        List<Developpeur> developpeurs = developpeurservice.getAll();
        for (Developpeur dev : developpeurs) {
            System.out.println("Développeur: " + dev.getNom() + " - Salaire: " + dev.getSalaire());
        }
        System.out.println("Développeur direct sous la responsabilité du Directeur Général: " + dev3.getNom() + " - Salaire: " + dev3.getSalaire());
    }}
        
       