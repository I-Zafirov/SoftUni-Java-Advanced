package T11FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        String output = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

//        for (int i = 0; i < numbers.size(); i++) {
//            int number = numbers.get(i);
//
//            if (i == numbers.size() - 1) {
//                System.out.println(number);
//            } else {
//
//                System.out.print(number + ", ");
//            }
//        }

        System.out.println(output);

        System.out.println(numbers.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}
