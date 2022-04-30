import java.util.Scanner;

public class SwitchStatement {

    public  static  void executeSwitchClass() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        String userInput = input.next();

        switch (userInput) {
            case "Mango":
                System.out.println("This is Yellow");
                break;
            case "Orange":
                System.out.println("This is Orange color");
                break;
            case "Apple":
                System.out.println("This is Red");
                break;
            case "Waterlemon":
                System.out.println("This is Green");
                break;
            default:
                System.out.println("Enter valid furuit");
                System.out.println();
                break;
        }
    }
}
