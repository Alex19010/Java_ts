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
            int L = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            int hash = 0;
            
            for (int j = 0; j < L; j++) {
                String line = scanner.nextLine();
                
                for (int k = 0; k < line.length(); k++) {
                    char c = line.charAt(k);
                    int position = c - 'A';
                    hash += position + j + k;
                }
            }
            
            System.out.println(hash);
        }
        
        scanner.close();
 
    }
 
}