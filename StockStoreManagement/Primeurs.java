package StockStoreManagement;

public class Primeurs extends Articles implements Vendablekilo  {
    protected double stock;
	public Primeurs (String nom,String fourni,double prixa,double prixv) {
		super(prixa,prixv,nom,fourni);
		this.stock=0;
	}
	public void  remplir_stock(double nvq) {
		stock+=nvq;
	}
	public double vendre(double q) {
        if (q > stock || q < 0) {
            throw new Exception("out of stock");
        }
        else {
            return (q*this.prixv);
        }
		
	}
	
}
