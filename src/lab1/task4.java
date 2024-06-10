package lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество минут: ");
        int minutes = scanner.nextInt();
        System.out.print("Количество сообщений: ");
        int messages = scanner.nextInt();

        double finalAmount = calculateTotalCost(minutes, messages);

        scanner.close();
    }

    public static double calculateTotalCost(int minutes, int messages) {
        final double BASE_COST = 15.00;
        final double MINUTES_THRESHOLD = 50;
        final double MESSAGES_THRESHOLD = 50;
        final double EXTRA_MINUTE_COST = 0.25;
        final double EXTRA_MESSAGE_COST = 0.15;
        final double FEE_911 = 0.44;
        final double TAX_RATE = 0.05;

        double extraMinutesCost = EXTRA_MINUTE_COST * Math.max(0, minutes - MINUTES_THRESHOLD);
        double extraMessagesCost = EXTRA_MESSAGE_COST * Math.max(0, messages - MESSAGES_THRESHOLD);
        double totalCost = BASE_COST + extraMinutesCost + extraMessagesCost;
        double tax = TAX_RATE * (totalCost + FEE_911);
        double finalAmount = totalCost + FEE_911 + tax;

        printCosts(BASE_COST, extraMinutesCost, extraMessagesCost, FEE_911, tax, finalAmount, minutes, messages);

        return finalAmount;
    }

    public static void printCosts(double baseCost, double extraMinutesCost, double extraMessagesCost, double fee911, double tax, double finalAmount, int minutes, int messages) {
        System.out.println("Базовая стоимость: $" + String.format("%.2f", baseCost));
        System.out.println("Дополнительные минуты: $" + String.format("%.2f", extraMinutesCost) + " (" + (minutes > 50 ? (minutes - 50) : 0) + " минут)");
        System.out.println("Дополнительные сообщения: $" + String.format("%.2f", extraMessagesCost) + " (" + (messages > 50 ? (messages - 50) : 0) + " сообщений)");
        System.out.println("Сбор за 911: $" + String.format("%.2f", fee911));
        System.out.println("Налог: $" + String.format("%.2f", tax) + " (5% от общей суммы $" + String.format("%.2f", (baseCost + extraMinutesCost + extraMessagesCost + fee911)) + ")");
        System.out.println("Итоговая сумма: $" + String.format("%.2f", finalAmount));
    }
}