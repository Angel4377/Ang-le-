import java.net.SocketOption;
import java.util.Scanner;

public class Exo3_tp1 {
    public static void main(String[] args) {
        Scanner cl =new Scanner(System.in);
        System.out.println("donner la valeur de a \t");
        int a= cl.nextInt();
        System.out.println("DONNER LA VALEUR DE b\t");
        int b=cl.nextInt();
        int A,S,M,D,mod,choix;
        do {
            System.out.println("---1-addition \t");
            System.out.println("---2-soustraction \t");
            System.out.println("---3-multiplication \t");
            System.out.println("---4-division \t");
            System.out.println("---5-modulo \t");
            System.out.println("---6-quitter \t");
            System.out.println("--faire votre choix \t");
            choix=cl.nextInt();

        }while (choix<1 || choix>6);
        switch (choix){
            case 1:
                A=a+b;
                System.out.println("addition de " +a+ "et" +b+ "est" +A);
                break;
            case 2:
                S=a-b;
                System.out.println("la soustraction de " +a+ "et" +b+ "est" +S);
                break;
            case 3:
                M=a*b;
                System.out.println(" la multiplication de " +a+ "et" +b+ "est" +M);
                break;
            case 4:
                D=a/b;
                System.out.println("la division de de " +a+ "et" +b+ "est" +D);
                break;
            case 5:
                mod=a%b;
                System.out.println("le modulo de " +a+ "et" +b+ "est" +mod);
                break;
            case 6:
                System.out.println("ciao ciao");
                break;

        }
    }
}
