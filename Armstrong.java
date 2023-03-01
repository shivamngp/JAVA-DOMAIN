package LOOPS;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            double d=Math.log10(n);
            int k=(int)Math.ceil(d);
            int arm=0;
            int l=n;
            while(l!=0)
            {
                int p=l%10;
                arm=arm + (int)Math.pow(p,k);
                l=l/10;
            }
            if(n==arm)
            {
                System.out.println("Armstrong Number");
            }
            else System.out.println("Not a Armstrong Number" + l);
        }

    }
}