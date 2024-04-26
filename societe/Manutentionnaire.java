package societe;

public class Manutentionnaire extends Employe {
	
	private int nbreHeures;
	
	public Manutentionnaire(String nom, int age, int date, int nbreHeures) {
		super(nom, age, date);
		this.nbreHeures=nbreHeures;
	}

	@Override
	public double calculerSalaire() {
		return this.nbreHeures*5;
	}

	@Override
	public String getNom() {
		
		return "Le manutentionnaire "+ this.nom;
	}
	
}
