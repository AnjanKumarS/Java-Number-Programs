import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        countnum(n);
    }

    private static void countnum(int n) {
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println(c);
    }
}
