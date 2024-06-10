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
        
        int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < N; i++) {
            String value = scanner.nextLine();
            int totalLEDs = 0;
            
            for (int j = 0; j < value.length(); j++) {
                int digit = Character.getNumericValue(value.charAt(j));
                totalLEDs += leds[digit];
            }
            
            System.out.println(totalLEDs + " leds");
        }
        
        scanner.close();
 
    }
 
}