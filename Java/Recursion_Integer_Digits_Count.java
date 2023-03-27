package Edabit.Java;

public class Recursion_Integer_Digits_Count {

    /*
    Create a function that recursively counts the integer's number of digits.
    Examples
    count(318) ➞ 3
    count(-92563) ➞ 5
    count(4666) ➞ 4
     */

    public static int count(int num){
        if (num == 0) return 0;

        return count(num/10) +1;
    }

    public static void main(String[] args) {
        System.out.println(count(318));
        System.out.println(count(-92563));
        System.out.println(count(4666));
    }
}
