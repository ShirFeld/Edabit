package Edabit;

public class Cup_Swapping {

    /*
    There are three cups on a table, at positions A, B, and C. At the start,
    there is a ball hidden under the cup at position B.
    However, I perform several swaps on the cups, which is notated as two letters. For example,
    if I swap the cups at positions A and B, I could notate this as AB or BA.
    Create a function that returns the letter position that the ball is at, once I finish swapping the cups.
    The swaps will be given to you as an array.
     */


    public static String cupSwapping(String[] arr){

        String ball = "B";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "BA" || arr[i] == "AB" ){
                if (ball == "B") ball ="A";
                else if (ball =="A") ball ="B";
            }
            if (arr[i] == "BC" || arr[i] == "CB" ){
                if (ball == "B") ball ="C";
                else if (ball =="C") ball ="B";
            }
            if (arr[i] == "CA" || arr[i] == "AC" ){
                if (ball == "C") ball ="A";
                else if (ball =="A") ball ="C";
            }
        }

        return ball;
    }

//    public static String cupSwapping(String[] cups) {
//        String cup = "B";
//        for (String s : cups) {
//            if (!s.toUpperCase().contains(cup))
//                return cup;
//            else {
//                cup = s.toUpperCase().replace(cup, "");
//            }
//        }
//        return cup;
//    }

    public static void main(String[] args) {
        String[] arr = {"AB" , "CA"}; // C
        String[] arr1 = {"AC", "AB", "CA", "AC"}; // B
        String[] arr2 = {"BA", "AC", "CA", "BC"}; // A

        System.out.println(cupSwapping(arr));
        System.out.println(cupSwapping(arr1));
//        System.out.println(cupSwapping(arr2));
    }
}
