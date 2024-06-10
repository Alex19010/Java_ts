import java.util.Scanner;
import java.util.InputMismatchException;

public class Test_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            try {
                System.out.print("Enter an integer: ");
                num = scanner.nextInt();
                System.out.println("The number entered is " + num);
            } catch (InputMismatchException e) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.next();
                continue;
            }
            break;
        } while (true);

        scanner.close();
    }
}
