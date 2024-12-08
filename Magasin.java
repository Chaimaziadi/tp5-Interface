public class Magasin {
    private double depenses;
    private double revenus;
    private Electromenager[] electromenagers;
    private Primeur[] primeurs;

    public Magasin(Electromenager[] electromenagers, Primeur[] primeurs) {
        this.electromenagers = electromenagers;
        this.primeurs = primeurs;
        this.depenses = 0;
        this.revenus = 0;
    }

    public void ajouterDepenses(double montant) {
        depenses += montant;
    }

    public void ajouterRevenus(double montant) {
        revenus += montant;
    }

    public double calculerRendement() {
        return (revenus - depenses) / depenses;
    }

    public void afficherEtatMagasin() {
        System.out.println("Dépenses: " + depenses);
        System.out.println("Revenus: " + revenus);
        System.out.println("Rendement du magasin: " + calculerRendement());
    }
}
