package T05MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class L8WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int[][] fixedMatrix = new int[rows][matrix[0].length];
        String[] rowColumn = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(rowColumn[0]);
        int col = Integer.parseInt(rowColumn[1]);
        int wrongValue = matrix[row][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wrongValue) {
                    fixedMatrix[i][j] = ((j == 0 ? 0 : matrix[i][j - 1] == wrongValue ? 0 : matrix[i][j - 1]) +
                            (j == matrix[i].length - 1 ? 0 : matrix[i][j + 1] == wrongValue ? 0 : matrix[i][j + 1]) +
                            (i == 0 ? 0 : matrix[i - 1][j] == wrongValue ? 0 : matrix[i - 1][j]) +
                            (i == rows - 1 ? 0 : matrix[i + 1][j] == wrongValue ? 0 : matrix[i + 1][j]));
                } else {
                    fixedMatrix[i][j] = matrix[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(fixedMatrix).replace("], ", "\n")
                .replaceAll("[\\[\\],]", ""));
    }
}

