package GestionUniteScolaire;

import java.util.ArrayList;
import java.util.List;

public class ListCourses {
	

	private List<Cours> courses=new ArrayList<Cours>();
	private Professeur prof;
	private Etudiant etudiant;
	
	
	
	public ListCourses(Professeur prof) {
		super();
		this.prof = prof;
	}
	


	public ListCourses(Etudiant etudiant) {
		super();
		this.etudiant = etudiant;
	}



	public List<Cours> getCourses() {
		return courses;
	}

	

	public void setCourses(List<Cours> courses) {
		this.courses = courses;
	}


	public Professeur getProf() {
		return prof;
	}


	public void setProf(Professeur prof) {
		this.prof = prof;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	public ListCourses() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public boolean ajouter_cours(Cours argCours) {
	     if(!(courses.contains(argCours)))
		{courses.add(argCours);
		return true;}
		else return false;
		
	        	  		    
	}
	public void supprimer_cours(int argNumCours) {
			
				courses.remove(argNumCours);
				System.out.println("course removed succesfully");
		
	}
	public Cours obtenir_cours(int argNumCours) {
				return courses.get(argNumCours);
			
	}
	public void ajout_etudiant(Etudiant e1) {
		setEtudiant(e1);
	}



	public ListCourses(List<Cours> courses, Etudiant etudiant) {
		super();
		this.courses = courses;
		this.etudiant = etudiant;
	}
	}
