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
        
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < N; i++) {
            String A = scanner.next();
            String B = scanner.next();
            
            if (fits(A, B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        
        scanner.close();
    }
    
    private static boolean fits(String A, String B) {
        if (B.length() > A.length()) {
            return false;
        }
        
        int diff = A.length() - B.length();
        String lastDigits = A.substring(diff);
        
        return lastDigits.equals(B);
 
    }
 
}