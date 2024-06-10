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

        int cityNumber = 0;
        while (true) {
            int n = scanner.nextInt(); // Количество домов
            if (n == 0) break;

            cityNumber++;
            int[] residents = new int[n]; // Число жителей в каждом доме
            int[] consumption = new int[n]; // Потребление воды в каждом доме

            // Считываем информацию о каждом доме
            for (int i = 0; i < n; i++) {
                residents[i] = scanner.nextInt();
                consumption[i] = scanner.nextInt();
            }

            // Вычисляем общее потребление воды в городе
            int totalConsumption = Arrays.stream(consumption).sum();

            // Сортируем информацию о домах по потреблению воды
            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) {
                indices[i] = i;
            }
            Arrays.sort(indices, (a, b) -> consumption[a] - consumption[b]);

            // Выводим результаты
            System.out.println("Cidade# " + cityNumber + ":");
            for (int i = 0; i < n; i++) {
                int index = indices[i];
                System.out.printf("%d-%d ", residents[index], consumption[index]);
            }
            double averageConsumption = (double) totalConsumption / Arrays.stream(residents).sum();
            System.out.printf("%nConsumo medio: %.2f m3.%n%n", averageConsumption);
        }

        scanner.close();
    }
 
}