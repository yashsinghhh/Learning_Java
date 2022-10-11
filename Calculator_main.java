import java.util.Scanner;

public class Calculator_main {
    public static void main(String[] args) {
        System.out.println("operation");
        Scanner sc = new Scanner(System.in);
        char op = sc.next().trim().charAt(0);
        int ans = 0;


        while (true) {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                {
                    System.out.println("enter two numbers");
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    if (op == '+') {
                        ans = a + b;
                    }
                    if (op == '-') {
                        ans = a - b;
                    }
                    if (op == '*') {
                        ans = a * b;
                    }
                    if (op == '/') {
                        ans = a / b;
                    }
                    if (op == '%') {
                        ans = a % b;
                    }}
                } else if (op=='x'||op=='X') {
                break;

            }else{
                System.out.println("invalid");
        }
            System.out.println(ans);


            }
        }
    }
