public class Article {
    private double prixAchat;
    private double prixVente;
    private String nom;
    private String fournisseur;

    public Article(String nom, double prixAchat, double prixVente, String fournisseur) {
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.fournisseur = fournisseur;
    }

    public double calculerRendement() {
        return (prixVente - prixAchat) / prixAchat;
    }

    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Fournisseur: " + fournisseur);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix de vente: " + prixVente);
        System.out.println("Rendement: " + calculerRendement());
    }
}
