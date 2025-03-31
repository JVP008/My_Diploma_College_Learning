import java.util.Random;
import java.util.Scanner;

public class Simple_Project2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            while (true) {

                String[] str = {"stone", "paper", "scissor"};
                System.out.println("Enter \"stone\", \"paper\", \"scissor\"");
                String string = sc.next();
                int index = random.nextInt(3);
                String RandomString = str[index];


                if (RandomString.equalsIgnoreCase(string)) {
                    System.out.println("Tie Computer Choosed " + RandomString);
                } else if (string.equalsIgnoreCase("stone")
                        && RandomString.equalsIgnoreCase("paper") ||
                        string.equalsIgnoreCase("scissor") && RandomString.equalsIgnoreCase("Stone") ||
                        string.equalsIgnoreCase("paper") && RandomString.equalsIgnoreCase("Scissor")
                ) {
                    System.out.print("You Lose , Computer Choosed ");
                    System.out.println(RandomString);

                } 
                else if (!string.equalsIgnoreCase("Stone") && (!string.equalsIgnoreCase("Scissor")) && (!string.equalsIgnoreCase("Paper"))) {
                    System.out.println("Invalid Input");
                }
                 else {
                    System.out.print("You Won Computer Choosed ");
                    System.out.println(RandomString);
                }
                System.out.println("You Wanna Play Again yes / no");
                String choice = sc.next();
                if ((choice.equalsIgnoreCase("no"))) {
                    System.out.println("Good bye ");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Caught");
        }
    }
}
