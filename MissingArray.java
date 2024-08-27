public class MissingArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3,5, 6, 9 };
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            while (a[i] != k) {
                System.out.println(k);
                k++;
            }
            k++;
        }
        if (k <= a[a.length - 1]) {
            System.out.println(k);
        }
    }
}
