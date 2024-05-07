package ex2;

class Personne {
    private String nom;
    private int age;

    public Personne(String nom, String ageStr) throws AgeInvalideException, NomInvalideException {
       
        if (nom == null || nom.isEmpty()) {
            throw new NomInvalideException("Le nom ne peut pas être null ou vide");
        } else {
            this.nom = nom;
        }

    
        try {
            this.age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            System.out.println("La conversion de l'âge a échoué. L'âge sera par défaut 0.");
            this.age = 0;
        }

       
        if (this.age < 0 || this.age > 120) {
            throw new AgeInvalideException("L'âge doit être compris entre 0 et 120 ans");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}

