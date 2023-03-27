package Edabit;

import java.util.Arrays;

public class Crowded_Carriage_Capacity {

    /*
    A train has a maximum capacity of n passengers overall, which means each carriage's
    capacity will share an equal proportion of the maximum capacity.
    Create a function which returns the index of the first carriage which holds 50% or less
    of its maximum capacity. If no such carriage exists, return -1.
     */

    public static int findSeat(int capacity , int[] arr){
        int fiftyPrecent =capacity /arr.length; // 40
        System.out.println(fiftyPrecent + " = fifty");

        for (int i = 0; i < arr.length; i++) {
            int haf = fiftyPrecent/2; //20
            if (arr[i] <=haf)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr ={35,23,18,10,40};
        System.out.println( findSeat(200,arr));

        int[] arr2 ={3,5,4,2};
        System.out.println( findSeat(20,arr2));

    }
}
