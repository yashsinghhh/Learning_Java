import java.util.Scanner;

public class fibonacciQues {
    public static void main(String[] args) {
        // find the 7th number in the fibonacci series
        // we will use the table method where a and b will keep changing value as we go ahead in
        // the fibo series so a will be 0  and b will be 1 then 1 2 then 2 3 then 3 5

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        int count = 2;

        while ( count <= n ) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;


    }
        System.out.println(b);
}}
