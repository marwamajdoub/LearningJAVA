package societe;

public class Technicien extends Employe{
	
	private int nbreUnites;

	public Technicien(String nom, int age, int date, int nbreUnites) {
		super(nom, age, date);
		this.nbreUnites=nbreUnites;
	}
	
	@Override
	public double calculerSalaire() {
		return this.nbreUnites*1.5;
	}

	@Override
	public String getNom() {
		return "Le technicien "+ super.nom;
	}
	
	
	
	

}
