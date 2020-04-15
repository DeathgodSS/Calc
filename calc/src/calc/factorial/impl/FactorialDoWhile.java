package calc.factorial.impl;

import calc.factorial.FactorialCalc;

public class FactorialDoWhile implements FactorialCalc {

    @Override
    public int loop(int value) {
        int result = 1;
        int i = 1;
        do {
            result *= i;
            i++;
        }
        while (i <= value);
        return result;
    }

}
