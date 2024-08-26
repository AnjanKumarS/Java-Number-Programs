public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        if(factors(n)==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    private static int factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
        {
            if(n%i==0)
                c++;
        }
        
        return c;
    }
}
