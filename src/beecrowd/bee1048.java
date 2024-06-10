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
        double salary = scanner.nextDouble();
        
        double newSalary, moneyEarned, increasePercentage;
        if (salary <= 400.00) {
            increasePercentage = 15.0;
        } else if (salary <= 800.00) {
            increasePercentage = 12.0;
        } else if (salary <= 1200.00) {
            increasePercentage = 10.0;
        } else if (salary <= 2000.00) {
            increasePercentage = 7.0;
        } else {
            increasePercentage = 4.0;
        }
        
        moneyEarned = salary * increasePercentage / 100;
        newSalary = salary + moneyEarned;
        
        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %.0f %%\n", increasePercentage);
        
        scanner.close();
 
    }
 
}