package GestionUniteScolaire;


public class Professeur extends Personne {

	
	public Professeur(int num, String nom, String mail) {
		super(num,nom,mail);
	}

	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Professeur [num="+getNum()+", nom ="+getNom()+", mail=" +getMail()+ "]";
	}
	
	
	
}
