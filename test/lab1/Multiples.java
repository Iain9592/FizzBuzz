package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(100, 4, 5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int i = 0;
        int count = 0;
        while (i<n) {
            if (i%a==0 || i%b==0) {
                count++;
            }
            i++;
        }
        return count-1;
    }
}
