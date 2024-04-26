package StockStoreManagement;

public class Articles {
    
        protected double  prixa;
        protected double prixv;
        protected String nom;
        protected String fourni;
        public Articles (double prixa,double prixv, String nom,String fourni) {
            this.prixa=prixa;
            this.prixv=prixv;
            this.nom=nom;
            this.fourni=fourni;
            
        }
        public double calculateur() {
            return((this.prixv-this.prixa)/this.prixa);
        }
        public String toString () {
            return ("le prix d achat est "+this.prixa+"le prix du vente est "+this.prixv+"le nom est "+this.nom+"le nom du fourni"+this.fourni);
        }
        
 }
 
  
