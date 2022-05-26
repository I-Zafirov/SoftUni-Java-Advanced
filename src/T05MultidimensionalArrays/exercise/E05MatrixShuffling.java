package T05MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = arr[0];
        int cols = arr[1];
        String[][] matrix = new String[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
        String line;

        while (!"END".equals(line = scanner.nextLine())) {
            String[] input = line.split(" ");
            if (input.length != 5 || !input[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            }
            int row1 = Integer.parseInt(input[1]);
            int col1 = Integer.parseInt(input[2]);
            int row2 = Integer.parseInt(input[3]);
            int col2 = Integer.parseInt(input[4]);
            if (!indexIsValid(row1, rows) || !indexIsValid(col1, cols) || !indexIsValid(row2, rows)
                    || !indexIsValid(col2, cols)) {
                System.out.println("Invalid input!");
                continue;
            }
            String tmp = matrix[row1][col1];
            matrix[row1][col1] = matrix[row2][col2];
            matrix[row2][col2] = tmp;

            printMatrix(matrix);
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean indexIsValid(int i, int max) {
        return i >= 0 && i < max;
    }
}