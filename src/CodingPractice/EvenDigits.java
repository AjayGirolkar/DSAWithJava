package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenDigits {

    public static void main(String[] args) {
        int[] demoArray = {1, 20, 121, 5, 8 ,40, 100}; //ans should be {20, 40}
        Object[] evenArray = getEvenDigitsNumbers(demoArray);
        System.out.println("Even array from " + Arrays.toString(demoArray) + " is " + Arrays.toString(evenArray));
    }

    static Object[] getEvenDigitsNumbers(int[] array) {
        Integer[] evenNums = new Integer[0];
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(evenNums));
        for (int num: array) {
            if (even(num)) {
                arrayList.add(num);
            }
        }
        return  arrayList.toArray();
    }

    static  boolean even(int num) {
        int numberOfDigits = digits(num);
        return  (numberOfDigits % 2 == 0);
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
