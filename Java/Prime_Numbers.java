package Edabit.Java;

import java.util.Arrays;

public class Prime_Numbers {

    /*
    Create a function that finds how many prime numbers there are, up to the given integer.
    primeNumbers(10) ➞ 4
    primeNumbers(20) ➞ 8
    primeNumbers(30) ➞ 10
     */



        public static int primeNumbers(int num) {
            int count = 0;
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    count++ ;
                }
            }
            return count;
        }
        public static boolean isPrime(int n){
            for (int i = 2; i < n; i ++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
        System.out.println(primeNumbers(10));
    }

}
