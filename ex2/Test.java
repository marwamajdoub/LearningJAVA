package ex2;

public class Test {
    public static void main(String[] args) {
        try {
            
            Personne personne1 = new Personne("Maroua", "22");
            System.out.println("Nom: " + personne1.getNom());
            System.out.println("Âge: " + personne1.getAge());

            Personne personne2 = new Personne("Miro", "151");
            System.out.println("Nom: " + personne2.getNom());
            System.out.println("Âge: " + personne2.getAge());

            Personne personne3 = new Personne("", "30");
            System.out.println("Nom: " + personne3.getNom());
            System.out.println("Âge: " + personne3.getAge());

        } catch (AgeInvalideException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (NomInvalideException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}


