public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        if(n==strongNumber(n))
            System.out.println(n+" : STRONG Number");
        else
            System.out.println(n+" : NOT a STRONG Number");
        
    }

    private static int strongNumber(int n) {
        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            sum = sum + f;
            n = n / 10;
        }
        return sum;
    }
}