package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce(100);
        System.out.println(count);
    }

    public static int reduce(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else if (num % 2 == 1) {
                num--;
                count++;
            }

        } return count;
    }
}