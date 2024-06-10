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
            String text = scanner.nextLine().toLowerCase();
            
            int[] count = new int[26];
            
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    count[c - 'a']++;
                }
            }
            
            int maxFrequency = 0;
            for (int j = 0; j < 26; j++) {
                maxFrequency = Math.max(maxFrequency, count[j]);
            }
            
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                if (count[j] == maxFrequency) {
                    result.append((char) ('a' + j));
                }
            }
            
            System.out.println(result);
        }
        
        scanner.close();
        
    }
 
}