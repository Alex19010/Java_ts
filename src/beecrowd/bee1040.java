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
        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();
        
        double average = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;
        System.out.printf("Media: %.1f\n", average);
        
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double examScore = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", examScore);
            average = (average + examScore) / 2;
            if (average >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
        System.out.printf("Media final: %.1f\n", average);
        scanner.close();
 
    }
 
}