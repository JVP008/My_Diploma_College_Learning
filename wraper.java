// import java.lang.*;
public class wraper {
    public static void main(String[] args) {
        Integer i = 7; // auto boxing
        int a = i; // auto unboxing
        int a1 = i.intValue(); // unboxing
        Double d = 3.14; // auto boxing
        double b = d;   // auto unboxing
        String s = "123"; 
        int st = Integer.parseInt(s); 
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(st);
    }
}
