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
        
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;
            
            HashMap<Character, Integer> problems = new HashMap<>();
            int totalPenalty = 0;
            
            for (int i = 0; i < N; i++) {
                char problem = scanner.next().charAt(0);
                int time = scanner.nextInt();
                String judgement = scanner.next();
                
                if (judgement.equals("correct")) {
                    if (!problems.containsKey(problem)) {
                        problems.put(problem, time);
                    }
                } else {
                    totalPenalty += 20;
                }
            }
            
            int distinctProblems = problems.size();
            int totalTime = problems.values().stream().mapToInt(Integer::intValue).sum() + totalPenalty;
            
            System.out.println(distinctProblems + " " + totalTime);
        }
        
        scanner.close();
 
    }
 
}