package societe;

public class Personnel {
	private final int  TAILLE_MAX=50;
	private Employe[] tabEmployes;
	private int nbEmployes;
	
	public Personnel() {
		tabEmployes=new Employe[TAILLE_MAX];
	}
	
	public void ajouterEmployé(Employe e) {
		if(nbEmployes<TAILLE_MAX)
			tabEmployes[nbEmployes++]=e;
		else
			System.out.println("Tableau plein");
	}
	
	public void afficherSalaires() {
		for (int i=0; i<nbEmployes;i++)
			System.out.println(tabEmployes[i]);
		
	
	}
	
	public double salaireMoyen() {
		double totalSalaires=0;
		for (int i=0; i<nbEmployes;i++)
			totalSalaires+=tabEmployes[i].calculerSalaire();
		
		return totalSalaires/nbEmployes;	
	}

}
