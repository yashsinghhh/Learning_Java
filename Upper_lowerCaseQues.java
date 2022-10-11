import java.util.Scanner;

public class Upper_lowerCaseQues {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().trim().charAt(0);
//        System.out.println(ch);


        // if (a==10 && b== 20) {
        //sout("hw");}
        // here && is to show that when both of the commands are rue then only print hw else dont print

         // if ( a == 10 || b ==20){
        //System.out.println("hw");
        // here || is a statement that say ss that either one of the two commands are true then  execute the statement

        //if ( a != 35);
        //System.out.println("hw");
//here != is not equal to so if a is not equal to 35 then it will print hello world

        // QUES-- to find whether the first char of a word is upper case or lower case
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if ( ch >='a' && ch<= 'z')
        {
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }
        System.out.println(ch);

        }



    }

