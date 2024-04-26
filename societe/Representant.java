package societe;

public class Representant extends Employe {

	private double chiffreAff;
	
	public Representant(String nom, int age, int date, double chiffreAff) {
		super(nom, age, date);
		this.chiffreAff=chiffreAff;
	}

	@Override
	public double calculerSalaire() {
		return (this.chiffreAff*0.2)+200;
	}

	@Override
	public String getNom() {
		return "Le representant "+ this.nom;
	}	
}
