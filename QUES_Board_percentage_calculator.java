import java.util.Scanner;

public class QUES_Board_percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("marks obtained in maths");
        float a = sc.nextFloat();
        System.out.println("marks obtained in science");
        float b = sc.nextFloat();
        System.out.println("marks obtained in english");
        float c = sc.nextFloat();
        System.out.println("marks obtained in hindi");
        float d = sc.nextFloat();
        System.out.println("marks obtained in sst");
        float e =sc.nextFloat();
        System.out.println("your percentage is");
        float sum = a+b+c+d+e;
        float div = (sum)/500f;
        float percentage = div*100f;

        System.out.print(percentage);
        System.out.print("%");



    }
}
