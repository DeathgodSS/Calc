package calc;

import calc.factorial.FactorialCalc;
import calc.factorial.impl.*;
import calc.fibonacci.FibonacciCalc;
import calc.fibonacci.impl.*;

import java.util.Arrays;

public class CalcLogic {
    public static String myUltraMethod(int algorithmId, int loopType, int value) {
        int[] arr = new int[value + 1];
        Calculator ob;
        if (algorithmId == 1) {
            ob = fibonacciLoopSelector(loopType);
        } else if (algorithmId == 2) {
            ob = factorialLoopSelector(loopType);
        } else {
            return "unknown algorithm type";
        }
        for (int i = 1; i <= value; i++) {
            arr[i] = ob.loop(i);
        }
        return Arrays.toString(arr);
    }

    private static FibonacciCalc fibonacciLoopSelector(int loopId) {
        FibonacciCalc ob;
        if (loopId == 1) {
            ob = new FibonacciWhile();
        } else if (loopId == 2) {
            ob = new FibonacciDoWhile();
        } else if (loopId == 3) {
            ob = new FibonacciFor();
        } else {
            System.out.println("unknown loop type!");
            ob = null;
        }
        return ob;
    }

    private static FactorialCalc factorialLoopSelector(int loopId) {
        FactorialCalc ob;
        if (loopId == 1) {
            ob = new FactorialWhile();
        } else if (loopId == 2) {
            ob = new FactorialDoWhile();
        } else if (loopId == 3) {
            ob = new FactorialFor();
        } else {
            System.out.println("unknown loop type!");
            ob = null;
        }
        return ob;
    }
}
