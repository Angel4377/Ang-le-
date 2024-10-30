import java.util.ArrayList;
import java.util.Scanner;

public class Exo1_tp2 {

    // Méthode pour saisir la taille du tableau
    public static int saisirTailleTableau() {
        Scanner scanner = new Scanner(System.in);
        int taille;
        while (true) {
            System.out.print("Entrez la taille du tableau : ");
            try {
                taille = scanner.nextInt();
                if (taille > 0) {
                    break;
                } else {
                    System.out.println("Veuillez entrer une taille positive.");
                }
            } catch (Exception e) {
                System.out.println("Veuillez entrer un entier valide.");
                scanner.next(); // pour éviter la boucle infinie
            }
        }
        return taille;
    }

    // Méthode pour saisir le tableau d'entiers
    public static int[] saisirTableau(int taille) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[taille];
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            while (true) {
                try {
                    tableau[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Veuillez entrer un entier valide.");
                    scanner.next();
                }
            }
        }
        return tableau;
    }

    // Méthode pour afficher le tableau
    public static void afficherTableau(int[] tableau) {
        System.out.print("Tableau : ");
        for (int i : tableau) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Méthode pour vérifier si un nombre est parfait
    public static boolean estParfait(int nombre) {
        if (nombre < 2) return false;
        int sommeDiviseurs = 0;
        for (int i = 1; i < nombre; i++) {
            if (nombre % i == 0) {
                sommeDiviseurs += i;
            }
        }
        return sommeDiviseurs == nombre;
    }

    // Méthode pour transférer les nombres pairs dans T1 et les nombres parfaits dans T2
    public static void transfererNombres(int[] tableau, ArrayList<Integer> T1, ArrayList<Integer> T2) {
        for (int nombre : tableau) {
            if (nombre % 2 == 0) {
                T1.add(nombre); // Ajouter les nombres pairs dans T1
            }
            if (estParfait(nombre)) {
                T2.add(nombre); // Ajouter les nombres parfaits dans T2
            }
        }
    }

    // Programme principal
    public static void main(String[] args) {
        int taille = saisirTailleTableau();
        int[] tableau = saisirTableau(taille);

        afficherTableau(tableau);

        ArrayList<Integer> T1 = new ArrayList<>(); // Pour les nombres pairs
        ArrayList<Integer> T2 = new ArrayList<>(); // Pour les nombres parfaits

        transfererNombres(tableau, T1, T2);

        System.out.println("Tableau des nombres pairs (T1) : " + T1);
        System.out.println("Tableau des nombres parfaits (T2) : " + T2);
    }
}
