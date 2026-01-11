package pl.edu.agh.java.exercises.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * <p>
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 *
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
    public boolean canBalance(int[] array) {

//        throw new UnsupportedOperationException();


        //TODO
        //Da się zrobić z nieparzystą.


		if (array.length % 2 != 0) return false;
        Arrays.sort(array);

        int end = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            end--;
            int a = 0;
            int b = 0;


            a = array[i];
            b = array[end];
            array[i] = b;
            array[end] = a;
        }

        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < array.length / 2; i++) {
            leftSum += array[i];
        }
        for (int i = array.length; i < array.length / 2; i--) {
            rightSum += array[i];
        }

        if (leftSum - rightSum == 0) {
            return true;
        } else {
            return false;
        }

    }
}
