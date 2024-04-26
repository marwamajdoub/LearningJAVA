package societe;

public class TechnARisque extends Technicien {
	
	private static double prime=50;

	public TechnARisque(String nom, int age, int date, int nbreUnites) {
		super(nom, age, date, nbreUnites);
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+prime;
	}

}
