
package lab;

public class TestVoiture {
    public static void main(String[] args) {

        System.out.println("=== TESTS DES VALIDATIONS ===");

        Voiture voiture = new Voiture(
            "Renault", "Clio", 0.0, 2022
        );

        System.out.println("\nTest 1 : Vitesse négative");
        voiture.setVitesse(-10);
        System.out.println("Vitesse : " + voiture.getVitesse());

        System.out.println("\nTest 2 : Vitesse nulle");
        voiture.setVitesse(0);
        System.out.println("Vitesse : " + voiture.getVitesse());

        System.out.println("\nTest 3 : Année trop ancienne");
        voiture.setAnnee(1800);
        System.out.println("Année : " + voiture.getAnnee());

        System.out.println("\nTest 4 : Année future");
        voiture.setAnnee(2050);
        System.out.println("Année : " + voiture.getAnnee());

        System.out.println("\nTest 5 : Marque vide");
        voiture.setMarque("");
        System.out.println("Marque : " + voiture.getMarque());

        System.out.println("\nTest 6 : Marque null");
        voiture.setMarque(null);
        System.out.println("Marque : " + voiture.getMarque());

        System.out.println("\nTest 7 : Accélération négative");
        voiture.accelerer(-50);
        System.out.println("Vitesse : " + voiture.getVitesse());

        System.out.println("\nTest 8 : Freinage excessif");
        voiture.setVitesse(20);
        voiture.freiner(50);
        System.out.println("Vitesse : " + voiture.getVitesse());

        System.out.println("\n=== INFORMATIONS FINALES ===");
        voiture.afficherInformations();
    }
}
