package test_POO;

import java.util.ArrayList;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Gestionnaire_Employe extends Employe{
	
	protected List<Employe> Employee;
	
	public Gestionnaire_Employe(String nom, float salaire, String date_embauche, String role) {
		super(nom, salaire, date_embauche, role);
	
		this.Employee = new ArrayList<>();
	
	}
	public void ajouter_employee(Employe person) {
		Employee.add(person);
	}
	
	
	public void supprimer_employee(Employe person) {
		Employee.remove(person);
	}
	
	

	public void afficher_employee() {
		
		for (int i = 0; i < Employee.size(); i++) {
		      System.out.println(Employee.get(i));
		    }
		
	}
	
	
	

	public static void main(String[] args) {
		
		Employe employe1 = new Employe("Amin", 0, "2022/12/1", "chef de projet");
		Employe employe2 = new Employe("Lina", 0, "2021/01/08", "ingenieur");
		Employe employe3 = new Employe("Omar", 0, "2019/09/11", "developpeur");
		
		Gestionnaire_Employe gestion = new Gestionnaire_Employe("Amin", 0, "2022/12/1", "chef de projet");
		gestion.ajouter_employee(employe1);
		gestion.ajouter_employee(employe2);
		gestion.ajouter_employee(employe3);
		
		gestion.afficher_employee();
		
	}

}
