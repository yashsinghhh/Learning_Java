import java.util.Scanner;

public class Bennett_project {
    //Determing batch number and group according to the enrollment number
    public static void main(String[] args) {
        System.out.println("Welcome to Bennett University");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name ");
        String name = sc.next();
        System.out.print("Enter your last name ");
        String name1 = sc.next();
        System.out.println("Welcome "+ name );
        System.out.println("Select your course");
       System.out.println("1. BTech  2. LLB  3. BCA  4. BAJMC");
        int course = sc.nextInt();
        switch (course) {
            case 1 -> {
                System.out.println("select your branch");
                System.out.println("a. CSE  b. ECE  c. MCE");
                String branch = sc.next();
                switch (branch) {
                    case "a" -> {System.out.println("Welcome to the School of Computer Sciences");
                        System.out.println("Enter last 4 numbers of your Enrollment Id");
                        float enroll = sc.nextFloat();
                        float batch = enroll/30f;
                        System.out.println("your Batch is B" + (int)(Math.ceil(batch)));
                        float group = batch/5f;
                        System.out.println("Group number is " + (int)(Math.ceil(group)));
                    }
                    case "b" -> {System.out.println("Welcome to the School of Electrical and Computer Engineering");

                        System.out.println("Enter last 4 numbers of your Enrollment Id");
                        float enroll1 = sc.nextFloat();
                        float batch1 = enroll1/40f;
                        System.out.println("your Batch is B" + (int)(Math.ceil(batch1)));
                        float group1 = batch1/5f;
                        System.out.println("Group number is " + (int)(Math.ceil(group1)));}
                    case "c" -> {System.out.println("Welcome to the School of Mechanical Engineering");

                        System.out.println("Enter last 4 numbers of your Enrollment Id");
                        float enroll2 = sc.nextInt();
                        float batch2 = enroll2/30f;
                        System.out.println("your Batch is B" + (int)(Math.ceil(batch2)));
                        float group2 = batch2/5f;
                        System.out.println("Group number is " + (int)(Math.ceil(group2)));}
                }


                }
                case 2 ->{
                //considering every batch has 50 students with a total of 100 students
                    System.out.println("welcome to School of Law");
                System.out.println("Enter last 4 numbers of your Enrollment Id");
                    float enroll3 = sc.nextFloat();
                    float batch = 0f;
                    if (enroll3>=50) {
                        batch = 2;

                    }
                    else {
                        batch = 1;
                    }
                    System.out.println("your Batch is B" + (int)(Math.ceil(batch)));
                    System.out.println("Group number is 1");

                }
                case 3-> {
                // considering there is only one batch and group of 80 students
                    System.out.println("welcome to School of Computer Application");
                    System.out.println("your batch is B1");
                    System.out.println("group 1");

                }
                case 4 -> {
                //considering there are 10 batches of 60 students and total of 600 students
                    System.out.println("welcome to School of Journalism & Mass Communication");
                   System.out.println("Enter last 4 numbers of your Enrollment Id");
                    float enroll = sc.nextInt();
                    float batch = (enroll/60f);
                    System.out.println("your Batch is B" + (int)(Math.ceil(batch)));
                    if (batch<=5){
                        System.out.println("your group is 1" );
                    }else{
                        System.out.println("your group is 2");
                    }
                    }

                }
                }



            }





