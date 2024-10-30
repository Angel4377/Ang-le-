import java.util.ArrayList;
import java.util.Scanner;

public class Exo3_tp2 {

    public static String[] saisirTableauChaines(int taille) {
        Scanner scanner = new Scanner(System.in);
        String[] tableau = new String[taille];
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez la chaîne " + (i + 1) + " : ");
            tableau[i] = scanner.next();
        }
        return tableau;
    }

    public static void afficherTableauChaines(String[] tableau) {
        System.out.print("Tableau des chaînes : ");
        for (String chaine : tableau) {
            System.out.print(chaine + " ");
        }
        System.out.println();
    }

    public static String[] transfererChaines(String[] tableau) {
        ArrayList<String> result = new ArrayList<>();
        for (String chaine : tableau) {
            if (chaine.startsWith("P") && chaine.endsWith("R")) {
                result.add(chaine);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau de chaînes : ");
        int taille = scanner.nextInt();

        String[] tableau = saisirTableauChaines(taille);
        afficherTableauChaines(tableau);

        String[] T1 = transfererChaines(tableau);
        System.out.print("Tableau des chaînes commençant par P et finissant par R (T1) : ");
        afficherTableauChaines(T1);
    }
}

