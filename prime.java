package LOOPS;

import java.util.Scanner;
 class Prime {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                c=2;
                break;
            }
        }
        if(c==0)
        System.out.println("Prime Number");
        else System.out.println("not a prime");
    }
    }
    
}