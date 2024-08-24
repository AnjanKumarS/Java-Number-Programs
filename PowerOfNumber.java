public class PowerOfNumber {
    public static void main(String[] args) {
        int b = 10;
        int pow = 3;
        int res=1;
        for (int i = 0; i < pow;i++)
        {
            res = res * b;
        }
        System.out.println(res);
    }
}