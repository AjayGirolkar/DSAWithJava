    package CodingPractice;

    import java.lang.reflect.Array;
    import java.util.Arrays;

    public class BinarySearch {

        public static void main (String[] args) {
            int[] array = {1,5,10,15,20,22};
            int target = 10;
            int expectedIndex = 2;
            System.out.println("index of number " + target +  "  in array " + Arrays.toString(array) + " is at " + indexOfItemInArray(array, target) + " hence given algorithm is " + (expectedIndex == indexOfItemInArray(array, target)));

            int[] descArray = {50, 40, 30, 20, 10};
            int target1 = 20;
            int expectedIndex1 = 3;
            System.out.println("index of number " + target1 +  "  in descending sorted array " + Arrays.toString(descArray) + " is at " + indexOfItemInArray(descArray, target1) + " hence given algorithm is " + (expectedIndex1 == indexOfItemInArray(descArray, target1)));
        }

        //array = {1,5,10,15,20,22}
        static  int indexOfItemInArray(int[] array, int numberToSearch) {

            int start = 0;
            int end = array.length-1;
            boolean isAscending = array[0] < array[end];

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (array[mid] == numberToSearch) {
                    return mid;
                } else if (isAscending) {
                if (numberToSearch < array[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
                } else {
                    if (numberToSearch > array[mid]) {
                        end = mid-1;
                    } else {
                        start = mid+1;
                   }
                }
            }
            return  -1;
        }
    }
