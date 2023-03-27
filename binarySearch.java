package Edabit;

public class binarySearch {

    // You need to find the first index of number 1


    public static int firstPlace(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int middle = (start+end)/2;

            if (arr[middle] == 0)
                start = middle+1;

            else if (arr[middle]==1 && arr[middle-1] != 1){
                return middle;
            }

            if (arr[middle]==1 && arr[middle-1] ==1)
               end = middle-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,1,1};  // 5

        System.out.println(firstPlace(arr));
    }
}
