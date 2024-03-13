package TD;

import java.util.ArrayList;
import java.util.Collections;

public class Banque {
    String nom;
    ArrayList<Compte> comptes;

    public Banque(String nom) {
        this.nom = nom;
        comptes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void AjouterCompte(Compte compte) {
    	
    	comptes.add(compte);
    }
    public void Affiche() {
        System.out.println("Liste des comptes de la banque " + nom + ":");
        for (Compte compte : comptes) {
      
                            System.out.println("Compte [numero=" + compte.numero + ", solde=" + compte.solde + "]");
            
        }
    }

  

    public void creerCompte(Titulaire t, int n) {
        Compte compte = new Compte(n);
        t.ajoutCompte(compte);
        comptes.add(compte);
    }
    
    public void trierComptes() {
        Collections.sort(comptes, new SoldeComparator());
    }

}
