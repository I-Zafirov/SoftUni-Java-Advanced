package T07SetsAndMapsAdvanced.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String directions = tokens[0];
            String carRegistrations = tokens[1];

            if (directions.equals("IN")) {
                cars.add(carRegistrations);
            } else {
                cars.remove(carRegistrations);
            }

            input = scanner.nextLine();
        }

        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), cars));
        }
    }
}
