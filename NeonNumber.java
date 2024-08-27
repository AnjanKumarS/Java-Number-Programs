public class NeonNumber {
    public static void main(String[] args) {
        int n = 9;
        int sq = n * n;
        int res = neon(sq);
        if(sq==res)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }

    private static int neon(int sq) {
        int sum = 0;
        while (sq != 0)
        {
            sum = sum + (sq % 10);
            sq = sq / 10;
        }
        return sum;
    }
}
