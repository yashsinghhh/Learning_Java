import java.util.Scanner;

public class practice2shelveLimit {
    public static void main(String[] args) {
        System.out.println("LIBRARY MANAGER");
        System.out.println("Enter total number of new books");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ( a > 5000){
            System.out.println("all 50 shelves are filled with 50 books each " );
            int rem = (a%5000);
            System.out.println("remaining " + rem + " books will need ");
            int rem1 = rem/50;
            int remm = (rem1+1);
            System.out.println(remm + " more shelves");
        } else {
            int div = a / 50;
            System.out.print(div);
            System.out.println(" books should be kept in 49 shelves");
            int rem = a % 50;
            System.out.print(rem);
            System.out.println(" will be kept in the last shelve");
            System.out.print("completing a total of ");
            System.out.print(a);
            System.out.println(" in 50 shelves");

        }

    }

}
