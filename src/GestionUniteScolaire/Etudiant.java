package GestionUniteScolaire;

public class Etudiant extends Personne {
	private String filiere;
	private int niveau;

	
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int num, String nom, String mail,String fil,int niv) {
		super(num, nom, mail);
		this.filiere=fil;
		this.niveau=niv;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Etudiant [numéro=" + getNum()+" nom="+getNom()+", email = "+getMail()+", filière= "+filiere + ", niveau=" + niveau + "]";
	}
	

}
