package T03StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L7MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String child : children)
            queue.offer(child);

        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++)
                queue.offer(queue.poll());

            if (!(cycle == 1 || cycle == 4 || (cycle > 5 && (cycle % 2 == 0 || cycle % 3 == 0 || cycle % 5 == 0)))) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }
}