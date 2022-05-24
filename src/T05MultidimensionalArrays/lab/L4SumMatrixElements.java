package T05MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class L4SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = matrixRead(scanner);

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(Arrays.stream(matrix).mapToInt(arr -> Arrays.stream(arr).sum()).sum());
    }

    private static int[][] matrixRead(Scanner scanner) {
        int[] size = arrayRead(scanner);
        int rows = size[0], cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = arrayRead(scanner);
        }
        return matrix;
    }

    private static int[] arrayRead(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
    }
}