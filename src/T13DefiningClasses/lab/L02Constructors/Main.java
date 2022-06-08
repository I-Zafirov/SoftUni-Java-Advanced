package T13DefiningClasses.lab.L02Constructors;

import T13DefiningClasses.lab.L01CarInfo.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsCount = Integer.parseInt(scanner.nextLine());

        while (carsCount-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String brand = tokens[0];

            Car carConstr;
            if (tokens.length == 1) {
                carConstr = new Car(brand);
            } else {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                carConstr = new Car(brand, model, horsePower);
            }

            System.out.println(carConstr.carInfo());
            //System.out.println(car.toString());
        }
    }
}
