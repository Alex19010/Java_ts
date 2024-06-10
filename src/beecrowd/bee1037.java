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
        double number = scanner.nextDouble();
        if (number < 0 || number > 100) {
            System.out.println("Fora de intervalo");
        } else if (number <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (number <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (number <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
        scanner.close();
 
    }
 
}