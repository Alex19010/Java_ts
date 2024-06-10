import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;


/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < N; i++) {
            String expression = scanner.nextLine();
            if (isValid(expression)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
        scanner.close();
    }
    
    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
 
    }
 
}