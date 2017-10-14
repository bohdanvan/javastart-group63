package com.bvan.javastart.lessons7_8.matrix;

/**
 * @author bvanchuhov
 */
public class FillerExample {

    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        MatrixUtils.fill(matrix, 42);

        MatrixUtils.printMatrix(matrix);
    }
}
