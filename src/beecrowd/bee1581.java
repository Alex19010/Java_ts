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
            int K = scanner.nextInt();
            scanner.nextLine();
            
            Set<String> languages = new HashSet<>();
            for (int j = 0; j < K; j++) {
                String language = scanner.nextLine();
                languages.add(language);
            }
            
            if (languages.size() > 1) {
                System.out.println("ingles");
            } else {
                System.out.println(languages.iterator().next());
            }
        }
        
        scanner.close();
 
    }
 
}