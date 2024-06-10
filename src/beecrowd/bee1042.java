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
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int[] sortedNumbers = Arrays.copyOf(numbers, 3);
        Arrays.sort(sortedNumbers);
        
        for (int num : sortedNumbers) {
            System.out.println(num);
        }
        System.out.println();
        for (int num : numbers) {
            System.out.println(num);
        }
        scanner.close();
 
    }
 
}