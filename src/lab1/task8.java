package lab1;

public class Task8 {
    public static void main(String[] args) {
        String[] correctAnswers = {
            "A", "C", "B", "D", "A", "B", "C", "D", "A", "C",
            "B", "D", "A", "B", "C", "D", "A", "C", "B", "D"
        };

        String[] studentAnswers = {
            "A", "D", "B", "C", "A", "B", "D", "C", "A", "C",
            "B", "D", "A", "B", "C", "D", "A", "B", "C", "D"
        };

        int[] results = calculateResults(correctAnswers, studentAnswers);

        System.out.println("Правильные ответы: " + results[0]);
        System.out.println("Неправильные ответы: " + results[1]);
    }

    public static int[] calculateResults(String[] correctAnswers, String[] studentAnswers) {
        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(studentAnswers[i])) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        return new int[]{correctCount, incorrectCount};
    }
}