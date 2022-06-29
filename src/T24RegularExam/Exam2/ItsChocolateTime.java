package T24RegularExam.Exam2;

import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkQueue = new ArrayDeque<>();
        ArrayDeque<Double> cocoStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble)
                .forEach(milkQueue::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble)
                .forEach(cocoStack::push);

        Map<String, Integer> result = new TreeMap<>();
        while (!cocoStack.isEmpty() && !milkQueue.isEmpty()) {

            double sum =  cocoStack.peek()/(milkQueue.peek() + cocoStack.peek()) *100;

            String product = null;

            if (sum == 30) {
                product = "Milk Chocolate";

            } else if (sum == 50) {
                product = "Dark Chocolate";

            } else if (sum == 100) {
                product = "Baking Chocolate";
            }

            if (product != null) {
                result.putIfAbsent(product, 0);
                result.put(product, result.get(product) + 1);
                cocoStack.pop();
                milkQueue.poll();
            } else {
                milkQueue.offer(milkQueue.poll() + 10);
                cocoStack.pop();
            }
        }

        if (result.size() == 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        result.entrySet().forEach(e -> System.out.println(" # " + e.getKey() + " --> " + e.getValue()));
    }
}
