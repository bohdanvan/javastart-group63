package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixUtils {

    public static void fill(int[][] matrix, int filler) {
        for (int[] row : matrix) {
            Arrays.fill(row, filler);
        }
    }

    public static void fillOldStyle(int[][] matrix, int filler) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = filler;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
