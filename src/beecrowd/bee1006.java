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

        double weightA = 2.0;
        double weightB = 3.0;
        double weightC = 5.0;

        double MEDIA = (A * weightA + B * weightB + C * weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f%n", MEDIA);

        scanner.close();
 
    }
 
}