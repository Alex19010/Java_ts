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
            int D = scanner.nextInt();
            int N = scanner.nextInt();
            
            if (D == 0 && N == 0) break;
            
            int result = 0;
            int multiplier = 1;
            
            while (N > 0) {
                int digit = N % 10;
                N /= 10;
                
                if (digit != D) {
                    result += digit * multiplier;
                    multiplier *= 10;
                }
            }
            
            System.out.println(result);
        }
        
        scanner.close();
 
    }
 
}