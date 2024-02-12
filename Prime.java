import java.util.Scanner;
public class Prime{

    // The `isPrime` method is a helper method that checks whether a given number is prime or not.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // The code snippet you provided is a helper method called `isPrime` that checks whether a
        // given number is prime or not.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

   // The code you provided is the main method of a Java program. It prompts the user to enter a
   // starting and ending number for a range. It then calls the `isPrime` method to check if each
   // number in the range is prime or not. If a number is prime, it is printed to the console.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}