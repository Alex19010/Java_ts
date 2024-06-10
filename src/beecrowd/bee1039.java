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
        while (scanner.hasNext()) {
            int R1 = scanner.nextInt();
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int X2 = scanner.nextInt();
            int Y2 = scanner.nextInt();
            double distance = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
            if (distance + R1 <= R2) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
        scanner.close();
 
    }
 
}