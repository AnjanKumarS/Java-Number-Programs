public class PerfectSquare {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = false;
        for(int i=1;i<n;i++)
        {
            if (i * i == n) 
            {
                flag = true;
                break;
            }
        }
        System.out.println(flag?"Perfect Square":"Not a Perfect Square");
    }
}
