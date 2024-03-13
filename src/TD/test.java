package TD;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		Compte c1 = new Compte (1);
		Compte c2 = new Compte (2);
		Compte c3 = new Compte (3);
		System.out.println("le compte a l'instruction  :\n" + c1.toString());
		
		
		c1.depot(100);
		System.out.println("le compte c1   apres depot:\n" + c1.toString());

		c1.retrait(10);
		System.out.println("le compte  aprés retrait :\n" + c1.toString());

		Titulaire t1 = new Titulaire ("tayssir");
		
		t1.ajoutCompte(c2);
		t1.ajoutCompte(c1);
		System.out.println("le titulaire  a l'instruction :");
		t1.afficheTitulaire();
		
		t1.effectuerRetrait(1,59);
		System.out.println("le titulaire  aprés retrait :");

		t1.afficheTitulaire();
		
		t1.effectuerDepot(2,500);
		System.out.println("le titulaire  aprés depot :");

		t1.afficheTitulaire();
		
		
		
		
		Banque b1 = new Banque("tayssir");
		b1.AjouterCompte(c1);
        b1.AjouterCompte(c2);
        b1.AjouterCompte(c3);

        
        b1.Affiche();
        
        System.out.println("le numéro de compte ayant le maximum solde "+ t1.trouverCompteSoldeMax());
        
        
        
        
        System.out.println("Comptes avant le tri :");
        b1.Affiche();

        b1.trierComptes();

        System.out.println("\nComptes après le tri :");
        b1.Affiche();
    }

	

}
