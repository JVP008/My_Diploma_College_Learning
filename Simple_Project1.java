import  java.util.Random;
import  java.util.Scanner;

public class Simple_Project1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            Random random = new Random(10);
            while (true) {
                System.out.println("Enter No For Guessing ");
                int i = random.nextInt(20);
                int no = s.nextInt();
                if (i == no) {
                    System.out.println("You Guessed Correct");
                    break;
                } else {
                    System.out.println("Guess again " + "its " + i);
                }

            }
        }
        finally
        {
            s.close();
        }
    }
}
