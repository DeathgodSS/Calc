package calc.fibonacci.impl;

import calc.fibonacci.FibonacciCalc;

public class FibonacciWhile implements FibonacciCalc {

    @Override
    public int loop(int value) {
        int secondElement = 0;
        if (value < 3) {
            if (value == 0) {
                return 0;
            } else if (value == 1 || value == 2) {
                return 1;
            }
        } else {
            int i = 3;
            int nullElement = 1;
            int firstElement = 1;
            while (i <= value) {
                secondElement = nullElement + firstElement;
                nullElement = firstElement;
                firstElement = secondElement;
                i++;
            }
        }
        return secondElement;
    }

}
