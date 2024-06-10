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

        double amount = scanner.nextDouble();

        int[] notes = {100, 50, 20, 10, 5, 2};
        int[] notesCount = new int[6];
        int remainingAmount = (int) (amount * 100);
        for (int i = 0; i < notes.length; i++) {
            notesCount[i] = remainingAmount / (notes[i] * 100);
            remainingAmount %= notes[i] * 100;
        }

        int[] coins = {100, 50, 25, 10, 5, 1};
        int[] coinsCount = new int[6];
        for (int i = 0; i < coins.length; i++) {
            coinsCount[i] = remainingAmount / coins[i];
            remainingAmount %= coins[i];
        }

        System.out.println("NOTAS:");
        for (int i = 0; i < notes.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f%n", notesCount[i], notes[i] * 1.0);
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < coins.length; i++) {
            double coinValue = coins[i] / 100.0;
            System.out.printf("%d moeda(s) de R$ %.2f%n", coinsCount[i], coinValue);
        }

        scanner.close();
 
    }
 
}