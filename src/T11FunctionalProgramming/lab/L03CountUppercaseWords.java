package T11FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startWithUppercase = w -> Character.isUpperCase(w.charAt(0));

        List<String> uppercaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startWithUppercase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());

        System.out.println(String.join(System.lineSeparator(), uppercaseWords));
//1        uppercaseWords.forEach(w -> System.out.println(w));

//2        Consumer<String> printer = w -> System.out.println(w);
//        Consumer<String> printer = System.out::println;
//        uppercaseWords.forEach(printer);
    }
}

