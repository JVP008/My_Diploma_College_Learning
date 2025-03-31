// JAYESH PATIL
import java.util.Vector;
public class Assignment3
{
    public static void main(String[] args)
    {
        // Declaraation of vector variables
        Vector<String> v = new Vector<>(5,20);
        Vector<String> vowel = new Vector<>();
        Vector<String> Consonant= new Vector<>();
        for (int i = 0; i < 26; i++)
        {
            int temp = i + 65;
            char c = (char) temp; // converting int to character/ascii
            v.add(String.valueOf(c)); // adding elements to the vector
        }
    
        String[] vowels = {"A", "E", "I", "O", "U"};
        for (int i = 0; i < vowels.length; i++)
        {
        vowel.add(vowels[i]);
        } // adding vowels to the vector variable vowel

    Consonant.addAll(v);
    Consonant.removeAll(vowel);
    System.out.println("VECTOR : " + v);
    System.out.println("VOWELS : " + vowel);  
    System.out.println("CONSONANTS : " + Consonant);
    }
}
