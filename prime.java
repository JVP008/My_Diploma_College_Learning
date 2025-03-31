public class prime {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        boolean isPrime = true;
        while (i <= n / 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
