package Edabit.Java;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Remove_Duplicates_from_an_Array {

    /*
    Create a method that takes an array of strings or integers, removes all duplicate items and returns
    a new array in the same sequential order as the old array (minus duplicates).
     */


    public static int[] removeDups(int[] arr){

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                   if (arr[i] != arr[j]){
                       if (!queue.contains(arr[i])){
                           queue.add(arr[i]);
                           break;
                       }
                   }
            }
        }
        if (!queue.contains(arr[arr.length-1])){
            queue.add(arr[arr.length-1]);
        }

        System.out.println(queue);

        int[] newArr = new int[queue.size()];
        int size = queue.size();
        for (int i = 0; i < size ; i++) {
            newArr[i] =queue.remove();
        }

        return newArr;
    }


    public static String[] removeDups(String[] arr){

        Queue<String > queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (!arr[i].equals(arr[j])){
                    if (!queue.contains(arr[i])){
                        queue.add(arr[i]);
                        break;
                    }
                }
            }
        }
        if (!queue.contains(arr[arr.length-1])){
            queue.add(arr[arr.length-1]);
        }

        System.out.println(queue);

        String[] newArr = new String[queue.size()];

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            newArr[i] =queue.remove();
            System.out.println(newArr[i]);
        }

        return newArr;
    }



    public static void main(String[] args) {
        int[] arrInt = {0,1,0,1};
        String[] arr = {"Shir" , "Nitzan" , "Dor" , "Shir"};

        System.out.println(Arrays.toString(removeDups(arrInt)));
        System.out.println(Arrays.toString(removeDups(arr)));

    }
}

