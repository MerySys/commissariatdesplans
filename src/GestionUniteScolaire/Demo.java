package GestionUniteScolaire;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args){

		Personne p=new Personne(1,"RAFI","meriem@gmail.com");
		Etudiant e1=new Etudiant(p.getNum(), p.getNom(),p.getMail(),"GINFO", 1);
	    Etudiant e2=new Etudiant(2,"RADI", "radi@gmail.com", "GINDUST", 2);
		Personne p1=e2;
		Professeur prof1=new Professeur(1, "SAKHI", "SAKHI@gmail.com");
		System.out.println(p1.toString());
	    System.out.println("*****************************************");
	    System.out.println(e1.toString());
	    Cours c1=new Cours(1, 1, 24, "JAVA", "GINFO");
	    Cours c2=new Cours(2,2, 25, "C++", "GINFO");
	    ListCourses courses=new ListCourses();
	    System.out.println("/***********************Index element*********************/");
	    System.out.println(courses.getCourses().indexOf(c1));
	    System.out.println(courses.getCourses().indexOf(c2));
	    //System.out.println(list_courses.ajouter(c2));
	    System.out.println(courses.getCourses());
	    try {
	           courses.supprimer_cours(9);
		} catch (Exception e) {
			System.out.println("-------------Exception : "+e.getMessage());
		}
	    try {
	    	courses.obtenir_cours(9);
		} catch (Exception e) {
			System.out.println("-------------Exception :"+e.getMessage());
		}
	    
	    System.out.println(courses.getCourses());
	    
	    /***************************************TEST 01/04/021********************************************************/

	    ListCourses OList_Cours;
	    OList_Cours=new ListCourses();
	    ListCourses OList_Professeur=new ListCourses(prof1);
	
	    ListCourses OList_Etudiant=new ListCourses(e1);
	    
	    OList_Cours.ajouter_cours(c1);
	    OList_Cours.ajouter_cours(c2);
	    
	    
	}

}
