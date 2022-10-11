public class typecastingK05 {
    public static void main(String[] args) {
        // converting float to int
        int num = (int) (67.23f);
        System.out.println(num);
        //conversion of int to float is possible but from float to int isnt as float is a grater value than int so int
        //so int can be converted to float but can be vice versa --- the value to be converted must be a smaller value


        // narrowing conversion/Type casting is the conversion of float to integer.
        //HOW TO
        int num1 = (int)(34.545f);
        //OUTPUT = 34

        //automatic type promotion in expressions
        int a = 257 ;
        byte b = (byte) (a);
        System.out.println(b);
// it gives 1 when 257 as 256 is max for byte as 1 is the remainder so
        // its actually doing 257%256 which is 1
        //IT WILL GIVE THE REMAINDER

        //AUTO PROMOTION
        byte a1 = 50;
        byte b1 =23;
        int c = a1* b1;
        System.out.println(c);
        // here the value of byte has exceeded its 356 limit as java has automatically promoted
        //the byte value to an integer to perform the calculations

        // BUT if
        byte r =23;
        //b = b*2;
        //it will show an error because whenever you do a byte evaluation its converts it into a int
        // then how can we assign value b to byte


        //RULES
        // all BYTE SHORT AND CHAR are promoted to integer
        //if in an operation there is a single double, float, then the out will be double or float resp
        System.out.println(4*6.6);
        //OUTPUT = 26.4


    }
}
