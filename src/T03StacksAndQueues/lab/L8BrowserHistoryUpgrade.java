package T03StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L8BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String navigation = scanner.nextLine();

        ArrayDeque<String> browserHistoryStack = new ArrayDeque<>();
        ArrayDeque<String> forwardHistoryQueue = new ArrayDeque<>();

        String current = "";

        while (!navigation.equals("Home")) {

            switch (navigation) {
                case "back":
                    if (!browserHistoryStack.isEmpty()) {
                        forwardHistoryQueue.addFirst(current);
                        current = browserHistoryStack.pop();
                    } else {
                        System.out.println("no previous URLs");
                        navigation = scanner.nextLine();
                        continue;
                    }
                    break;
                case "forward":
                    if (!forwardHistoryQueue.isEmpty()) {
                        current = forwardHistoryQueue.poll();
                    } else {
                        System.out.println("no next URLs");
                        navigation = scanner.nextLine();
                        continue;
                    }
                    break;
                default:
                    if (!current.isEmpty()) {
                        browserHistoryStack.push(current);
                        forwardHistoryQueue.clear();
                    }
                    current = navigation;
                    break;
            }
            System.out.println(current);
            navigation = scanner.nextLine();
        }
    }
}

