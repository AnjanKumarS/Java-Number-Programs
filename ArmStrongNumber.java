public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int e = countn(n);
        int sum=0;
        
        while(n!=0)
        {
            int b = n % 10;
            sum = sum + pow(b, e);
            n = n / 10;
        }
        System.out.println(sum==temp?"ArmStrongNumber":" NOT ArmStrongNumber");
        
    }

    private static int pow(int b, int e) {
        int pow=1;
        for (int i = 0; i < e; i++)
        {
            pow = pow * b;
        }
        return pow;
    }
    
    private static int countn(int n) {
        int c = 0;
        while (n != 0)
        {
            n = n / 10;
            c++;
        }
        return c;
    }
}
