import CodingPractice.LinerSearch;
import CodingPractice.TwoDimentionalArray;
import java.util.Arrays;

public class Array {

    static void  executeArrayClass() {
        executeMultidimentionalArray();
        LinerSearch.execute();

    }

    public  static void executeMultidimentionalArray() {

        int multiDimentionalArray[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < multiDimentionalArray.length; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(multiDimentionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
