package societe;

public class ManutARisque extends Manutentionnaire {
	
	private static double prime=50;

	public ManutARisque(String nom, int age, int date, int nbreUnites) {
		super(nom, age, date, nbreUnites);
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+prime;
	}

}
