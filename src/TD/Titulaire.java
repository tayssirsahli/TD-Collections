package TD;

import java.util.HashSet;

public class Titulaire {
    String nom;
    HashSet<Compte> MesComptes;

    Titulaire(String n) {
        nom = n;
        MesComptes = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashSet<Compte> getMesComptes() {
        return MesComptes;
    }

    public void setMesComptes(HashSet<Compte> mesComptes) {
        MesComptes = mesComptes;
    }

    public void ajoutCompte(Compte c) {
        MesComptes.add(c);
    }

    public void afficheTitulaire() {
        System.out.println("Liste des comptes de " + nom + ":");
        for (Compte compte : MesComptes) {
            System.out.println(compte);
        }
    }

    void effectuerRetrait(int numeroCompte, double montant) {
        for (Compte compte : MesComptes) {
            if (compte.numero == numeroCompte) {
                if (compte.solde >= montant) {
                    compte.retrait(montant);
                    System.out.println("Retrait de " + montant + " effectué sur le compte " + numeroCompte);
                } else {
                    System.out.println("Solde insuffisant pour effectuer le retrait sur le compte " + numeroCompte);
                }
                return;
            }
        }
        System.out.println("Le compte " + numeroCompte + " n'existe pas pour " + nom);
    }

    public void effectuerDepot(int numeroCompte, double montant) {
        for (Compte compte : MesComptes) {
            if (compte.numero == numeroCompte) {
                compte.depot(montant);
                System.out.println("Dépôt de " + montant + " effectué sur le compte " + numeroCompte);
                return;
            }
        }
        System.out.println("Le compte " + numeroCompte + " n'existe pas pour " + nom);
    }
    
    public int trouverCompteSoldeMax() {
        Compte compteMax = null;
        double soldeMax = 0;

        for (Compte compte : MesComptes) {
            if (compte.getSolde() > soldeMax) {
                soldeMax = compte.getSolde();
                compteMax = compte;
            }
        }

        return (compteMax != null) ? compteMax.getNumero() : -1;
    }

	
	
}
