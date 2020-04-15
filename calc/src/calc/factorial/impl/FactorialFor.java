package calc.factorial.impl;

import calc.factorial.FactorialCalc;

public class FactorialFor implements FactorialCalc {

    @Override
    public int loop(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

}