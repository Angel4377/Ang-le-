import java.util.Scanner;

public class Exo6_tp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer un nombre entier\n");
        int n=sc.nextInt();
        int s;
        int nbrp=0;
        for(int i=1;i<n;i++){
            s=0;
            for(int j=1;j<=i/2;j++) {
                if (i % j == 0) {
                    s = s + j;
                }
            }
            if(s==i){
                if(nbrp<2){
                    System.out.println("le nombre " + i + "est parfait");
                }
                nbrp++;
            }
                 // System.out.println("les 2 premier nombres parfaits ssont " +nbrp);
        }
        int cpt=0;
        int nbpremier=0;
        s=0;
        for(int i=1;i<=n/2;i++){
            if(n % i!=0){
                cpt=cpt+1;
                s=s+i;

            }
        }
        if(cpt==1 || cpt==2){
            nbpremier++;
            System.out.println("le nombre " +n+ "est premier\t");
        }else {
            System.out.println("le nombre " +n+ "nest pas premier");
        }
        if(s==n){
            System.out.println("le nombre " +n+ "est parfait\t");

        }else {
            System.out.println("le nombre " +n+ "nest pas parfait\t");
        }

        
    }
}
