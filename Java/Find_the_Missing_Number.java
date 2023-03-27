package Edabit.Java;

public class Find_the_Missing_Number {

    /*
    Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
     */

    public static int missingNum(int[] arr){
        int[] indexes = new int[arr.length+2];

        for (int i = 0; i <= indexes.length; i++) {
            if (i+1 > arr.length)
                break;
            indexes[arr[i]]++;
        }

        for (int i = 1; i < indexes.length; i++) {
            if (indexes[i]==0)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,8,6,9,10,3,4};
        System.out.println(missingNum(arr));
    }
}
