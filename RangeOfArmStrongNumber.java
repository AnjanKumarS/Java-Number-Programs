public class RangeOfArmStrongNumber {
    public static void main(String[] args) {
        int n = 1;
        int l = 1000;

        for (int i = n; i <= l; i++)
        {
            int temp = i;
            int e = countn(i);
            int sum = 0;
            int num = i;
            while (num != 0) {
            int b = num % 10;
            sum = sum + pow(b, e);
            num = num / 10;
        }
        if(sum==temp)
        {
            System.out.println(sum);
        }
        }
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
