package lab1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();
        scanner.close();

        printNumbersUpToAge(age);
    }

    public static void printNumbersUpToAge(int age) {
        if (age % 2 == 0) {
            printEvenNumbersUpTo(age);
        } else {
            printOddNumbersUpTo(age);
        }
    }

    private static void printEvenNumbersUpTo(int age) {
        System.out.print("Четные числа до " + age + ": ");
        for (int i = 2; i <= age; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printOddNumbersUpTo(int age) {
        System.out.print("Нечетные числа до " + age + ": ");
        for (int i = 1; i <= age; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}