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

        int productCode1 = scanner.nextInt();
        int productUnits1 = scanner.nextInt();
        double productPrice1 = scanner.nextDouble();
        
        int productCode2 = scanner.nextInt();
        int productUnits2 = scanner.nextInt();
        double productPrice2 = scanner.nextDouble();
        
        double totalToPay = (productUnits1 * productPrice1) + (productUnits2 * productPrice2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalToPay);
        
        scanner.close();
 
    }
 
}