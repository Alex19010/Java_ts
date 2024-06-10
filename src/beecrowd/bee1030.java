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
        for (int i = 1; i <= numCases; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int survivor = josephus(n, k);
            System.out.println("Case " + i + ": " + survivor);
        }
        scanner.close();
    }

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
 
    }
 
}