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
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            if (N == 0 && M == 0)
                break;
            
            char[][] drawing = new char[N][M];
            for (int i = 0; i < N; i++) {
                String line = scanner.next();
                drawing[i] = line.toCharArray();
            }
            
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            int ratioRow = A / N;
            int ratioCol = B / M;
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    char c = drawing[i][j];
                    for (int k = 0; k < ratioRow; k++) {
                        for (int l = 0; l < ratioCol; l++) {
                            System.out.print(c);
                        }
                    }
                }
                System.out.println();
            }
            
            System.out.println();
        }
        
        scanner.close();
 
    }
 
}