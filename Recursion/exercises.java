package Edabit.Recursion;

public class exercises {
    // מהקל למאתגר

    // רקורסיה שמחשבת חזקה
    public static int power(int num , int pow){
        if (pow == 0) return 1;

        return num * power(num , pow-1);
    }

    // רקורסיה שמחשבת כפול
    public static int multi(int num , int x){
        if (x == 0) return 0;

        return num + multi(num , x-1);
    }

    //  רקורסיה שמחשבת סכום של מספר
    public static int sum(int num ){
        if (num ==0) return 0;

        return num%10 + sum(num/10);
    }

    // רקורסיה שמחשבת מספר ספרות זוגיות במספר
    public static int sumEven(int num ){
       if (num == 0 ) return 0;

       return num%2 ==0 ? 1+sumEven(num/10) : sumEven(num/10);
    }

    // רקורסיה שמחשבת עצרת
    public static int myFactorial(int num ){
        if (num == 1) return 1;

        return num * myFactorial(num-1);
    }

    // רקורסיה שמחזירה נכון אם כל הספרות זוגיות
    public static boolean allEven(int num ){
        if (num ==0) return true;

        return (num %2 !=0? false: allEven(num/10));
    }

    // רקורסיה שמקבלת מערך וגודלו ומחזירה את מספר הערכים הזוגיים
    public static int evenArr(int len , int[] arr ){
        if (len == 0) return 0;

        return arr[len-1] %2 ==0 ? evenArr(len-1 , arr) +1 : evenArr(len-1 , arr);
    }


    // רקורסיה המקבלת מערך של מספרים וגודל ומחזירה נכון אם כל הערכים בו זוגיים והפוך
    public static boolean isEvenArr(int len , int[] arr ) {
        if (len > 0) {
            if (arr[len - 1] % 2 != 0) return false;
            else {
                return isEvenArr(len - 1, arr);
            }
        }
        return true;
    }

    // רקורסיה המקבלת מספר וספרה. תחזיר נכון אם הסיפרה מופיעה במספר וההפך
    public static boolean isShown(int num , int digit ){
        if (num > 0) {
            if (num %10 == digit)
                return true;
            else {
                return isShown(num/10 , digit);
            }
        }
        return  false;
    }

    // רקורסיה המקבלת שני מספרים חיובים שלמים. תחזיר את שארית החלוקה של a בb באמצעות חיבור וחיסור בלבד.
    public static int remainder(int a , int b){
        if (a < b) return a;

        return remainder(a-b,b);
    }

    // מספר מתחלף - מספר שבו כל זוג ספרות שכנות הינו בעל זוגיות שונה.
    // כתוב רקורסיה המקבלת מספר שלם חיובי ותחזיר נכון אם הוא מספר מתחלף
    public static boolean isSwitched(int num){
        if (num>10){
            if (num %2 == (num/10)%2) return false;
            return isSwitched(num/10);
        }
    return true;
    }

    // רקורסיה המקבלת מספר חיובי שלם ותחזיר true אם קיים לפחות זוג אחד של ספרות מתחלפות
    public static boolean one(int num){
        if (num > 10){
            if (num %2 != (num/10)%2) return true;
            return one(num/10);
        }
        return false;
    }

    // רקורסיה המקבלת מערך ומוצאת את המספר הקטן ביותר במערך
    public static int min(int[] arr){
     return min(arr , 0);
    }
    static private int min(int arr[] , int i){
        if (arr.length ==i)
            return arr[0];
        int min = min(arr,i+1);
        if (arr[i] < min)
            min = arr[i];
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {4,4,4,8};
        int[] arr2 = {2,1,9};

        System.out.println(power(2,4));
        System.out.println(multi(2,3));
        System.out.println(sum(1234));
        System.out.println(sumEven(1232));
        System.out.println(myFactorial(4));
        System.out.println(allEven(416));
        System.out.println(evenArr(arr.length,arr));
        System.out.println(isEvenArr(arr.length,arr));
        System.out.println(isShown(123,3));
        System.out.println(remainder(5,2));
        System.out.println(isSwitched(123));
        System.out.println(one(1123));
        System.out.println(min(arr2));
    }
}
