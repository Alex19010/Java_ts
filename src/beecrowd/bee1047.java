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
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();
        
        int durationHour, durationMinute;
        if (startHour < endHour || (startHour == endHour && startMinute < endMinute)) {
            durationHour = endHour - startHour;
            durationMinute = endMinute - startMinute;
        } else {
            durationHour = 24 - startHour + endHour;
            durationMinute = endMinute - startMinute;
            if (durationMinute < 0) {
                durationHour--;
                durationMinute += 60;
            }
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHour, durationMinute);
        scanner.close();
 
    }
 
}