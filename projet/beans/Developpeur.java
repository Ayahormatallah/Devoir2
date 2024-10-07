package ma.projet.beans;

public class Developpeur extends Personne {

    public Developpeur(String nom, double salaire) {
        super(nom, salaire);
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Developpeur [nom=" + getNom() + ", salaire=" + getSalaire() + "]";
    }
    
}
