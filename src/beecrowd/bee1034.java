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
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] blockLengths = new int[N];
            for (int i = 0; i < N; i++) {
                blockLengths[i] = scanner.nextInt();
            }
            int minBlocks = findMinBlocks(blockLengths, M);
            System.out.println(minBlocks);
        }
        scanner.close();
    }

    public static int findMinBlocks(int[] blockLengths, int M) {
        int[] dp = new int[M + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j < blockLengths.length; j++) {
                if (i - blockLengths[j] >= 0 && dp[i - blockLengths[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - blockLengths[j]] + 1);
                }
            }
        }
        return dp[M];
 
    }
 
}