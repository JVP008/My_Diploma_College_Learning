import java.util.Scanner;
import java.util.Vector;
class Myexeption extends Exception {
    // Default Constructor (invisible) haha!
}
public class Assignment8 {
  @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter any Character");
            String str = s.next();
            char c = str.charAt(0);
            @SuppressWarnings("rawtypes")
            Vector v = new Vector<>();
            v.add('a');
            v.add('A');
            v.add('e');
            v.add('E');
            v.add('i');
            v.add('I');
            v.add('u');
            v.add('U');       
      
            try {
                if (v.contains(c)) {
                    throw new Myexeption();
                }
            } catch (Myexeption m) {
                System.out.println(m);
                System.out.println("you have entered '" + c + "' which is a vowel");
            }
        }
        System.out.println("anyways you can code ");
        System.out.println();
    }
}