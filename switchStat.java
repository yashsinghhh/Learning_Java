import java.util.Scanner;

public class switchStat {
    //the switch statement tests the equality of a variable against multiple values.
//    CANNOT BE A VARIABLE IN CASE
//     switch(expression){
//         cases
//            ( do something)
//         break;
    // case 2
//    (do something)
//    break;
//    default
//    do something

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("red  fruit");
//                break;
//            case "orange":
//                System.out.println("orange in colour");
//                break;
//            case "guava":
//                System.out.println("green");
//                break;
//            default:
//                System.out.println("invalid fruit");
//                break;
//        }
//ENHANCED SWITCH STATEMENT
//        case "mango" -> System.out.println("king of fruits");
//        case "apple" -> System.out.println("red  fruit");
//        case "orange" -> System.out.println("orange in colour");
//        case "guava" -> System.out.println("green");
//        default -> System.out.println("invalid fruit");

    //tell if the number of day is a weekday or a weekend
    int day = sc.nextInt();

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }


        }



    }

