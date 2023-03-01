package LOOPS;
import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int rev=0;
            while(n!=0)
            {
               int d=n%10;
               rev=rev*10+d;
                n=n/10;
            }
            while(rev!=0)
            {
               System.out.println(rev%10);
                rev=rev/10;

            }
        }


    }
    
}