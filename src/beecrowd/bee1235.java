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
        scanner.nextLine();
        
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            int length = line.length();
            StringBuilder decodedLine = new StringBuilder();
            
            for (int j = length / 2 - 1; j >= 0; j--) {
                decodedLine.append(line.charAt(j));
            }
            
            for (int j = length - 1; j >= length / 2; j--) {
                decodedLine.append(line.charAt(j));
            }
            
            System.out.println(decodedLine);
        }
        
        scanner.close();
 
    }
 
}