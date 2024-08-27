public class FindKfromLast {
    public static void main(String[] args) {
        int n = 456535;
        int k = 3;
        while(k>1)
        {
            n = n / 10;
            k--;
        }
        int res=n%10;
        if(res!=0 && k>0)
            System.out.println(res);
        else
            System.out.println("Invalid");
    }
}
