import java.sql.SQLOutput;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        //there are total 50 shelves in a library program a calculator that tell the total amount of books required to be fitted in each shelve to fit all the books
        System.out.println("LIBRARY MANAGER");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of new books");
        int a = sc.nextInt();
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

