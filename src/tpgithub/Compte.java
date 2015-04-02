package tpgithub;

public class Compte {
	Client unClient;
	private int numero;
	private double solde;
	
	public Compte(Client unClient, int num, float solde){
		this.numero = num;
		this.solde = solde;
	}
	
	public Compte(){
		
	}
	
	public void crediter(int num){
		
	}
	
	public void debiter(int num){
		
	
	}
	
	public double retourneSoldeCompte(int num){
		return 0;
	}
	
	public boolean transfert(int num, int num2){
		return false;
	}
	
	public boolean compareCompte (int num, int num2){
		return false;
	}
	
	
}
