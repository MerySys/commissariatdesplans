package GestionUniteScolaire;

public class Cours {
private int num_cours,niv_cours,nbre_heures;
private String intitule_cours,filiere;
public Cours(int num_cours, int niv_cours, int nbre_heures, String intitule_cours, String filiere) {
	super();
	this.num_cours = num_cours;
	this.niv_cours = niv_cours;
	this.nbre_heures = nbre_heures;
	this.intitule_cours = intitule_cours;
	this.filiere = filiere;
}


public Cours() {
	super();
	// TODO Auto-generated constructor stub
}
public int getNum_cours() {
	return num_cours;
}
public void setNum_cours(int num_cours) {
	this.num_cours = num_cours;
}
public int getNiv_cours() {
	return niv_cours;
}
public void setNiv_cours(int niv_cours) {
	this.niv_cours = niv_cours;
}
public int getNbre_heures() {
	return nbre_heures;
}
public void setNbre_heures(int nbre_heures) {
	this.nbre_heures = nbre_heures;
}
public String getIntitule_cours() {
	return intitule_cours;
}
public void setIntitule_cours(String intitule_cours) {
	this.intitule_cours = intitule_cours;
}
public String getFiliere() {
	return filiere;
}
public void setFiliere(String filiere) {
	this.filiere = filiere;
}


}
