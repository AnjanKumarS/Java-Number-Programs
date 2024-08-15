import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = sc.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Num1 : " + n1);
        System.out.println("Num2 : "+n2);
    }
}
