import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

          //  SwitchStatement.executeSwitchClass();
            Array.executeArrayClass();

            //generalExamples();



            //get Max array
            int[] array = {2,5,60,90,100};
            int maxValueFromArray = getMaxOfArray(array);
            System.out.println("max value" + " in array " + Arrays.toString(array) +  " is " + maxValueFromArray);

        }

        static  void  generalExamples() {
            System.out.println("Hello world!");

            String myname = "Ajay";
            int age = 28;
            String fullName = myname + "Girolkar";
            System.out.println(fullName);
            System.out.println(age);
        }

            public static int getMaxOfArray(int[] array) {
            if (array.length == 0) {
                return -1;
                }
            int max = array[0];
                for (int i = 0; i < array.length; i++) {
                   if (array[i] < max) {
                       max = array[i];
                    }
                }
            return max;
            }
}