package org.example;

import java.util.Arrays;

public class Main {
    private static int[] carModel;

    public Main() {
        carModel = new int[0];
    }

    public static void main(String[] args) {

        Integer[] carModel1 = {1, 2, 3, 4};
        Integer temp = carModel1[0];
        carModel1[0] = carModel1 [2];
        carModel1 [2] = temp;
        System.out.println(Arrays.toString(carModel1));

        Integer[] carModel2 = {1, 2, 3, 4};
        Integer[] carModel3 = {14, 20, 3, 4};
         System.out.println(areArraysEquals(carModel1,carModel2));
    }

    public static <T> boolean areArraysEquals(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
       return true;
    }

    }



