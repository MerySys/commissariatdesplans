package GestionUniteScolaire;

public class Personne {

	private int num;
	private String nom,mail;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(int num, String nom, String mail) {
		super();
		this.num = num;
		this.nom = nom;
		this.mail = mail;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
