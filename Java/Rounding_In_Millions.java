package Edabit.Java;

import java.util.Arrays;

public class Rounding_In_Millions {
    /*
    Given an array of cities and populations, return an array where all populations are rounded to the nearest million.
    Round down to 0 if a population is below 500,000.

    example:
        millionsRounding([
      ["Nice", 942208],
      ["Abu Dhabi", 1482816],
      ["Naples", 2186853],
      ["Vatican City", 572]
    ]) ➞ [
      ["Nice", 1000000],
      ["Abu Dhabi", 1000000],
      ["Naples", 2000000],
      ["Vatican City", 0]
    ]
     */

    public static Object[] millionsRounding(Object[] cities) {
        int pop;
        for(int i = 0; i < cities.length; i++) {
            Object[] temp = (Object[]) cities[i]; // arr
            int res = 0;
            pop = (int) temp[1];
            res = ( (int) (pop / 1000000) );
            res *= 1000000;
            if(Math.floorMod(pop, 1000000) > 500000) res += 1000000;
            temp[1] = res;
            cities[i] = temp;
        }
        return cities;
    }

    public static void main(String[] args) {

        Object[] objects = {"shir" , 12};
        System.out.println(Arrays.toString(objects));

    }

}

