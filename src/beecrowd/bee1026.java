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
 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            while (scanner.hasNext()) {
                String[] input = scanner.nextLine().split(" ");
                int num1 = Integer.parseUnsignedInt(input[0]);
                int num2 = Integer.parseUnsignedInt(input[1]);
    
                int result = 0;
                int carry = 0;
                for (int i = 0; i < 32; i++) {
                    int bit1 = (num1 >> i) & 1;
                    int bit2 = (num2 >> i) & 1;
    
                    int sum = bit1 ^ bit2 ^ carry;
                    carry = (bit1 & bit2) | (bit1 & carry) | (bit2 & carry);
    
                    result |= sum << i;
                }
    
                System.out.println(result);
            }
    
            scanner.close();
        }
 
    }
 
}