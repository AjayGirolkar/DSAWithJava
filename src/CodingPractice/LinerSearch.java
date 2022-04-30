package CodingPractice;

import java.util.Arrays;

public class LinerSearch {

    public static  void  execute() {

        int[] array = {1,4,5,8,9, 10, 12, 20, 30};
        System.out.println("Printing linear search arrays");
        System.out.println(LinerSearch.linearSearch(array, 30));

        //Check Character in String
        System.out.println("is A is present in Ajay " + isCharacterInString("Ajay", 'A'));
    }

    public static String linearSearch(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return ("Index of number " + element + " in array " + Arrays.toString(array) +  " is at " + i);
            }
        }
        return "Not found";
    }


    public static final Boolean isCharacterInString(String myString, char target) {
        
        if (myString.length() == 0) {
            return  false;
        }

        for (int index = 0; index < myString.length(); index++) {
            if (target == myString.charAt(index)) {
                return  true;
            }
        }
        return  false;
    }
}
