import java.util.Scanner;

public class ReturnValue {
    public static void main(String[] args) {
        sum();
        int ans =sum2();
        System.out.println(sum());
        System.out.println(ans);
    }
    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st number");
        int a = sc.nextInt();
        System.out.println("2nd number" );
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum=" + sum);
        return sum;
    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st number");
        int a = sc.nextInt();
        System.out.println("2nd number" );
        int b = sc.nextInt();
        int sum = a + b;
        return sum;

        // after return the sum2 has executed and nothing will be processed
        // the return value should be assigned a afunction wheteher it be an integer boolean or anyhting but it acannot be  void as if it is void then it wont print
        // as we can see here that when we sout out the sum= + sum the function says thatwe  cannot do so as it is a void output
        //so to osolve this we have to return the sum or a boolena to execute the function in psvm
        // we can use this method to execute a function multiple times so
        //The void return type doesn't require any return statement.

    }
}
