package Edabit.Java;

import java.util.HashMap;

public class PhoneNumberWordDecoder {
    /*
    Create a program that converts a phone number with letters to one with only numbers.
    Examples
    textToNum("123-647-EYES") ➞ "123-647-3937"
     */

    public static String textToNum(String str){

        HashMap<Integer,String > hashMap = new HashMap<>();
        hashMap.put(0,"none");
        hashMap.put(1,"none");
        hashMap.put(2,"ABC");
        hashMap.put(3,"DEF");
        hashMap.put(4,"GHI");
        hashMap.put(5,"JKL");
        hashMap.put(6,"MNO");
        hashMap.put(7,"PQRS");
        hashMap.put(8,"TUV");
        hashMap.put(9,"WXYZ");

        String returnString ="";

        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) > 'A' && str.charAt(i) < 'Z'){     // Its a letter
               for (Integer key : hashMap.keySet()) {
                   if (hashMap.get(key).contains("" +str.charAt(i))){
                       returnString+=key;
                   }
               }
           }
           else returnString+=str.charAt(i);

        }
        return returnString;
    }

    public static void main(String[] args) {
        System.out.print(textToNum("123-647-EYES"));
    }
}
