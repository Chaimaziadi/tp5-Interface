public class Primeur extends Article implements VendableParKilogramme {
    private double stock;

    public Primeur(String nom, double prixAchat, double prixVente, String fournisseur, double stock) {
        super(nom, prixAchat, prixVente, fournisseur);
        this.stock = stock;
    }

    public double vendre(double quantite) {
        if (quantite <= stock) {
            stock -= quantite;
            return quantite * super.prixVente;
        } else {
            System.out.println("Stock insuffisant.");
            return 0;
        }
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Stock actuel: " + stock + " kg");
    }
}
