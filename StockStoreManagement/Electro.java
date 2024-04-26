package StockStoreManagement;

public class Electro  extends Articles implements VendablePiece {
    protected int nbrp;
	protected int stock=0;
	public Electro(int nbrp,String nom,String fourni,double prixa,double prixv) {
		super(prixa,prixv,nom,fourni);
		this.nbrp=nbrp;
		
	}
	public void  remplir_stock(int q) {
		stock+=q;
	}
	public String toString() {
		return(super.toString()+this.nbrp);
	}
	
	public double vendre(int q) {
		return (q*this.prixv);
	}
    
}
