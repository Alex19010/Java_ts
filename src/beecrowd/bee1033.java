import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int caseNum = 1;
        while (true) {
            int n = scanner.nextInt();
            int b = scanner.nextInt();
            if (n == 0 && b == 0) {
                break;
            }
            int lastDigit = getLastDigit(n, b);
            System.out.println("Case " + caseNum + ": " + n + " " + b + " " + lastDigit);
            caseNum++;
        }
        scanner.close();
    }

    public static int getLastDigit(int n, int b) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = (curr + prev) % b;
            prev = temp;
        }
        return curr % 10;
 
    }
 
}