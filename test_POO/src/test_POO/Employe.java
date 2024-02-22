package test_POO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employe {

	private String nom;
	private float salaire;
	private String date_embauche;
	private String role;
	
	
	
	public Employe(String nom, float salaire, String date_embauche, String role) {
		this.nom = nom;
		this.date_embauche = date_embauche;
		this.salaire = salaire;
		this.role = role;
	}
	
		
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}



	public float getSalaire() {
		return salaire;
	}


	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getDate_embauche() {
		return date_embauche;
	}


	public void setDate_embauche(String date_embauche) {
		this.date_embauche = date_embauche;
	}


	
	public float Calcul_Salaire(int nb_heur, String role, float bonus) {
		
		if (role == "chef de projet") {
			if (nb_heur <= 8) {
				salaire = (nb_heur * 100)+ bonus;
			}
			else if (nb_heur >8) {
				salaire = (nb_heur *120)+bonus;
			}
		}
		
		else if (role == "ingenieur") {
			if (nb_heur <= 8) {
				salaire = (nb_heur * 75) + bonus;
			}
			else if (nb_heur >8) {
				salaire = (nb_heur * 90 )+ bonus ;
			}
		}
		
		else if (role == "developpeur") {
			if (nb_heur <= 8) {
				salaire = (nb_heur * 50) + bonus;
			}
			else if (nb_heur >8) {
				salaire = (nb_heur * 65 )+ bonus ;
			}
		
		}
		return salaire;
	}
	
	
	public static void main(String[] args) {
		
	}

}
