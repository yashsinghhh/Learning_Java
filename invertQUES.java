import java.util.Scanner;

public class invertQUES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take a numbers 234 then to invert it to 432 we will take remainder
        // os if we take remainder when by 10 we will get 4 then if we multiply this
        //this remainder with 10 and then add the next remainder we will start getting the inverted number


                int num = sc.nextInt();
        int ans = 0 ;
         while (num > 0 ) {
             int rem = num % 10;
num /=10;
             ans = ans * 10 + rem;}
        System.out.println(ans);

         }



    }

