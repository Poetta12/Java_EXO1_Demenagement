/**
 * Premier projet JAVA... reste focus dans l'apprentissage!
 * code simples et commenté à chaque fois.
 * cela prends que quelques secondes pour gagner du temps plus tard.
 */

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées au clavier

public class Moving { // Déclaration de la classe publique nommée Moving

    public static void main(String[] args) {  // Méthode principale main, point d'entrée du programme Java
        int totalOfBoxes = boxesInput(); // Appeler la méthode boxesInput() pour obtenir le nombre de cartons
        int vanCap = 9;  // Capacité du camion en nombre de cartons

        // Calculer combien de voyages sont nécessaires
        // On divise le nombre total de cartons par la capacité du camion
        // Math.ceil arrondit toujours le résultat vers le haut pour tenir compte des cartons restants
        int nbOfTrips = (totalOfBoxes + vanCap)  / vanCap;
        System.out.println("On a besoin de " + nbOfTrips + " voyage(s)"); // Afficher le nombre de voyages nécessaires

        int leftBoxes = totalOfBoxes;  // Nombre de cartons restants à transporter

        // Faire un voyage pour chaque valeur de 1 jusqu'au nombre total de voyages
        for (int i = 1; i <= nbOfTrips; i++) {

            // On prend le nombre minimum entre les cartons restants et la capacité du camion
            int travelBoxes = Math.min(leftBoxes, vanCap);
            System.out.println("Un voyage de " + travelBoxes + " cartons"); // Afficher combien de cartons sont transportés dans ce voyage

            // Mettre à jour le nombre de cartons restants
            leftBoxes -= travelBoxes;
        }
    }

    // Méthode pour lire le nombre de cartons depuis l'entrée utilisateur
    public static int boxesInput() {
        Scanner userInput = new Scanner(System.in); // Créer un objet Scanner pour lire les entrées utilisateur
        System.out.print("Veuillez saisir le nombre de cartons : "); // Demander à l'utilisateur de saisir le nombre de cartons
        int nbBoxes = userInput.nextInt(); // Lire l'entier saisi par l'utilisateur
        userInput.close(); // Fermer le Scanner
        return nbBoxes; // Retourner le nombre de cartons
    }
}
