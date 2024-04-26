package societe;

public class Salaires {
	public static void main(String[] args) {
		Personnel p = new Personnel();
		p.ajouterEmployé(new Vendeur("Ahmed", 45, 1995, 3000));
		p.ajouterEmployé(new Representant("Ali", 25, 2001, 2000));
		p.ajouterEmployé(new Technicien("Mohamed", 28, 1998, 1000));
		p.ajouterEmployé(new Manutentionnaire("Samir", 32, 1998, 45));
		p.ajouterEmployé(new TechnARisque("Adel", 28, 2000, 1000));
		p.ajouterEmployé(new ManutARisque("Ridha", 30, 2001, 45));
		p.afficherSalaires();
		System.out.println("Le salaire moyen dans l'entreprise est de " +
		p.salaireMoyen() + "Dinars.");
	}
}
	
