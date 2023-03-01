package LOOPS;

public class table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("The table of "+ i +"is");
            for(int k=1;k<=10;k++)
            {
                int l=i*k;
                System.out.println(i+" * "+ k +" = "+l);
            }
            System.out.println();
        }
        }
    
    }
}
