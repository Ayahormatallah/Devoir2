package ma.projet.beans;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Personne  {
    private String nom; // Nom du manager
    private double salaire; // Salaire du manager
    private List<Developpeur> developpeurs;
    private List<Personne> manager;
    // Liste des développeurs gérés par le manager

    // Constructeur
  
    public Manager(String nom, double salaire) {
        super(nom,salaire);
        this.developpeurs = new ArrayList<>(); // Initialisation de la liste des développeurs
        this.manager= new ArrayList<>();
            }

    
    // Getters
    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setSalaire(double salaire){
        this.salaire=salaire;
    }

    
    
}
