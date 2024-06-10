package lab1;

public class Task9 {

    public static void main(String[] args) {
        int[] hoursWorked = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};
        calculateWorkHours(hoursWorked);
    }

    public static void calculateWorkHours(int[] hoursWorked) {
        int totalHours = 0;
        int daysWorked = 0;
        int weekHours = 0;
        int weekCount = 1;

        for (int i = 0; i < hoursWorked.length; i++) {
            if (i > 0 && i % 5 == 0) {
                printWeekHours(weekCount, weekHours);
                weekHours = 0;
                weekCount++;
            }
            totalHours += hoursWorked[i];
            if (hoursWorked[i] > 0) {
                daysWorked++;
            }
            weekHours += hoursWorked[i];
        }
        if (weekHours > 0) {
            printWeekHours(weekCount, weekHours);
        }

        double averageHoursPerDay = (double) totalHours / daysWorked;
        System.out.printf("Среднее количество часов в день (учитывая только рабочие дни): %.2f%n", averageHoursPerDay);
    }

    private static void printWeekHours(int weekCount, int weekHours) {
        System.out.println(weekCount + "-я неделя: " + weekHours + " часов");
    }
}