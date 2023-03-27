package Edabit;

public class Seven_Boom {
    /*
    Create a function that takes an array of numbers and return "Boom!" if the digit 7
    appears in the array. Otherwise, return "there is no 7 in the array".
     */

    public static String  sevenBoom(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {8, 6, 33, 100};

        System.out.println(sevenBoom(arr));
        System.out.println( sevenBoom(arr2));
    }
}
