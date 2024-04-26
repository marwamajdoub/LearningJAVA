package StockStoreManagement;

public class Main {
    public static void main(String[] args) {
      
        Articles[] produits = new Articles[2];
        produits[0] = new Electro(50, "Lave-linge", "Samsung",100,544);
        produits[1] = new Primeurs("pomme" ,"MIXmAX",500,5666);
        Magasin magasin = new Magasin(produits);
        ((Electro) produits[0]).remplir_stock(10);
        ((Primeurs) produits[1]).remplir_stock(50);

 
        try {
            double revenus = ((Electro) produits[0]).vendre(5);
            magasin.revenus += revenus;
            System.out.println("Revenus: " + revenus);
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }

        
        
    }
    
}
