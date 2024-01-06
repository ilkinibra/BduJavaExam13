import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        printDigitsAndSum(number);
        scanner.close();
    }

    private static void printDigitsAndSum(long num) {
        num = Math.abs(num);

        int sum = 0;
        System.out.print("Digits of the number: ");
        while (num > 0) {
            long digit = num % 10;
            System.out.print(digit + " ");
            sum += digit;
            num /= 10;
        }
        System.out.println("\nSum of digits: " + sum);
    }
}
