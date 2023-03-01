package LOOPS;

import java.util.Scanner;

public class SeedNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=a;
            int mul=1;
            while(a!=0)
            {
                int d=a%10;
                mul=mul*d;
                a=a/10;
            }
            mul=k*mul;
            if(mul==b)
            {
                System.out.println(k+" is a seed of "+b);
            }
            else System.out.println(k+" is not a seed of "+b);
        }
    }
    
}