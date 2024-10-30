
    import java.util.HashSet;
import java.util.Scanner;

    public class Exo2_tp2 {

        public static int saisirTailleTableau() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez la taille du tableau : ");
            return scanner.nextInt();
        }

        public static boolean contientDoublon(int[] tableau, int taille) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < taille; i++) {
                if (!set.add(tableau[i])) {
                    return true;
                }
            }
            return false;
        }

        public static int[] saisirTableau(int taille) {
            Scanner scanner = new Scanner(System.in);
            int[] tableau = new int[taille];
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < taille; i++) {
                int nombre;
                do {
                    System.out.print("Entrez un nombre unique : ");
                    nombre = scanner.nextInt();
                } while (!set.add(nombre));
                tableau[i] = nombre;
            }
            return tableau;
        }

        public static void afficherTableau(int[] tableau) {
            System.out.print("Tableau : ");
            for (int valeur : tableau) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }

        public static boolean estCarreParfait(int nombre) {
            int racine = (int) Math.sqrt(nombre);
            return racine * racine == nombre;
        }

        public static boolean estPremier(int nombre) {
            if (nombre < 2) return false;
            for (int i = 2; i <= Math.sqrt(nombre); i++) {
                if (nombre % i == 0) return false;
            }
            return true;
        }

        public static void transfererNombres(int[] tableau, int[] T1, int[] T2) {
            int indexT1 = 0, indexT2 = 0;
            for (int nombre : tableau) {
                if (estPremier(nombre)) {
                    T1[indexT1++] = nombre;
                }
                if (estCarreParfait(nombre)) {
                    T2[indexT2++] = nombre;
                }
            }
        }

        public static void main(String[] args) {
            int taille = saisirTailleTableau();
            int[] tableau = saisirTableau(taille);

            afficherTableau(tableau);

            int[] T1 = new int[taille];
            int[] T2 = new int[taille];

            transfererNombres(tableau, T1, T2);

            System.out.print("Tableau des nombres premiers (T1) : ");
            afficherTableau(T1);

            System.out.print("Tableau des carrés parfaits (T2) : ");
            afficherTableau(T2);
        }
    }


