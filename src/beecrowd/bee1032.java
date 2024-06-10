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
        int n;
        while ((n = scanner.nextInt()) != 0) {
            int survivor = findSurvivor(n);
            System.out.println(survivor);
        }
        scanner.close();
    }

    public static int findSurvivor(int n) {
        boolean[] isPrime = new boolean[2 * n + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= 2 * n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 2 * n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime[i]) {
                count++;
            }
            i++;
        }
        return i - 1;
 
    }
 
}