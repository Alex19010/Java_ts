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
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < N; i++) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            
            String combinedString = combineStrings(str1, str2);
            
            System.out.println(combinedString);
        }
        
        scanner.close();
    }
    
    private static String combineStrings(String str1, String str2) {
        StringBuilder combined = new StringBuilder();
        
        int length = Math.min(str1.length(), str2.length());
        for (int i = 0; i < length; i++) {
            combined.append(str1.charAt(i)).append(str2.charAt(i));
        }
        
        if (str1.length() > length) {
            combined.append(str1.substring(length));
        } else if (str2.length() > length) {
            combined.append(str2.substring(length));
        }
        
        return combined.toString();
 
    }
 
}