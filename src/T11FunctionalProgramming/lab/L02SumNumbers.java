package T11FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> countFormatter = list -> "Count = " + list.size();

        Function<List<Integer>, Integer> sumAllElements = l -> l.stream().mapToInt(e -> e).sum();
//        Function<List<Integer>, Integer> sumAllElements = l -> l.stream().reduce(0, (f, s) -> f + s);
//        Function<List<Integer>, Integer> sumAllElements = l -> l.stream().reduce(0, Integer::sum);

        Function<Integer, String> sumFormatter = s -> "Sum = " + s;

        String countOutput = countFormatter.apply(numbers);

        System.out.println(countOutput);

        int sum = sumAllElements.apply(numbers);
        String sumOutput = sumFormatter.apply(sum);
        System.out.println(sumOutput);
    }
}
