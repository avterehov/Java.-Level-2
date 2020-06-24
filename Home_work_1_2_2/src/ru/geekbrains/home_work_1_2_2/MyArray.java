package ru.geekbrains.home_work_1_2_2;

import static java.lang.Float.NaN;

public class MyArray {


    public static int checkArray(String array[][]) throws MyArraySizeException, MyArrayDataException {

        boolean correctArraySize = true;

        if (array.length != 4) {
            correctArraySize = false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                correctArraySize = false;
                break;
            }
        }
        if (correctArraySize == false) {
            throw new MyArraySizeException("Массив неверного размера!");

        }
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                    arraySum += Integer.parseInt(array[i][j]);
                } catch ( NumberFormatException e) {
                    System.err.println("Элемент массива  в строке " + (i + 1) + ", в столбце " + (j + 1) + " не является числом!");
                }
            }
        }
      return arraySum;
    }

}
