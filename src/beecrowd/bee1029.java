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
        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++) {
            int n = scanner.nextInt();
            int[] calls = new int[n + 1];
            int result = fib(n, calls);
            System.out.println("fib(" + n + ") = " + (calls[n] - 1) + " calls = " + result);
        }
        scanner.close();
    }

    public static int fib(int n, int[] calls) {
        calls[0] = 1;
        calls[1] = 1;
        if (n == 0 || n == 1) {
            return n;
        }
        if (calls[n] != 0) {
            return calls[n];
        }
        calls[n] = fib(n - 1, calls) + fib(n - 2, calls) + 1;
        return calls[n];
 
    }
 
}