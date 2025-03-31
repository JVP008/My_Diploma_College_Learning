import java.util.Scanner;
// Body Mass Index Calculator
// formula = BMI = WeightinKG/Hight in meters * Hight in meters;

public class BMI {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Weight in KG : ");
            float WeightinKG = s.nextFloat();
            System.out.print("Enter Height in Meters : ");
            float Hight_in_Meters = s.nextFloat(); 
            float BMI =  WeightinKG / Hight_in_Meters * Hight_in_Meters ;
            
            // Conditions

            if (BMI <18.5)
            {
                System.out.println("You are Underweight");
            }
            else if (BMI >= 18.5 || BMI <= 24.9)
            {
                System.out.println("You are Normal");
            }
            else if (BMI >=25 || BMI <= 29.9)
            {
                System.out.println("You are OverWeight");
            }
            else if (BMI ==30 || BMI > 30 )
            {
                System.out.println("You are Obese");
            }
        }
        System.out.println();
      
    }
}
