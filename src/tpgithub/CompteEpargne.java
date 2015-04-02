package tpgithub;

public class CompteEpargne extends Compte{
	Client unClient;
	private int num;
	private int solde;
	private float taux = 0.0f;
	
	public CompteEpargne(int num, int solde, float taux){
		this.num = num;
		this.solde = solde;
		this.taux = taux;
	}
	
	
	public CompteEpargne(){
		
	}
}
