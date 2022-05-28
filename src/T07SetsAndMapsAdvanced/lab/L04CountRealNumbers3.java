package T07SetsAndMapsAdvanced.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L04CountRealNumbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(key -> {
                   map.putIfAbsent(key, 0);
                   int oldCount = map.get(key);
                   int newCount = oldCount + 1;
                   map.put(key, newCount);
                });
        for (var entry : map.entrySet()) {
// for(Map.Entry<Double, Integer> entry : map.entrySet())
            System.out.println(String.format("%.1f -> %d", entry.getKey(), entry.getValue()));
        }
    }
}
