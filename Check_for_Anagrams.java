package Edabit;


public class Check_for_Anagrams {

    /*
    Create a function that takes two strings and returns either true or false depending on whether they're anagrams or not.
     */


    public static boolean isAnagram(String str1 ,String str2){

        if (str1.length() != str2.length()) return false;

        String s1 = str1.toUpperCase();
        String s2 = str2.toUpperCase();

        System.out.println("str1 = " + s1);
        System.out.println("str2 = " + s2);


        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains(s1.charAt(i) +""))
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Shiqr", "hivrs")); // false
        System.out.println(isAnagram("Shir", "hirs")); // true
    }
}
