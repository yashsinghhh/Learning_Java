public class TypeCasting2 {
    public static void main(String[] args) {
        byte a =23;
        char b = 11;
        short c = 2134;
        int d =  34;
        float e = 34.45f;
        double result = (a*b)  + ( c/d) + (d-e) ;
        System.out.println(result);
        System.out.println((a*b)  + " "  + ( c/d) + " " +(d-e));
        //float + int + double = double as double is the greatest

    }
}
