public class SPYNumber {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int sum = 0;
        int pro = 1;
        
        while(n!=0)
        {
            sum = sum + n % 10;
            pro = pro * n % 10;
            n = n / 10;
        }
        System.out.println(sum==pro?temp+" : SPY Number":temp+" : NOT a SPY Number");
    }
}
