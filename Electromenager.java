public class Electromenager extends Article implements VendableParPiece, SucceptibleDeEtreVenduEnSolde {
    private int stock;

    public Electromenager(String nom, double prixAchat, double prixVente, String fournisseur, int stock) {
        super(nom, prixAchat, prixVente, fournisseur);
        this.stock = stock;
    }

    public double vendre(int quantite) {
        if (quantite <= stock) {
            stock -= quantite;
            return quantite * super.prixVente;
        } else {
            System.out.println("Stock insuffisant.");
            return 0;
        }
    }

    public void lancerSolde(double pourcentage) {
        super.prixVente -= super.prixVente * (pourcentage / 100);
    }

    public void terminerSolde(double pourcentage) {
        super.prixVente += super.prixVente * (pourcentage / 100);
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Stock actuel: " + stock);
    }
}
