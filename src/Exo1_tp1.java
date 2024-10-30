import java.util.Scanner;

public class Exo1_tp1 {
    public static void main(String[]arg){
        final double TVA=0.18;
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le prix unitaire \n");
        int pu = sc.nextInt();
        System.out.println("donner la quantitee \n");
        int qt = sc.nextInt();
        double montantHT=pu*qt;
        double montantTCT=1+(montantHT*TVA);
        System.out.println("le montant HT est \t" +montantHT);
        System.out.println("le montant TCT est \t" +montantTCT);
    }
}
