package T05MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class L1CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEquals = compareMatrices(firstMatrix, secondMatrix);

        String output = areEquals ? "equal" : "not equal";

        System.out.println(output);
    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if (firstArr.length != secondArr.length) {
                return false;
            }

            for (int col = 0; col < firstArr.length; col++) {
                int firstElement = firstArr[col];
                int secondElement = secondArr[col];

                if (firstElement != secondElement) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)//.mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            matrix[row] = arr;
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        /*
        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];
            for (int n : arr) {              //for (int col = 0; col < arr.length; col++){
                System.out.print(n + " ");   //     System.out.print(arr[col] + " ");
            }
            System.out.println();
            */
        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

