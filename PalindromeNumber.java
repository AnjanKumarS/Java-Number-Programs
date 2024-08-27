public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1234321;
        int rev = palindrome(n);
        System.out.println(n==rev?"Palindrome Number":"Not a Palindrome Number");
    }

    private static int palindrome(int n) {
        int rev = 0;
        while (n != 0)
        {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }
}