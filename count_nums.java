import java.util.Scanner;

public class count_nums {
    public static void main(String[] args) {
        // tell the total number of 3s in a given number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            if (rem == 3) {
                count++;
            }
            a = a/10;

        }
        System.out.println(count);
    }}