package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
//        Write a program that will display the first n terms of Fibonacci series, each on new line:

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 3; i <= lastFibonacci; i++) {
            nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
