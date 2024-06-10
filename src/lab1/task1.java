package lab1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 2, 3, 3, 1};
        List<Integer> result = removeOddOccurrences(numbers);
        System.out.println("Результат: " + result);
    }

    public static List<Integer> removeOddOccurrences(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            countMap.merge(num, 1, Integer::sum);
        }

        List<Integer> result = new ArrayList<>();
        Arrays.stream(numbers)
              .filter(num -> countMap.get(num) % 2 == 0)
              .forEach(result::add);

        return result;
    }
}