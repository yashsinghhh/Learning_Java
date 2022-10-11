import java.util.Scanner;

public class QUES_LOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //tell the largest amongst the 3
        int max = a ;
        if (b>max) {
            max = b;}
        if ( c > max ) {
            max = c; }
        //System.out.println( max);

//MATH.MAX METHOD FOR FINDING MAXIMUM VALUE
        int maxx = Math.max(c,Math.max(a,b)) ;
        System.out.println(maxx);



        }

    }

