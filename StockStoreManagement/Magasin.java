package StockStoreManagement;

public class Magasin {
    protected double depenses;
	protected double revenus;
	protected Electro [] tab1 ;
	protected Primeurs [] tab2 ;
	public Magasin (int n1,int n2) {
		this.depenses=0;
		this.revenus=0;
		this.tab1=new Electro[n1];
		this.tab2=new Primeurs [n2];
			
	}
	public Magasin(Articles[] produits) {
      
    }
    public void ajouteElectro(Electro e,int pos,int n1 ) {
		if (pos < n1) {
            tab1[pos] = e;
            n1++;
        } else {
            System.out.println("position non trouvèe");
        }
    }
	
	public void venteELectro(Electro e ,int pos,int q,int n1) {
        if (pos < n1 && tab1[pos] == e) {
            double revenus = e.vendre(q);
            revenus += revenus;

        } else {
            System.out.println("position non trouvèe");
        }
    }
		
	
	public void ajouterPrimeur(Electro p,int pos,int n2){
        if (pos < n2) {
            tab1[pos] = p;
            n2++;
        } else {
            System.out.println("position non trouvèe");
        }

    }}
	
	

    

