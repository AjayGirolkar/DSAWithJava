package CodingPractice;

import java.util.Arrays;

public class TwoDimentionalArray {

    public static void main(String[] args) {

        int target = 34;
        int[][] twoDArray = {
                {5,10,15},
        {14,24,34},
        {50,100,200},
        };
        int[] indexOfTarget = searchInTwoD(twoDArray, target);
        System.out.println("Index of target in two dimentional array");
        System.out.println(Arrays.toString(indexOfTarget));

        System.out.println("Max value in two dimentional array");
        System.out.println(maxInTwoDArray(twoDArray));
    }

    static int[] searchInTwoD(int[][] twoDArray, int target) {

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{0, 0};
    }

    static int maxInTwoDArray(int[][] twoDArray) {
        int max = Integer.MIN_VALUE;

        for (int[] value: twoDArray) {
            for (int element: value) {
                if (max < element) {
                    max = element;
                }
            }
        }
        return  max;
    }
}
