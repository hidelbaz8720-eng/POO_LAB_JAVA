
package lab;

public class Voiture {
    private String marque;
    private String modele;
    private double vitesse;
    private int annee;

    // Constructeur par défaut
    public Voiture() {
        marque = "Inconnue";
        modele = "v1";
        vitesse = 0.0;
        annee = 2024;

        System.out.println(
            "Une voiture a été créée avec les valeurs par défaut."
        );
    }

    // Constructeur paramétré
    public Voiture(String marque, String modele,
                   double vitesse, int annee) {
        this();

        setMarque(marque);
        setModele(modele);
        setVitesse(vitesse);
        setAnnee(annee);
    }

    // Constructeur de copie
    public Voiture(Voiture autreVoiture) {
        this(autreVoiture.marque, autreVoiture.modele,
             autreVoiture.vitesse, autreVoiture.annee);

        System.out.println("Constructeur de copie appelé.");
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getVitesse() {
        return vitesse;
    }

    public int getAnnee() {
        return annee;
    }

    // Setters avec validation
    public void setMarque(String marque) {
        if (marque != null && !marque.trim().isEmpty()) {
            this.marque = marque;
        } else {
            System.out.println(
                "Erreur : La marque ne peut pas être vide."
            );
        }
    }

    public void setModele(String modele) {
        if (modele != null && !modele.trim().isEmpty()) {
            this.modele = modele;
        } else {
            System.out.println(
                "Erreur : Le modèle ne peut pas être vide."
            );
        }
    }

    public void setVitesse(double vitesse) {
        if (vitesse >= 0) {
            this.vitesse = vitesse;
        } else {
            System.out.println(
                "Erreur : La vitesse ne peut pas être négative."
            );
        }
    }

    public void setAnnee(int annee) {
        int anneeCourante = java.time.Year.now().getValue();

        if (annee >= 1886 && annee <= anneeCourante) {
            this.annee = annee;
        } else {
            System.out.println(
                "Erreur : L'année doit être entre 1886 et "
                + anneeCourante + "."
            );
        }
    }

    // Méthodes métier
    public void accelerer(double augmentation) {
        if (augmentation > 0) {
            vitesse += augmentation;
            System.out.println(
                marque + " " + modele + " accélère de "
                + augmentation + " km/h. Nouvelle vitesse : "
                + vitesse + " km/h."
            );
        } else {
            System.out.println(
                "Erreur : L'augmentation doit être positive."
            );
        }
    }

    public void freiner(double reduction) {
        if (reduction > 0) {
            vitesse = Math.max(0, vitesse - reduction);

            if (vitesse == 0) {
                System.out.println(
                    marque + " " + modele
                    + " s'arrête complètement."
                );
            } else {
                System.out.println(
                    marque + " " + modele + " freine de "
                    + reduction + " km/h. Nouvelle vitesse : "
                    + vitesse + " km/h."
                );
            }
        } else {
            System.out.println(
                "Erreur : La réduction doit être positive."
            );
        }
    }

    public void afficherInformations() {
        System.out.println("=== Informations de la Voiture ===");
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Vitesse actuelle : " + vitesse + " km/h");
        System.out.println("Année : " + annee);
        System.out.println("=================================");
    }
}
