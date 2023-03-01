package LOOPS;

import java.util.Scanner;

public class Narmstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            for(int i=10;i<num;i++)
            {
            double d=Math.log10(i);
            int k=(int)Math.ceil(d);
            int arm=0;
            int l=i;
            while(l!=0)
            {
                int p=l%10;
                arm=arm + (int)Math.pow(p,k);
                l=l/10;
            }
            if(arm==i) System.out.println(arm);
        }

    }
    }
}