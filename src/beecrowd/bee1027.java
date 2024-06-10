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
        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++) {
            int numPoints = scanner.nextInt();
            Set<Integer> xCoordinates = new HashSet<>();
            for (int j = 0; j < numPoints; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if ((y % 2 == 0 && !xCoordinates.contains(x)) || (y % 2 != 0 && !xCoordinates.contains(x - 1) && !xCoordinates.contains(x + 1))) {
                    xCoordinates.add(x);
                }
            }
            System.out.println(xCoordinates.size());
        }
        scanner.close();
 
    }
 
}