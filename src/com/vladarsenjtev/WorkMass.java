package com.vladarsenjtev;

import java.util.Arrays;

public class WorkMass {
    public static int[][] printMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        return grid;
    }

    public static int[][] swapRows(int[][] matrix) {
        int[] line = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = line;
        return matrix;
    }

    public static int[][] swapColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][1];
            matrix[i][1] = matrix[i][2];
            matrix[i][2] = tmp;
        }
        return printMatrix(matrix);
    }

    public static int[][] mul(int[][] matrix, int value) {
        int[][] array = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                array[i][j] = matrix[i][j] * value;
            }
        }
        return printMatrix(array);
    }

    public static int[] toArray(int[][] nums) {
        int[] combined = new int[size(nums)];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                combined[index++] = nums[i][j];
            }
        }
        return combined;
    }

    private static int size(int[][] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            size += values[i].length;
        }
        return size;
    }

    public static int getMaxElement(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}