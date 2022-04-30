package CodingPractice;

public class Fibonacci {

    public static void main(String[] args) {
        int num = Fibonacci(2);
        System.out.println("Fibonacci number 2 is " + num);
        System.out.println("Fibonacci number 3 is " + Fibonacci(3));
        System.out.println("Fibonacci number 4 is " + Fibonacci(4));
        System.out.println("Fibonacci number 5 is " + Fibonacci(5));

    }

    static int Fibonacci(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i <= number; i++) {
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return firstNumber;
    }
}
