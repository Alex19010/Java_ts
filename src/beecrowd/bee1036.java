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
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double delta = B * B - 4 * A * C;
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double root1 = (-B + Math.sqrt(delta)) / (2 * A);
            double root2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", root1);
            System.out.printf("R2 = %.5f\n", root2);
        }
        scanner.close();
 
    }
 
}