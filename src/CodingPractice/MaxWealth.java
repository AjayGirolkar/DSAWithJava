package CodingPractice;

import java.util.Arrays;

public class MaxWealth {

    public static void main(String[] args) {

        int[][] twoDArray= {{1,5,1000}, {30,40,60}, {100, 150, 200}};
        int maxWealth = maximumWealth(twoDArray);
        System.out.println("the max values of array = " + Arrays.toString(twoDArray) + " is " + maxWealth);

    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            int personMaxWealth = 0;
            for (int num: accounts[person]) {
                personMaxWealth += num;
            }
            if (personMaxWealth > maxWealth) {
                maxWealth = personMaxWealth;
            }
        }
        return maxWealth;
    }
}
