package TD;

import java.util.Objects;

public class Compte  implements  Comparable<Compte> {
    int numero;
    double solde;

    public Compte(int numero) {
        this.numero = numero;
        this.solde = 0; }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    void retrait(double m) {
        solde = solde - m;
    }

    void depot(double m) {
        solde = solde + m;
    }

    @Override
    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + "]";
    }
    
    @Override
    public int compareTo(Compte autreCompte) {
        return Double.compare(this.solde, autreCompte.solde);
    }
    

	@Override
	public int hashCode() {
		return Objects.hash(numero, solde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return numero == other.numero && Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}
	
	

	
    
}
