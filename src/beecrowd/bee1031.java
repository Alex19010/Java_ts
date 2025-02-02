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
        int N;
        while ((N = scanner.nextInt()) != 0) {
            int m = findM(N);
            System.out.println(m);
        }
        scanner.close();
    }

    public static int findM(int N) {
        for (int m = 1; m <= N; m++) {
            if (lastRegion(N, m) == 13) {
                return m;
            }
        }
        return -1;
    }

    public static int lastRegion(int N, int m) {
        int lastRegion = 1;
        for (int i = 2; i <= N; i++) {
            lastRegion = (lastRegion + m - 1) % i + 1;
        }
        return lastRegion;
 
    }
 
}