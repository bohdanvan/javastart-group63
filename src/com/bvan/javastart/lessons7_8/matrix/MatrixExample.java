package com.bvan.javastart.lessons7_8.matrix;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        MatrixUtils.printMatrix(matrix);
    }
}
