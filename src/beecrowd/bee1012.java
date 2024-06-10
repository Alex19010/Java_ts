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
        
        double areaTriangle = (A * C) / 2;
        
        final double PI = 3.14159;
        
        double areaCircle = PI * Math.pow(C, 2);
        
        double areaTrapezium = ((A + B) * C) / 2;
        
        double areaSquare = Math.pow(B, 2);
        
        double areaRectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);
        
        scanner.close();
 
    }
 
}