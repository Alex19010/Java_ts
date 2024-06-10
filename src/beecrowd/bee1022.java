import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static String simplify(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        return (numerator / gcd) + "/" + (denominator / gcd);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n1 = scanner.nextInt();
            int d1 = scanner.nextInt();
            char operation = scanner.next().charAt(0);
            int n2 = scanner.nextInt();
            int d2 = scanner.nextInt();

            int numerator, denominator;
            switch (operation) {
                case '+':
                    numerator = n1 * d2 + n2 * d1;
                    denominator = d1 * d2;
                    break;
                case '-':
                    numerator = n1 * d2 - n2 * d1;
                    denominator = d1 * d2;
                    break;
                case '*':
                    numerator = n1 * n2;
                    denominator = d1 * d2;
                    break;
                case '/':
                    numerator = n1 * d2;
                    denominator = n2 * d1;
                    break;
                default:
                    System.out.println("Неверная операция");
                    continue;
            }

            String result = simplify(numerator, denominator);
            System.out.println(result + " = " + result);
        }

        scanner.close();
    }
 
}