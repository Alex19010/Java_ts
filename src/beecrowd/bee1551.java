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
        scanner.nextLine(); // consume newline
        
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine().replaceAll("[,\\s]", "");
            boolean[] letters = new boolean[26];
            
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    letters[c - 'a'] = true;
                }
            }
            
            int count = 0;
            for (boolean letter : letters) {
                if (letter) {
                    count++;
                }
            }
            
            if (count == 26) {
                System.out.println("frase completa");
            } else if (count >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
        
        scanner.close();
 
    }
 
}