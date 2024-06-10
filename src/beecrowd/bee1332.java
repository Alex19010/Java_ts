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

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            int number = getNumber(word);
            System.out.println(number);
        }

        scanner.close();
    }

    private static int getNumber(String word) {
        if (word.equals("one") || word.equals("two") || word.equals("six")) {
            return 1;
        } else if (word.equals("three")) {
            return 3;
        } else {
            if (word.charAt(0) == 'o' || word.charAt(1) == 'n') {
                return 1;
            } else if (word.charAt(0) == 't' || word.charAt(2) == 'o') {
                return 2;
            } else {
                return 3;
            }
        }
 
    }
 
}