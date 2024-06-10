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
        
        if (isTriangle(A, B, C)) {
            double perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            double area = (A + B) * C / 2.0;
            System.out.printf("Area = %.1f\n", area);
        }
        scanner.close();
    }
    
    public static boolean isTriangle(double A, double B, double C) {
        return A + B > C && A + C > B && B + C > A;
 
    }
 
}