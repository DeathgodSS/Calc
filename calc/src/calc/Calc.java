package calc;

import calc.factorial.*;
import calc.factorial.impl.*;
import calc.fibonacci.*;
import calc.fibonacci.impl.*;

import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
        CalcLogic calc = new CalcLogic();
        System.out.println(calc.myUltraMethod(1, 3, 11));
    }
}