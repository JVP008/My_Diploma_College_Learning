public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String anotherStr = "hello, world!";

        // 1. length()
        System.out.println("Length of the string: " + str.length());

        // 2. charAt(int index)
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring(int beginIndex)
        System.out.println("Substring from index 7: " + str.substring(7));

        // 4. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // 5. concat(String str)
        System.out.println("Concatenated string: " + str.concat(" How are you?"));

        // 6. equals(Object obj)
        System.out.println("Are the strings equal? " + str.equals(anotherStr));

        // 7. equalsIgnoreCase(String anotherString)
        System.out.println("Are the strings equal (ignore case)? " + str.equalsIgnoreCase(anotherStr));

        // 8. toLowerCase()
        System.out.println("Lowercase string: " + str.toLowerCase());

        // 9. toUpperCase()
        System.out.println("Uppercase string: " + str.toUpperCase());

        // 10. trim()
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed string: " + strWithSpaces.trim());

        // 11. replace(char oldChar, char newChar)
        System.out.println("Replaced string: " + str.replace('o', 'a'));

        // 12. contains(CharSequence s)
        System.out.println("Does the string contain 'World'? " + str.contains("World"));

        // 13. startsWith(String prefix)
        System.out.println("Does the string start with 'Hello'? " + str.startsWith("Hello"));

        // 14. endsWith(String suffix)
        System.out.println("Does the string end with '!'? " + str.endsWith("!"));

        // 15. indexOf(String str)
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // 16. lastIndexOf(String str)
        System.out.println("Last index of 'o': " + str.lastIndexOf("o"));

        // 17. split(String regex)
        String[] parts = str.split(", ");
        System.out.println("Split string: ");
        for (String part : parts) {
            System.out.println(part);
        }

        // 18. toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}