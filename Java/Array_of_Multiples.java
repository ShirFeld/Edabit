package Edabit.Java;

import java.util.Arrays;

public class Array_of_Multiples {

    /*
    Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num
    until the array length reaches length.
    Examples
    arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
    arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
     */

    public static int[] arrayOfMultiples(int num , int len){
        int[] arr = new int[len];
//        int j=1;

        for (int i = 0; i < len; i++) {
            arr[i] = num *(1+i);
//            j++;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(7,5)));
    }
}
