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

        int amount = scanner.nextInt();

        System.out.println(amount);

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        int notes20 = amount / 20;
        amount %= 20;

        int notes10 = amount / 10;
        amount %= 10;

        int notes5 = amount / 5;
        amount %= 5;

        int notes2 = amount / 2;
        amount %= 2;

        int notes1 = amount;

        System.out.println(notes100 + " nota(s) de R$ 100,00");
        System.out.println(notes50 + " nota(s) de R$ 50,00");
        System.out.println(notes20 + " nota(s) de R$ 20,00");
        System.out.println(notes10 + " nota(s) de R$ 10,00");
        System.out.println(notes5 + " nota(s) de R$ 5,00");
        System.out.println(notes2 + " nota(s) de R$ 2,00");
        System.out.println(notes1 + " nota(s) de R$ 1,00");

        scanner.close();

    }
 
}