package CodingPractice;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] arrayToSearch = {1,2,5,7,7,7,7,7,8,8, 10, 20};
        int target = 7;
        int[] indexesOfTarget = firstAndLastPosition(arrayToSearch, target);
        System.out.println("Index of target " + target + " in given sorted array " + Arrays.toString(arrayToSearch) + " is " + Arrays.toString(indexesOfTarget));
    }

    static int [] firstAndLastPosition(int[] array, int target) {
        int[] indexesOfTarget = {-1, -1};
        int firstIndex = getIndexInArrayFromBindarySearch(array, target, true);
        int lastIndex =  getIndexInArrayFromBindarySearch(array, target, false);
        indexesOfTarget[0] = firstIndex;
        indexesOfTarget[1] = lastIndex;
        return  indexesOfTarget;
    }

    static int getIndexInArrayFromBindarySearch(int[] array, int target, boolean firstIndex) {
        if (array.length <= 0) {
            return -1;
        }
        int ans = -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
