package LOOPS;
import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            while(n!=0)
            {
               int d=n%10;
                System.out.print(d);
                n=n/10;
            }
        }
    }
}