
package lab;

public class Test {
    public static void main(String[] args) {

        Voiture v1 = new Voiture(
            "Toyota", "Corolla", 50.0, 2023
        );

        v1.afficherInformations();

        v1.accelerer(30);
        v1.freiner(20);

        v1.afficherInformations();
    }
}
