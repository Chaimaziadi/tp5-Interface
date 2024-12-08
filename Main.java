public class Main {
    public static void main(String[] args) {

        Electromenager frigo = new Electromenager("Frigo", 200, 400, "Samsung", 10);
        Electromenager laveLinge = new Electromenager("Lave-linge", 300, 600, "LG", 5);

        // Création de produits primeurs
        Primeur pomme = new Primeur("Pomme", 1.5, 3, "Fruits Bio", 100);
        Primeur banane = new Primeur("Banane", 2, 4, "Fruits Bio", 80);


        Electromenager[] electromenagers = {frigo, laveLinge};
        Primeur[] primeurs = {pomme, banane};
        Magasin magasin = new Magasin(electromenagers, primeurs);


        magasin.ajouterDepenses(2000); // Hypothèse d'achats
        magasin.ajouterRevenus(frigo.vendre(3)); // Vendre 3 frigos
        magasin.ajouterRevenus(pomme.vendre(50)); // Vendre 50 kg de pommes


        magasin.afficherEtatMagasin();
    }
}
