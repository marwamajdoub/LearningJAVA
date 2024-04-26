package societe;

public class Vendeur extends Employe {
	
	private double chiffreAff;
	
	public Vendeur(String nom, int age, int date, double chiffreAff) {
		super(nom, age, date);
		this.chiffreAff=chiffreAff;
	}

	@Override
	public double calculerSalaire() {
		return (this.chiffreAff*0.2)+100;
	}

	@Override
	public String getNom() {
		return "Le vendeur "+ this.nom;
	}	

}
