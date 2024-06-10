package lab1;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] nums2 = {0, 2, 1, 9, 7};

        // Преобразуем массивы в списки
        List<Integer> nums1List = Arrays.asList(nums1);
        List<Integer> nums2List = Arrays.asList(nums2);

        // Создаем новый список с элементами из nums2List и добавляем элементы из nums1List, которых нет в nums2List
        List<Integer> nums3 = new ArrayList<>(nums2List);
        nums3.addAll(nums1List.stream().filter(num -> !nums2List.contains(num)).collect(Collectors.toList()));

        // Вывод результата
        System.out.println("nums3: " + nums3);
    }
}