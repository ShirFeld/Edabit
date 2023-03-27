package Edabit.Java;

import java.util.HashMap;
import java.util.Map;

public class Count_the_Number_of_Duplicate_Character {

    public static int duplicateCount(String str) {
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), 1);
            else map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }
        for (Integer value : map.values()){
            if (value > 1)
                counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCount("Aa"));
    }
}
