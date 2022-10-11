import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int count = 0;
        while ( b >=0 ) {
            int c = b%10;
            if (c == 10); {
                count++;
            }
            System.out.println(count);

        }
    }
}
