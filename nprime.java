package LOOPS;

import java.util.Scanner;

public class NPrime {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=2;i<=n;i++)
            { int c=0;
                for(int k=2;k*k<=i;k++){
                    if(i%k==0)
                    { c++;
                        break;
                    }
                }
                if(c==0) System.out.println(i);
            }
        }
        
    }
    
}