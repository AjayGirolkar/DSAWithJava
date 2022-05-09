package CodingPractice;

import java.util.Arrays;

public class RotatingBinarySearch {

    public static void main(String[] args) {

        int[] arrayItems = {10,20,50, 70, 4,7,9};
        int target = 10;
        int result = searchIndexOfArray(arrayItems, target);
        System.out.println("Index of target " + target +  " in given sorted array " + Arrays.toString(arrayItems) + " is " + result);
    }

    static int searchIndexOfArray(int[] array, int target) {
        int pivot = pivot(array);
        if (pivot == -1) {
            return binarySearch(array, target, 0, array.length - 1);
        }

        if (target == array[pivot]) {
            return pivot;
        }

        if (array[0] <= target) {
            return binarySearch(array, target, 0, pivot - 1);
        } else  {
            return binarySearch(array, target, pivot + 1, array.length - 1);
        }
    }

    static int pivot(int[] array) {
           int start = 0;
           int end = array.length - 1;

           while (start <= end) {
               int mid = start + (end - start) / 2;

               if (mid < end && (array[mid] > array[mid + 1])) {
                   return mid;
               }

               if (mid > start && (array[mid] < array[mid - 1])) {
                   return mid -1;
               }

               if (array[mid] < array[start]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;

               }
           }
           return -1;
    }
    static int binarySearch(int[] array, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return  mid;
            }
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
