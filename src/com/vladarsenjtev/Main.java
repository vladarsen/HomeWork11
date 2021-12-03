package com.vladarsenjtev;

/*
 Написать класс для работы с матрицами (2-мерными массивами), методы:
print(int[][] matrix) - печатает матрицу
swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
mul(int[][] matrix, int value) - умножает матрицу на число
toArray(int[][] matrix) - превращает матрицу в массив.
Например если была матрица на 3x4 то вернуть массив из 12 элементов
max(int[][] matrix) - возвращает максимальный элемент матрицы
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] arrayGrid = {{12, 23, 34}, {54, 74, 12}, {150, 50, 39}};
        WorkMass.printMatrix(arrayGrid);
        System.out.println();
        WorkMass.swapRows(arrayGrid);
        WorkMass.printMatrix(arrayGrid);
        System.out.println();
        WorkMass.swapColumns(arrayGrid);
        System.out.println();
        WorkMass.mul(arrayGrid, 2);
        System.out.println(Arrays.toString(WorkMass.toArray(arrayGrid)));
        System.out.println();
        System.out.println(WorkMass.getMaxElement(arrayGrid));
    }
}
