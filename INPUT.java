import java.util.Scanner;

public class INPUT {
    public static void main(String[] args) {
        System.out.println("input is");
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int a  = Sc.nextInt();
        System.out.println("enter number 2 ");
        int b = Sc.nextInt();
        int sum = a+b;
        System.out.println(" the sum is ");
        System.out.println(sum);
    }

    }
    //float bhi use krr sakte hai like if we use Sc.nextFloat then iske baad hum decimals bhi daal sakte hai but Float sum = a + b
//hoga then aise aur data types ke saath bhi krr sakte hai
// String str sc.next();
//sout(str)
// output mei aayega input something then voh first word print kardega so
// yash singh will be yash
//so to print full name then String str = ScnectLine();
