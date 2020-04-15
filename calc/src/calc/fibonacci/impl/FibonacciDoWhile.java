package calc.fibonacci.impl;

import calc.fibonacci.FibonacciCalc;

public class FibonacciDoWhile implements FibonacciCalc {

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
            do {
                secondElement = nullElement + firstElement;
                nullElement = firstElement;
                firstElement = secondElement;
                i++;
            } while (i <= value);
        }
        return secondElement;
    }

}
