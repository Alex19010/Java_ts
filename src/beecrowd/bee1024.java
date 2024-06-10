import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine();
        for (int t = 0; t < testCases; t++) {
            String line = scanner.nextLine();
            StringBuilder encryptedLine = new StringBuilder();

            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    c += 3;
                    if ((Character.isUpperCase(c) && c > 'Z') || (Character.isLowerCase(c) && c > 'z')) {
                        c -= 26;
                    }
                }
                encryptedLine.append(c);
            }

            encryptedLine.reverse();
            for (int i = 0; i < encryptedLine.length(); i++) {
                char c = encryptedLine.charAt(i);
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    c -= 1;
                    if ((Character.isUpperCase(encryptedLine.charAt(i)) && c < 'A') || 
                        (Character.isLowerCase(encryptedLine.charAt(i)) && c < 'a')) {
                        c += 26;
                    }
                }
                encryptedLine.setCharAt(i, c);
            }

            System.out.println(encryptedLine.toString());
        }

        scanner.close();
    }
 
}