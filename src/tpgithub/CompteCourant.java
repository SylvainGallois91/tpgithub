package tpgithub;

public class CompteCourant extends Compte{
	Client unClient;
	private int num;
	private double solde;
	private float decouvert = 0.0f;
	
	public CompteCourant(int num, double solde, float decouvert){
		this.num = num;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	
	public CompteCourant(){
		
	}
}
