import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;


/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            
            long sum = 0;
            for (int i = 1; i < n; i++) {
                sum += Math.abs(nums[i] - nums[i - 1]) * (n - i) * i;
            }
            System.out.printf("Case %d: %d\n", t, sum);
        }
        scanner.close();
 
    }
 
}