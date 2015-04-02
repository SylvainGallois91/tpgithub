package tpgithub;

import java.util.ArrayList;

public class Client {
	private ArrayList<Compte>lesComptes;
	private String nom;
	private String prenom;
	
	public Client(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Client(){
		
	}
	
	public int getSoldeGenerale(){
		return 0;
	}
	public boolean getClientCompteStatus(){
		return true;
	}
}
