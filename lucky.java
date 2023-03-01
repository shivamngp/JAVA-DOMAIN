package LOOPS;

import java.util.Scanner;

public class lucky{
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int sum=0;
            String k=Integer.toString(n);
            for(int i=1;i<k.length();i+=2)
            {
                char ch=k.charAt(i);
                int d=(int)ch;
                sum=sum+d*d;
            }
            if(sum%9==0) System.out.println("Lucky Number");
            else System.out.println("Not a Lucky Number");
        }

    }
}