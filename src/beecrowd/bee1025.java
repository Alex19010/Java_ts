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
 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int testCase = 0;
            while (true) {
                int N = scanner.nextInt();
                int Q = scanner.nextInt();
    
                if (N == 0 && Q == 0) break;
    
                testCase++;
    
                HashMap<Integer, Integer> marblePositions = new HashMap<>();
    
                for (int i = 0; i < N; i++) {
                    int marbleNumber = scanner.nextInt();
                    marblePositions.put(marbleNumber, i + 1);
                }
    
                System.out.println("CASE# " + testCase + ":");
    
                for (int i = 0; i < Q; i++) {
                    int query = scanner.nextInt();
                    if (marblePositions.containsKey(query)) {
                        System.out.println(query + " found at " + marblePositions.get(query));
                    } else {
                        System.out.println(query + " not found");
                    }
                }
            }
    
            scanner.close();
        }
 
    }
 
}