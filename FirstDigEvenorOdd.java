public class FirstDigEvenorOdd {
    public static void main(String[] args) {
        int n = 8234;
        while(n>9)
        {
            n = n / 10;
        }
        System.out.println(n%2==0?"Even":"Odd");
    }
}
