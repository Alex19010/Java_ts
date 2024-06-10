package lab1;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> test1 = Arrays.asList("Dislike");
        System.out.println("Ввод: " + test1 + " ➞ Вывод: " + determineFinalState(test1));

        List<String> test2 = Arrays.asList("Like", "Like");
        System.out.println("Ввод: " + test2 + " ➞ Вывод: " + determineFinalState(test2));

        List<String> test3 = Arrays.asList("Dislike", "Like");
        System.out.println("Ввод: " + test3 + " ➞ Вывод: " + determineFinalState(test3));
    }

    public static String determineFinalState(List<String> actions) {
        if (actions.isEmpty()) return "Nothing";

        long likesCount = actions.stream().filter("Like"::equals).count();
        long dislikesCount = actions.stream().filter("Dislike"::equals).count();

        return likesCount > dislikesCount ? "Like" :
               dislikesCount > likesCount ? "Dislike" : "Nothing";
    }
}