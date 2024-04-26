package societe;

public abstract class Employe {
	
	String nom;
	private int age, date;
	public Employe(String nom, int age, int date) {
		this.nom = nom;
		this.age = age;
		this.date = date;
	}
	
	public abstract double calculerSalaire();
	
	public String getNom() {
		return "L'employé" + this.nom;
	}

	@Override
	public String toString() {
		return this.getNom()+ " gagne " + this.calculerSalaire() + " Dinars";
	}

}
