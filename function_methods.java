import java.util.Scanner;

public class function_methods {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("1st number");
//        int a = sc.nextInt();
//        System.out.println("2nd number" );
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println("sum=" + sum);

        //NOW IF SOMEONE ASK YOU TO DO THIS 100 TIMES OR IF THEY ASK TO CHANGE "SUM=" TO SOMETHING
        //ELSE THEN HOW WILL WE APPLY THE SAME CHANGE TO EACH ONE OF THE FUNCTIONS

        /*

        access modifier (we'lllook in oops) return typr name() {
        body
        return statement
        }
         */
        public static void main(String[] args) {
            function_methods();
            function_methods();
            function_methods(); // now u can repeat by calling the function

        }
        static void function_methods() {
            Scanner sc = new Scanner(System.in);
        System.out.println("1st number");
        int a = sc.nextInt();
        System.out.println("2nd number" );
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum=" + sum);

        }

        // here we can see that by assigning the sum function we can easiy copy paste the short funcyion and repeat it
    //but if we wantg to return the value of the function instead oif executing it completely we can use the retuen function in which it will only the retiurn the sum of the function instead of carrying out the whole function




}
