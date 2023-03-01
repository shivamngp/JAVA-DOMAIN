package LOOPS;

public class sumdivisible {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int sum=0;
            int l=n;
            while(n!=0)
            {
               int d=n%10;
                sum=sum+d;
                n=n/10;
            }
            if(l%sum==0) System.out.println("YES the number is divisble by its digit sum");
            else System.out.println("No the number is not divisble by its digit sum");
        }

    }
}
