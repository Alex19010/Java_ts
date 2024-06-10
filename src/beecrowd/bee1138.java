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
        
        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            if (A == 0 && B == 0) break;
            
            int[] digitCounts = new int[10];
            
            for (int i = A; i <= B; i++) {
                countDigits(i, digitCounts);
            }
            
            for (int count : digitCounts) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void countDigits(int number, int[] digitCounts) {
        while (number > 0) {
            int digit = number % 10;
            digitCounts[digit]++;
            number /= 10;
        }
 
    }
 
}