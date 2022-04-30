    package CodingPractice;

    public class CeilingOfNumber {

        public static void main(String[] args) {
            int[] array = {1,2,3,4,10,20,30,40};
            int[] descendingArray = {40, 30, 20, 10, 4, 3, 2, 1};
            int target = 25;
            int nearestNumberOfTarget = ceilingOfNumber(array, target);
            System.out.println("Nearest number greater than or equal to number of " + target + " is " + nearestNumberOfTarget);
        }

        static int ceilingOfNumber(int[] array, int nearestNumberOfTarget) {

            //If neartestNumberOfTarget is less that max number in array
            if (nearestNumberOfTarget > array[array.length-1]) {
                return  -1;
            }
            int start = 0;
            int end = array.length - 1;
            boolean isAscendingArray = array[0] < array[end];

            while (start <= end) {
                int middle = start + (end - start) / 2;

                if( array[middle] == nearestNumberOfTarget) {
                    return  middle;
                }
                //{1,2,3,4,10,20,30,40};
                if (isAscendingArray) {
                    if (nearestNumberOfTarget < array[middle]) {
                        end = middle - 1;
                    } else {
                        start = middle + 1;
                    }
                } else {
                    if (nearestNumberOfTarget > array[middle]) {
                        end = middle - 1;
                    } else {
                        start = middle + 1;
                    }
                }
            }
            return array[start];  // return end to find nearest smallest element  //Q. Find Floor of number
        }
    }
