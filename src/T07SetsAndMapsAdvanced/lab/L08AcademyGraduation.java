package T07SetsAndMapsAdvanced.lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> students = new TreeMap<>();

        while (n-- > 0) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            students.putIfAbsent(studentName, grades);
        }

        students.forEach((key, value) -> {
            double sum = 0;
            for (double grade : value) {
                sum += grade;
            }
            double avg = sum / value.length;
            System.out.printf("%s is graduated with %s%n", key, avg);
        });
    }
}
