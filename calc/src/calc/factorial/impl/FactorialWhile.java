package calc.factorial.impl;

import calc.factorial.FactorialCalc;

public class FactorialWhile implements FactorialCalc {

    @Override
    public int loop(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return result;
    }

}
